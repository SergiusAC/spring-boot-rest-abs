package org.restabs.springbootrestabs.service;

import org.restabs.springbootrestabs.entity.IEntity;

import java.util.List;

public interface ITwoLvlCrudService<ParentPkType, EntityType extends IEntity<PkType>, PkType> {
    List<EntityType> getAllByParentId(ParentPkType parentId);
    EntityType getByParentIdAndId(ParentPkType parentId, PkType id);
    EntityType createWithParentId(ParentPkType parentId, EntityType entity);
    EntityType updateWithParentId(ParentPkType parentId, EntityType entity);
    EntityType deleteByParentIdAndId(ParentPkType parentId, PkType id);
}
