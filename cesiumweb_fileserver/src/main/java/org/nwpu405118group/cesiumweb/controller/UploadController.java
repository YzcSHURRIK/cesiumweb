package org.nwpu405118group.cesiumweb.controller;


import org.nwpu405118group.cesiumweb.service.UploadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

/**
 * 文件上传
 */
@RestController
@RequestMapping("/upload")
@CrossOrigin
public class UploadController {

    @Autowired
    private UploadService uploadService;

    @PostMapping("/image")
    public ResponseEntity<String> uploadImage(
            @RequestParam("file") MultipartFile file) {

        String url = uploadService.uploadImage(file);
        if (StringUtils.isEmpty(url)) {
            return ResponseEntity.badRequest().build();
        }

        return ResponseEntity.ok(url);
    }

}
