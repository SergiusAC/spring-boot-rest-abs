package org.restabs.springbootrestabs.exception;

public class ParentIdNotExistsInCreateWithParentId extends RuntimeException {

    private final Object parentId;
    private final Object entity;

    public ParentIdNotExistsInCreateWithParentId(Object parentId, Object entity) {
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
