package org.restabs.springbootrestabs.mapper;

public interface IUpdateDataMapper<SourceType, TargetType> {
    TargetType map(SourceType source, TargetType basis);
}
