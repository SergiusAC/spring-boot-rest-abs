package org.restabs.springbootrestabs.service.impl;

import org.restabs.springbootrestabs.entity.IEntity;
import org.restabs.springbootrestabs.exception.*;
import org.restabs.springbootrestabs.repo.IOneLvlCrudRepo;
import org.restabs.springbootrestabs.service.IOneLvlCrudService;

import java.util.List;
import java.util.Optional;

public class AbsOneLvlCrudService<EntityType extends IEntity<PkType>, PkType> implements IOneLvlCrudService<EntityType, PkType> {

    private final IOneLvlCrudRepo<EntityType, PkType> repo;

    public AbsOneLvlCrudService(IOneLvlCrudRepo<EntityType, PkType> repo) {
        this.repo = repo;
    }

    @Override
    public List<EntityType> getAll() {
        return repo.findAll();
    }

    @Override
    public EntityType getById(PkType id) {
        if (id == null) {
            throw new NullPrimaryKeyInGetByIdException();
        }
        Optional<EntityType> entity = repo.findById(id);
        if (!entity.isPresent()) {
            throw new NotFoundByPrimaryKeyInGetByIdException(id);
        }
        return entity.get();
    }

    @Override
    public EntityType create(EntityType entity) {
        return repo.save(entity);
    }

    @Override
    public EntityType update(EntityType entity) {
        if (entity.getPrimaryKey() == null) {
            throw new NullPrimaryKeyInUpdateException();
        }
        Optional<EntityType> foundEntity = repo.findById(entity.getPrimaryKey());
        if (!foundEntity.isPresent()) {
            throw new NotFoundByPrimaryKeyInUpdateException(entity.getPrimaryKey());
        }
        return repo.save(entity);
    }

    @Override
    public EntityType deleteById(PkType id) {
        if (id == null) {
            throw new NullPrimaryKeyInDeleteException();
        }
        Optional<EntityType> foundEntity = repo.findById(id);
        if (!foundEntity.isPresent()) {
            throw new NotFoundByPrimaryKeyInDeleteException(id);
        }
        repo.deleteById(id);
        return foundEntity.get();
    }
}
