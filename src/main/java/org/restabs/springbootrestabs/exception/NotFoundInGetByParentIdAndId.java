package org.restabs.springbootrestabs.exception;

public class NotFoundInGetByParentIdAndId extends RuntimeException {

    private final Object parentId;
    private final Object id;

    public NotFoundInGetByParentIdAndId(Object parentId, Object id) {
        this.parentId = parentId;
        this.id = id;
    }

    public Object getParentId() {
        return parentId;
    }

    public Object getId() {
        return id;
    }
}
