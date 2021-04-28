package org.restabs.springrestabs.demoapp.mapper;

import org.restabs.springbootrestabs.mapper.IDataMapper;
import org.restabs.springrestabs.demoapp.entity.Folder;
import org.restabs.springrestabs.demoapp.response.FolderListResponse;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class FolderListToResponseMapper implements IDataMapper<List<Folder>, FolderListResponse> {

    private final FolderToResponseMapper folderToResponseMapper;

    public FolderListToResponseMapper(FolderToResponseMapper folderToResponseMapper) {
        this.folderToResponseMapper = folderToResponseMapper;
    }

    @Override
    public FolderListResponse map(List<Folder> source) {
        return FolderListResponse.builder()
                .folders(source.stream().map(folderToResponseMapper::map).collect(Collectors.toList()))
                .size(source.size())
                .build();
    }
}
