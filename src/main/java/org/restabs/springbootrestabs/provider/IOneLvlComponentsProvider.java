package org.restabs.springbootrestabs.provider;

import org.restabs.springbootrestabs.entity.IEntity;
import org.restabs.springbootrestabs.mapper.IDataMapper;
import org.restabs.springbootrestabs.mapper.IUpdateDataMapper;
import org.restabs.springbootrestabs.service.IOneLvlCrudService;

import java.util.List;

public interface IOneLvlComponentsProvider<EntityType extends IEntity<PkType>, PkType, ResponseType, ResponseListType, CreateRequestType, UpdateRequestType> {
    IOneLvlCrudService<EntityType, PkType> getCrudService();
    IDataMapper<EntityType, ResponseType> getEntityToResponseMapper();
    IDataMapper<List<EntityType>, ResponseListType> getEntityListToResponseMapper();
    IDataMapper<CreateRequestType, EntityType> getCreateRequestToEntityMapper();
    IUpdateDataMapper<UpdateRequestType, EntityType> getUpdateRequestToEntityMapper();
}
