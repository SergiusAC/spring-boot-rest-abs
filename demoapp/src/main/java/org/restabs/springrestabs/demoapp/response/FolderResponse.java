package org.restabs.springrestabs.demoapp.response;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
@Builder(toBuilder = true)
public class FolderResponse implements Serializable {
    private Long id;
    private String folderName;
    private Date createdDate;
    private Date modifiedDate;
}
