package cn.felord.common.entity.securityserver.dto;

import java.io.Serializable;
import java.util.List;

/**
 * The type Resource detail.
 *
 * @author dax.
 * @version v1.0
 * @since 2017 /11/29 15:22
 */
public class ResourceDetail implements Serializable {
    private static final long serialVersionUID = 5126125497190279794L;
    private String resourceId;
    private String resourceName;
    private String uri;
    private String parentId;
    private long sort;
    private String description;
    private List<String> permissions;

    /**
     * Gets resource id.
     *
     * @return the resource id
     */
    public String getResourceId() {
        return resourceId;
    }

    /**
     * Sets resource id.
     *
     * @param resourceId the resource id
     */
    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * Gets resource name.
     *
     * @return the resource name
     */
    public String getResourceName() {
        return resourceName;
    }

    /**
     * Sets resource name.
     *
     * @param resourceName the resource name
     */
    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    /**
     * Gets uri.
     *
     * @return the uri
     */
    public String getUri() {
        return uri;
    }

    /**
     * Sets uri.
     *
     * @param uri the uri
     */
    public void setUri(String uri) {
        this.uri = uri;
    }

    /**
     * Gets parent id.
     *
     * @return the parent id
     */
    public String getParentId() {
        return parentId;
    }

    /**
     * Sets parent id.
     *
     * @param parentId the parent id
     */
    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    /**
     * Gets sort.
     *
     * @return the sort
     */
    public long getSort() {
        return sort;
    }

    /**
     * Sets sort.
     *
     * @param sort the sort
     */
    public void setSort(long sort) {
        this.sort = sort;
    }

    /**
     * Gets description.
     *
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets description.
     *
     * @param description the description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    public List<String> getPermissions() {
        return permissions;
    }

    public void setPermissions(List<String> permissions) {
        this.permissions = permissions;
    }

    @Override
    public String toString() {
        return "{" +
                "resourceId:" + resourceId +
                ", resourceName:" + resourceName +
                ", uri:" + uri +
                ", parentId:" + parentId +
                ", sort:" + sort +
                ", description:" + description +
                ", permissions:" + permissions +
                '}';
    }
}
