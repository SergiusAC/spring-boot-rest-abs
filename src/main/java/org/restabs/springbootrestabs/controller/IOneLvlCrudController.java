package org.restabs.springbootrestabs.controller;

import org.springframework.http.ResponseEntity;

public interface IOneLvlCrudController<PkType, ResponseType, ResponseListType, CreateRequestType, UpdateRequestType> {
    ResponseEntity<ResponseListType> getAll();
    ResponseEntity<ResponseType> getById(PkType id);
    ResponseEntity<ResponseType> create(CreateRequestType request);
    ResponseEntity<ResponseType> update(PkType id, UpdateRequestType request);
    ResponseEntity<ResponseType> deleteById(PkType id);
}
