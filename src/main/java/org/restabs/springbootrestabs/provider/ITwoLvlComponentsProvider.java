package org.restabs.springbootrestabs.provider;

import org.restabs.springbootrestabs.entity.IEntity;
import org.restabs.springbootrestabs.service.ITwoLvlCrudService;

public interface ITwoLvlComponentsProvider<ParentPkType, EntityType extends IEntity<PkType>, PkType, ResponseType, ResponseListType, CreateRequestType, UpdateRequestType>
        extends IOneLvlComponentsProvider<EntityType, PkType, ResponseType, ResponseListType, CreateRequestType, UpdateRequestType> {

    ITwoLvlCrudService<ParentPkType, EntityType, PkType> getTwoLvlCrudService();

}
