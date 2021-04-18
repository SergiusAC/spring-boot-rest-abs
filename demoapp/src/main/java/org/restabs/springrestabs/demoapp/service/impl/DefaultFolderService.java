package org.restabs.springrestabs.demoapp.service.impl;

import org.restabs.springbootrestabs.service.impl.AbsOneLvlCrudService;
import org.restabs.springrestabs.demoapp.entity.Folder;
import org.restabs.springrestabs.demoapp.repo.FolderRepo;
import org.restabs.springrestabs.demoapp.service.FolderService;
import org.springframework.stereotype.Service;

@Service
public class DefaultFolderService extends AbsOneLvlCrudService<Folder, Long> implements FolderService {

    public DefaultFolderService(FolderRepo folderRepo) {
        super(folderRepo);
    }
}
