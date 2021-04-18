package org.restabs.springrestabs.demoapp.repo;

import org.restabs.springbootrestabs.repo.IOneLvlCrudRepo;
import org.restabs.springrestabs.demoapp.entity.Folder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FolderRepo extends JpaRepository<Folder, Long>, IOneLvlCrudRepo<Folder, Long> {
}
