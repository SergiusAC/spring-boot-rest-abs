package org.restabs.springbootrestabs.exception;

public class NotFoundByPrimaryKeyInUpdateException extends RuntimeException {

    private final Object id;

    public NotFoundByPrimaryKeyInUpdateException(Object id) {
        this.id = id;
    }

    public Object getId() {
        return id;
    }
}
