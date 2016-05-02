package com.guchunhui.model;

import org.springframework.web.multipart.MultipartFile;

import java.io.Serializable;

/**
 * Created by gch on 16-4-28.
 */
public class UpLoadedFile implements Serializable {
    private static final long serialVersionUID = 72348L;
    private MultipartFile multipartFile;

    public MultipartFile getMultipartFile() {
        return multipartFile;
    }

    public void setMultipartFile(MultipartFile multipartFile) {
        this.multipartFile = multipartFile;
    }
}
