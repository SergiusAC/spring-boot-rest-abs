package org.restabs.springbootrestabs.repo;

import org.restabs.springbootrestabs.entity.IEntity;

import java.util.List;
import java.util.Optional;

public interface IOneLvlCrudRepo<EntityType extends IEntity<PkType>, PkType> {
    List<EntityType> findAll();
    Optional<EntityType> findById(PkType id);
    EntityType save(EntityType entity);
    void deleteById(PkType id);
}
