CREATE TABLE company
(
  companyId   VARCHAR(64)  NOT NULL
    PRIMARY KEY,
  companyName VARCHAR(32)  NOT NULL,
  description VARCHAR(256) NULL,
  CONSTRAINT company_companyId_uindex
  UNIQUE (companyId)
)
  COMMENT '公司表';

CREATE TABLE permission
(
  permissionId VARCHAR(64) NOT NULL
    PRIMARY KEY,
  resourceId   VARCHAR(64) NOT NULL,
  type         VARCHAR(16) NOT NULL
  COMMENT '操作许可类型',
  CONSTRAINT permisson_permissonId_uindex
  UNIQUE (permissionId)
);

CREATE TABLE resource
(
  resourceId   VARCHAR(64)             NOT NULL
    PRIMARY KEY,
  resourceName VARCHAR(64)             NOT NULL,
  uri          VARCHAR(128)            NULL
  COMMENT '可操作的uri',
  parentId     VARCHAR(32) DEFAULT '0' NULL,
  sort         INT                     NULL,
  enabled      CHAR                    NOT NULL,
  description  VARCHAR(128)            NULL,
  createTime   DATETIME                NULL,
  createUser   VARCHAR(64)             NULL,
  updateTime   DATETIME                NULL,
  updateUser   VARCHAR(64)             NULL,
  CONSTRAINT resource_resourceId_uindex
  UNIQUE (resourceId)
)
  COMMENT '资源表';

CREATE TABLE role
(
  roleId      VARCHAR(64)  NOT NULL
    PRIMARY KEY,
  roleName    VARCHAR(16)  NOT NULL,
  parentId    VARCHAR(64)  NULL
  COMMENT '父角色id
	',
  enabled     CHAR         NOT NULL,
  description VARCHAR(128) NULL,
  createTime  DATETIME     NULL,
  createUser  VARCHAR(64)  NULL,
  updateTime  DATETIME     NULL,
  updateUser  VARCHAR(64)  NULL,
  CONSTRAINT role_roleId_uindex
  UNIQUE (roleId)
)
  COMMENT '角色';

CREATE TABLE role_permission
(
  rolePermissionId VARCHAR(64) NOT NULL
    PRIMARY KEY,
  roleId           VARCHAR(64) NOT NULL,
  permissionId     VARCHAR(64) NOT NULL,
  CONSTRAINT role_permisson_rolePermissonId_uindex
  UNIQUE (rolePermissionId)
)
  COMMENT '角色许可表';

CREATE TABLE user_info
(
  userId     VARCHAR(64)  NOT NULL
    PRIMARY KEY,
  userName   VARCHAR(16)  NOT NULL,
  password   VARCHAR(128) NOT NULL,
  createUser VARCHAR(64)  NULL,
  companyId  VARCHAR(64)  NULL,
  createTime DATETIME     NULL,
  updateTime DATETIME     NULL,
  updateUser VARCHAR(64)  NULL,
  enabled    CHAR         NOT NULL,
  CONSTRAINT user_userId_uindex
  UNIQUE (userId)
)
  COMMENT '系统用户';

CREATE TABLE user_role
(
  userRoleId VARCHAR(64) NOT NULL
    PRIMARY KEY,
  userId     VARCHAR(64) NOT NULL,
  roleId     VARCHAR(64) NOT NULL,
  enabled    CHAR        NOT NULL,
  createTime DATETIME    NULL,
  createUser DATETIME    NULL,
  CONSTRAINT userRole_userRoleId_uindex
  UNIQUE (userRoleId)
)
  COMMENT '用户角色关系表';

