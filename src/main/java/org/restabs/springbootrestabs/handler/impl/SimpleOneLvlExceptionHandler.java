package org.restabs.springbootrestabs.handler.impl;

import org.restabs.springbootrestabs.exception.*;
import org.restabs.springbootrestabs.handler.IOneLvlExceptionHandler;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

public class SimpleOneLvlExceptionHandler implements IOneLvlExceptionHandler {

    @Override
    public <T> T catchNullPrimaryKeyInGetById(NullPrimaryKeyInGetByIdException exception) {
        throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Provided ID is null");
    }

    @Override
    public <T> T catchNotFoundByPrimaryKeyInGetById(NotFoundByPrimaryKeyInGetByIdException exception) {
        throw new ResponseStatusException(HttpStatus.NOT_FOUND, String.format("Nothing found with ID '%s'", exception.getId()));
    }

    @Override
    public <T> T catchNullPrimaryKeyInUpdate(NullPrimaryKeyInUpdateException exception) {
        throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Provided ID is null");
    }

    @Override
    public <T> T catchNotFoundByPrimaryKeyInUpdate(NotFoundByPrimaryKeyInUpdateException exception) {
        throw new ResponseStatusException(HttpStatus.NOT_FOUND, String.format("Nothing found with ID '%s' to update", exception.getId()));
    }

    @Override
    public <T> T catchNullPrimaryKeyInDelete(NullPrimaryKeyInDeleteException exception) {
        throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Provided ID is null");
    }

    @Override
    public <T> T catchNotFoundByPrimaryKeyInDelete(NotFoundByPrimaryKeyInDeleteException exception) {
        throw new ResponseStatusException(HttpStatus.NOT_FOUND, String.format("Nothing found with ID '%s' to delete", exception.getId()));
    }

    @Override
    public <T> T catchDefault(Exception exception) {
        throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, "Something went wrong");
    }
}
