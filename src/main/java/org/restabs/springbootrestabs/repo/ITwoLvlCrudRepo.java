package org.restabs.springbootrestabs.repo;

import org.restabs.springbootrestabs.entity.IEntity;

import java.util.List;
import java.util.Optional;

public interface ITwoLvlCrudRepo<ParentPkType, EntityType extends IEntity<PkType>, PkType> {
    List<EntityType> findAllByParentId(ParentPkType parentId);
    Optional<EntityType> findByParentIdAndId(ParentPkType parentId, PkType id);
    EntityType save(EntityType entity);
    void deleteByParentIdAndId(ParentPkType parentId, PkType id);
    boolean parentIdExists(ParentPkType parentId);
}
