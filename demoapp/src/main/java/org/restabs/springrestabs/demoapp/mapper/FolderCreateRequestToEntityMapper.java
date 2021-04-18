package org.restabs.springrestabs.demoapp.mapper;

import org.restabs.springbootrestabs.mapper.IDataMapper;
import org.restabs.springrestabs.demoapp.entity.Folder;
import org.restabs.springrestabs.demoapp.request.FolderCreateRequest;

public class FolderCreateRequestToEntityMapper implements IDataMapper<FolderCreateRequest, Folder> {

    @Override
    public Folder map(FolderCreateRequest source) {
        return Folder.builder().folderName(source.getFolderName()).build();
    }
}
