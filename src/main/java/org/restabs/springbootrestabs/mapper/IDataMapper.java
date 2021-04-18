package org.restabs.springbootrestabs.mapper;

public interface IDataMapper<SourceType, TargetType> {
    TargetType map(SourceType source);
}
