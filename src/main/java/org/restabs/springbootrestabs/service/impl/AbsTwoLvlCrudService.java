package org.restabs.springbootrestabs.service.impl;

import org.restabs.springbootrestabs.entity.IEntity;
import org.restabs.springbootrestabs.exception.*;
import org.restabs.springbootrestabs.repo.ITwoLvlCrudRepo;
import org.restabs.springbootrestabs.service.ITwoLvlCrudService;

import java.util.List;
import java.util.Optional;

public abstract class AbsTwoLvlCrudService<ParentPkType, EntityType extends IEntity<PkType>, PkType>
        implements ITwoLvlCrudService<ParentPkType, EntityType, PkType> {

    private final ITwoLvlCrudRepo<ParentPkType, EntityType, PkType> repo;

    public AbsTwoLvlCrudService(ITwoLvlCrudRepo<ParentPkType, EntityType, PkType> repo) {
        this.repo = repo;
    }

    @Override
    public List<EntityType> getAllByParentId(ParentPkType parentId) {
        if (parentId == null) {
            throw new NullParentPkInGetAllByParentId();
        }
        return repo.findAllByParentId(parentId);
    }

    @Override
    public EntityType getByParentIdAndId(ParentPkType parentId, PkType id) {
        if (parentId == null) {
            throw new NullParentPkInGetByParentIdAndId();
        }
        if (id == null) {
            throw new NullPkInGetByParentIdAndId();
        }
        Optional<EntityType> foundEntity = repo.findByParentIdAndId(parentId, id);
        if (!foundEntity.isPresent()) {
            throw new NotFoundInGetByParentIdAndId(parentId, id);
        }
        return foundEntity.get();
    }

    @Override
    public EntityType createWithParentId(ParentPkType parentId, EntityType entity) {
        if (parentId == null) {
            throw new NullParentPkInCreateWithParentId();
        }
        if (!repo.parentIdExists(parentId)) {
            throw new ParentIdNotExistsInCreateWithParentId(parentId, entity);
        }
        EntityType entityToSave = processCreateWithParentId(parentId, entity);
        return repo.save(entityToSave);
    }

    @Override
    public EntityType updateWithParentId(ParentPkType parentId, EntityType entity) {
        if (parentId == null) {
            throw new NullParentPkInUpdateWithParentId();
        }
        if (!repo.parentIdExists(parentId)) {
            throw new ParentIdNotExistsInUpdateWithParentId(parentId, entity);
        }
        EntityType existingEntity = getByParentIdAndId(parentId, entity.getPrimaryKey());
        EntityType entityToSave = processUpdateWithParentId(parentId, entity, existingEntity);
        return repo.save(entityToSave);
    }

    @Override
    public EntityType deleteByParentIdAndId(ParentPkType parentId, PkType id) {
        EntityType existingEntity = getByParentIdAndId(parentId, id);
        repo.deleteByParentIdAndId(parentId, id);
        return existingEntity;
    }

    public abstract EntityType processCreateWithParentId(ParentPkType parentId, EntityType entity);

    public abstract EntityType processUpdateWithParentId(ParentPkType parentId, EntityType entity, EntityType existingEntity);
}
