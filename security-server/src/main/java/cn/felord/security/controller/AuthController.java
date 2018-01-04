package cn.felord.security.controller;

import cn.felord.common.entity.system.Rest;
import cn.felord.common.entity.securityserver.*;
import cn.felord.common.entity.securityserver.dto.ResourceDTO;
import cn.felord.common.entity.securityserver.dto.RoleDTO;
import cn.felord.common.entity.securityserver.dto.UserDTO;
import cn.felord.common.entity.securityserver.dto.UserDetail;
import cn.felord.common.enums.AvailableEnums;
import cn.felord.common.enums.PasswordKeyEnums;
import cn.felord.common.enums.PermissionTypeEnums;
import cn.felord.security.service.*;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.crypto.password.StandardPasswordEncoder;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.*;

/**
 * The   User controller.
 *
 * @author dax.
 * @version v1.0
 * @since 2017 /11/28 11:43
 */
@RestController
@RequestMapping("/auth")
public class AuthController {
    @Resource
    private IUserService iUserService;
    @Resource
    private IRoleService iRoleService;
    @Resource
    private IUserRoleService iUserRoleService;
    @Resource
    private IResourceService iResourceService;
    @Resource
    private IPermissionService iPermissionService;
    @Resource
    private IRolePermissionService iRolePermissionService;

    /**
     * Get user user.
     *
     * @param id the id
     * @return the user
     */
    @PostMapping("/user/{id}")
    public User getUser(@PathVariable("id") String id) {
        return iUserService.selectById(id);
    }

    /**
     * Add user rest.
     *
     * @param userDTO the user dto
     * @return the rest
     */
    @PostMapping("/user/add")
    public Rest addUser(UserDTO userDTO) {

        String companyId = userDTO.getCompanyId();
        String userName = userDTO.getUserName();
        if (checkUser(userName)) {
            return Rest.bad("用户名重复！");
        }

        String rawPassword = userDTO.getPassword();

        PasswordEncoder passwordEncoder = new StandardPasswordEncoder(PasswordKeyEnums.USER_PASSWORD.getKey());
        String encodedPassword = passwordEncoder.encode(rawPassword);

        User user = new User();
        user.setCompanyId(companyId);
        user.setUserName(userName);
        user.setPassword(encodedPassword);
        user.setEnabled(AvailableEnums.ENABLE.getKey());
        user.setCreateTime(new Date());

        iUserService.insert(user);

        return Rest.ok();
    }

    /**
     * Add role rest.
     *
     * @param roleDTO the role dto
     * @return the rest
     */
    @PostMapping("/role/add")
    public Rest addRole(RoleDTO roleDTO) {
        String roleName = roleDTO.getRoleName();
        if (checkRole(roleName)) {
            return Rest.bad("角色名重复！");
        }
        String parentId = roleDTO.getParentId();
        String description = roleDTO.getDescription();

        Role role = new Role();

        role.setRoleName(roleName);
        role.setParentId(parentId);
        role.setDescription(description);
        role.setEnabled(AvailableEnums.ENABLE.getKey());
        role.setCreateTime(new Date());

        iRoleService.insert(role);
        return Rest.ok();
    }

    /**
     * 给用户赋予角色.
     *
     * @param userId the user id
     * @param roleId the role id
     * @return the rest
     */
    @PostMapping("/userRole/add/{userId}/{roleId}")
    public Rest roleGiven(@PathVariable("userId") String userId, @PathVariable("roleId") String roleId) {
        if (checkUserRole(userId)) {
            return Rest.bad("用户已有角色！");
        }

        UserRole userRole = new UserRole();

        userRole.setUserId(userId);
        userRole.setRoleId(roleId);
        userRole.setEnabled(AvailableEnums.ENABLE.getKey());
        userRole.setCreateTime(new Date());

        iUserRoleService.insert(userRole);

        return Rest.ok();
    }

    /**
     * Add resource rest.
     *
     * @param resourceDTO the resource dto
     * @return the rest
     */
    @PostMapping("/resource/add")
    public Rest addResource(ResourceDTO resourceDTO) {
        String resourceName = resourceDTO.getResourceName();
        String uri = resourceDTO.getUri();
        String parentId = resourceDTO.getParentId();
        Integer sort = resourceDTO.getSort();
        String description = resourceDTO.getDescription();

        cn.felord.common.entity.securityserver.Resource resource = new cn.felord.common.entity.securityserver.Resource();

        resource.setResourceName(resourceName);
        resource.setUri(uri);
        resource.setParentId(parentId);
        resource.setSort(sort);
        resource.setDescription(description);
        resource.setCreateTime(new Date());
        iResourceService.insert(resource);

        return Rest.ok();
    }

    @PostMapping("/rolePermission/{roleId}/{permissionId}")
    public Rest addRolePermission(@PathVariable("roleId") String roleId, @PathVariable("permissionId") String permissionId) {
        if (checkRolePermission(roleId, permissionId)) {
            return Rest.bad("用户已有此授权！");
        }
        RolePermission rolePermission = new RolePermission();

        rolePermission.setRoleId(roleId);
        rolePermission.setPermissionId(permissionId);

        iRolePermissionService.insert(rolePermission);
        return Rest.ok();
    }

    /**
     * 对资源 许可 采取一次性许可.
     *
     * @param resourceId the resource id
     * @return the rest
     */
    @PostMapping("/permission/add/{resourceId}")
    public Rest addPermission(@PathVariable("resourceId") String resourceId) {


        if (checkPermission(resourceId)) {
            return Rest.bad("资源权限已设置！");
        }
        Permission createPermission = new Permission();
        createPermission.setResourceId(resourceId);
        createPermission.setType(PermissionTypeEnums.CREATE.name());

        Permission updatePermission = new Permission();
        updatePermission.setResourceId(resourceId);
        updatePermission.setType(PermissionTypeEnums.UPDATE.name());

        Permission deletePermission = new Permission();
        deletePermission.setResourceId(resourceId);
        deletePermission.setType(PermissionTypeEnums.DELETE.name());

        Permission retrievePermission = new Permission();
        retrievePermission.setResourceId(resourceId);
        retrievePermission.setResourceId(PermissionTypeEnums.RETRIEVE.name());

        List<Permission> permissions = new ArrayList<>();

        permissions.add(createPermission);
        permissions.add(updatePermission);
        permissions.add(deletePermission);
        permissions.add(retrievePermission);

        iPermissionService.insertBatch(permissions);
        return Rest.ok();
    }

    @PostMapping("/userdetail/{userId}")
    public UserDetail getUserDetail(@PathVariable("userId") String userId){
        return iUserService.getUserDetail(userId);
    }



    private boolean checkUser(String userName) {
        return Objects.isNull(iUserService.findByName(userName));
    }

    private boolean checkRole(String roleName) {
        return Objects.isNull(iRoleService.findByName(roleName));
    }

    private boolean checkUserRole(String userId) {
        return Objects.isNull(iUserRoleService.check(userId));
    }

    private boolean checkPermission(String resourceId) {
        return Objects.isNull(iPermissionService.findByType(resourceId));
    }

    private boolean checkRolePermission(String roleId, String resourceId) {
        return Objects.isNull(iRolePermissionService.check(roleId, resourceId));
    }
}
