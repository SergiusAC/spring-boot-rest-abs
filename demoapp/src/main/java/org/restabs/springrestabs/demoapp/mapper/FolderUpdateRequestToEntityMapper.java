package org.restabs.springrestabs.demoapp.mapper;

import org.restabs.springbootrestabs.mapper.IUpdateDataMapper;
import org.restabs.springrestabs.demoapp.entity.Folder;
import org.restabs.springrestabs.demoapp.request.FolderUpdateRequest;

public class FolderUpdateRequestToEntityMapper implements IUpdateDataMapper<FolderUpdateRequest, Folder> {

    @Override
    public Folder map(FolderUpdateRequest source, Folder basis) {
        Folder.FolderBuilder resultBuilder = basis.toBuilder();
        if (source.getFolderName() != null) {
            resultBuilder.folderName(source.getFolderName());
        }
        return resultBuilder.build();
    }
}
