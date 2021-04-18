package org.restabs.springbootrestabs.exception;

public class NotFoundByPrimaryKeyInGetByIdException extends RuntimeException {

    private final Object id;

    public NotFoundByPrimaryKeyInGetByIdException(Object id) {
        this.id = id;
    }

    public Object getId() {
        return id;
    }
}
