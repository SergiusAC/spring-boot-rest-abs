package org.restabs.springbootrestabs.controller;

import org.springframework.http.ResponseEntity;

public interface IOneLvlCrudController<PkType, ResponseType, ResponseListType, CreateRequestType, UpdateRequestType> {
    ResponseEntity<?> getAll();
    ResponseEntity<?> getById(PkType id);
    ResponseEntity<?> create(CreateRequestType request);
    ResponseEntity<?> update(PkType id, UpdateRequestType request);
    ResponseEntity<?> deleteById(PkType id);
}
