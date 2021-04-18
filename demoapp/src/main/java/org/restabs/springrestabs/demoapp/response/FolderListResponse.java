package org.restabs.springrestabs.demoapp.response;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
@Builder(toBuilder = true)
public class FolderListResponse implements Serializable {
    List<FolderResponse> folders;
    private Integer size;
}
