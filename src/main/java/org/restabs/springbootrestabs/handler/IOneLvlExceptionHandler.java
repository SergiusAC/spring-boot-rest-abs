package org.restabs.springbootrestabs.handler;

import org.restabs.springbootrestabs.exception.*;

public interface IOneLvlExceptionHandler {
    <T> T catchNullPrimaryKeyInGetById(NullPrimaryKeyInGetByIdException exception);
    <T> T catchNotFoundByPrimaryKeyInGetById(NotFoundByPrimaryKeyInGetByIdException exception);
    <T> T catchNullPrimaryKeyInUpdate(NullPrimaryKeyInUpdateException exception);
    <T> T catchNotFoundByPrimaryKeyInUpdate(NotFoundByPrimaryKeyInUpdateException exception);
    <T> T catchNullPrimaryKeyInDelete(NullPrimaryKeyInDeleteException exception);
    <T> T catchNotFoundByPrimaryKeyInDelete(NotFoundByPrimaryKeyInDeleteException exception);
    <T> T catchDefault(Exception exception);
}
