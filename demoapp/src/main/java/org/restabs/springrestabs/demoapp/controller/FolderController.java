package org.restabs.springrestabs.demoapp.controller;

import org.restabs.springbootrestabs.controller.impl.AbsOneLvlCrudController;
import org.restabs.springrestabs.demoapp.entity.Folder;
import org.restabs.springrestabs.demoapp.provider.FolderComponentsProvider;
import org.restabs.springrestabs.demoapp.request.FolderCreateRequest;
import org.restabs.springrestabs.demoapp.request.FolderUpdateRequest;
import org.restabs.springrestabs.demoapp.response.FolderListResponse;
import org.restabs.springrestabs.demoapp.response.FolderResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/folders")
public class FolderController
        extends AbsOneLvlCrudController<Folder, Long, FolderResponse, FolderListResponse, FolderCreateRequest, FolderUpdateRequest> {

    public FolderController(FolderComponentsProvider folderComponentsProvider) {
        super(folderComponentsProvider);
    }

    @GetMapping
    @Override
    public ResponseEntity<?> getAll() {
        return super.getAll();
    }

    @GetMapping("/{id}")
    @Override
    public ResponseEntity<?> getById(@PathVariable Long id) {
        return super.getById(id);
    }

    @PostMapping
    @Override
    public ResponseEntity<?> create(@RequestBody @Valid FolderCreateRequest request) {
        return super.create(request);
    }

    @PutMapping("/{id}")
    @Override
    public ResponseEntity<?> update(@PathVariable Long id, @RequestBody @Valid FolderUpdateRequest request) {
        return super.update(id, request);
    }

    @DeleteMapping("/{id}")
    @Override
    public ResponseEntity<?> deleteById(@PathVariable Long id) {
        return super.deleteById(id);
    }
}
