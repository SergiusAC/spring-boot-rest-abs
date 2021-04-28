package org.restabs.springbootrestabs.controller.impl;

import org.restabs.springbootrestabs.controller.IOneLvlCrudController;
import org.restabs.springbootrestabs.entity.IEntity;
import org.restabs.springbootrestabs.provider.IOneLvlComponentsProvider;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.List;

public class AbsOneLvlCrudController<EntityType extends IEntity<PkType>, PkType, ResponseType, ResponseListType, CreateRequestType, UpdateRequestType>
        implements IOneLvlCrudController<PkType, ResponseType, ResponseListType, CreateRequestType, UpdateRequestType> {

    private final IOneLvlComponentsProvider<EntityType, PkType, ResponseType, ResponseListType, CreateRequestType, UpdateRequestType> provider;

    public AbsOneLvlCrudController(IOneLvlComponentsProvider<EntityType, PkType, ResponseType, ResponseListType, CreateRequestType, UpdateRequestType> provider) {
        this.provider = provider;
    }

    @Override
    public ResponseEntity<ResponseListType> getAll() {
        List<EntityType> all = provider.getCrudService().getAll();
        ResponseListType response = provider.getEntityListToResponseMapper().map(all);
        return ResponseEntity.ok(response);
    }

    @Override
    public ResponseEntity<ResponseType> getById(PkType id) {
        EntityType entity = provider.getCrudService().getById(id);
        ResponseType response = provider.getEntityToResponseMapper().map(entity);
        return ResponseEntity.ok(response);
    }

    @Override
    public ResponseEntity<ResponseType> create(CreateRequestType request) {
        EntityType entityToCreate = provider.getCreateRequestToEntityMapper().map(request);
        EntityType created = provider.getCrudService().create(entityToCreate);
        ResponseType response = provider.getEntityToResponseMapper().map(created);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @Override
    public ResponseEntity<ResponseType> update(PkType id, UpdateRequestType request) {
        EntityType existingEntity = provider.getCrudService().getById(id);
        EntityType entityToUpdate = provider.getUpdateRequestToEntityMapper().map(request, existingEntity);
        EntityType updated = provider.getCrudService().update(entityToUpdate);
        ResponseType response = provider.getEntityToResponseMapper().map(updated);
        return ResponseEntity.ok(response);
    }

    @Override
    public ResponseEntity<ResponseType> deleteById(PkType id) {
        EntityType deleted = provider.getCrudService().deleteById(id);
        ResponseType response = provider.getEntityToResponseMapper().map(deleted);
        return ResponseEntity.ok(response);
    }
}
