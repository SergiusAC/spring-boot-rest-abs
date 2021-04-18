package org.restabs.springbootrestabs.exception;

public class NotFoundByPrimaryKeyInDeleteException extends RuntimeException {

    private final Object id;

    public NotFoundByPrimaryKeyInDeleteException(Object id) {
        this.id = id;
    }

    public Object getId() {
        return id;
    }
}
