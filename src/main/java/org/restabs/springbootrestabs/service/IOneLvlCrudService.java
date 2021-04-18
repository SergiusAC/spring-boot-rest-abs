package org.restabs.springbootrestabs.service;

import org.restabs.springbootrestabs.entity.IEntity;
import org.restabs.springbootrestabs.exception.NotFoundByPrimaryKeyInGetByIdException;

import java.util.List;

public interface IOneLvlCrudService<EntityType extends IEntity<PkType>, PkType> {
    List<EntityType> getAll();
    EntityType getById(PkType id) throws NotFoundByPrimaryKeyInGetByIdException;
    EntityType create(EntityType entity);
    EntityType update(EntityType entity);
    EntityType deleteById(PkType id);
}
