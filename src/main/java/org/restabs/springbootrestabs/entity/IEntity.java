package org.restabs.springbootrestabs.entity;

/**
 * IEntity
 *
 * @param <PkType>
 */
public interface IEntity<PkType> {

    /**
     * Returns primary key of an entity
     *
     * @return primary key
     */
    PkType getPrimaryKey();
}
