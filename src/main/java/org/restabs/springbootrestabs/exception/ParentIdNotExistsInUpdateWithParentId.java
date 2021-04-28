package org.restabs.springbootrestabs.exception;

public class ParentIdNotExistsInUpdateWithParentId extends RuntimeException {

    private final Object parentId;
    private final Object entity;

    public ParentIdNotExistsInUpdateWithParentId(Object parentId, Object entity) {
        this.parentId = parentId;
        this.entity = entity;
    }

    public Object getParentId() {
        return parentId;
    }

    public Object getEntity() {
        return entity;
    }
}
