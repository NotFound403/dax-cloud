package cn.felord.common.entity.securityserver.dto;

import java.io.Serializable;

/**
 * @author dax.
 * @version v1.0
 * @since 2017/11/29 13:53
 */

public class ResourceDTO implements Serializable {


    private static final long serialVersionUID = -4088697442177914747L;
    private String resourceName;
    private String uri;
    private String parentId;
    private Integer sort;
    private String description;

    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "{" +
                "resourceName:" + resourceName +
                ", uri:" + uri +
                ", parentId:" + parentId +
                ", sort:" + sort +
                ", description:" + description +
                '}';
    }
}
