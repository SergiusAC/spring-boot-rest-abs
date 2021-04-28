package org.restabs.springrestabs.demoapp.provider;

import org.restabs.springbootrestabs.mapper.IDataMapper;
import org.restabs.springbootrestabs.mapper.IUpdateDataMapper;
import org.restabs.springbootrestabs.provider.IOneLvlComponentsProvider;
import org.restabs.springbootrestabs.service.IOneLvlCrudService;
import org.restabs.springrestabs.demoapp.entity.Folder;
import org.restabs.springrestabs.demoapp.mapper.FolderCreateRequestToEntityMapper;
import org.restabs.springrestabs.demoapp.mapper.FolderListToResponseMapper;
import org.restabs.springrestabs.demoapp.mapper.FolderToResponseMapper;
import org.restabs.springrestabs.demoapp.mapper.FolderUpdateRequestToEntityMapper;
import org.restabs.springrestabs.demoapp.request.FolderCreateRequest;
import org.restabs.springrestabs.demoapp.request.FolderUpdateRequest;
import org.restabs.springrestabs.demoapp.response.FolderListResponse;
import org.restabs.springrestabs.demoapp.response.FolderResponse;
import org.restabs.springrestabs.demoapp.service.FolderService;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class FolderComponentsProvider
        implements IOneLvlComponentsProvider<Folder, Long, FolderResponse, FolderListResponse, FolderCreateRequest, FolderUpdateRequest> {

    private final FolderService folderService;
    private final FolderToResponseMapper folderToResponseMapper;
    private final FolderListToResponseMapper folderListToResponseMapper;

    public FolderComponentsProvider(
            FolderService folderService,
            FolderToResponseMapper folderToResponseMapper,
            FolderListToResponseMapper folderListToResponseMapper) {
        this.folderService = folderService;
        this.folderToResponseMapper = folderToResponseMapper;
        this.folderListToResponseMapper = folderListToResponseMapper;
    }

    @Override
    public IOneLvlCrudService<Folder, Long> getCrudService() {
        return folderService;
    }

    @Override
    public IDataMapper<Folder, FolderResponse> getEntityToResponseMapper() {
        return folderToResponseMapper;
    }

    @Override
    public IDataMapper<List<Folder>, FolderListResponse> getEntityListToResponseMapper() {
        return folderListToResponseMapper;
    }

    @Override
    public IDataMapper<FolderCreateRequest, Folder> getCreateRequestToEntityMapper() {
        return new FolderCreateRequestToEntityMapper();
    }

    @Override
    public IUpdateDataMapper<FolderUpdateRequest, Folder> getUpdateRequestToEntityMapper() {
        return new FolderUpdateRequestToEntityMapper();
    }
}
