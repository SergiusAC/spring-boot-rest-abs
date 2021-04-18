package org.restabs.springrestabs.demoapp.mapper;

import org.restabs.springbootrestabs.mapper.IDataMapper;
import org.restabs.springrestabs.demoapp.entity.Folder;
import org.restabs.springrestabs.demoapp.response.FolderResponse;
import org.springframework.stereotype.Component;

@Component
public class FolderToResponseMapper implements IDataMapper<Folder, FolderResponse> {

    @Override
    public FolderResponse map(Folder source) {
        return FolderResponse.builder()
                .id(source.getId())
                .folderName(source.getFolderName())
                .createdDate(source.getCreatedDate())
                .modifiedDate(source.getModifiedDate())
                .build();
    }
}
