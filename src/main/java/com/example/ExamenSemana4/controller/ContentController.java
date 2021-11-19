package com.example.ExamenSemana4.controller;

import com.example.ExamenSemana4.entity.Content;
import com.example.ExamenSemana4.service.ContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/content")
public class ContentController {
    @Autowired
    ContentService contentService;

    @PostMapping
    public ResponseEntity<Content> addContent(@RequestBody Content content) {
        contentService.addContent(content);
        return ResponseEntity.ok(content);
    }

    @GetMapping("/allcontents")
    public List<Content> getAllContents() {
        return contentService.getAllContents();
    }

    @PutMapping("/updatecontent")
    public ResponseEntity<String> updateContent(@RequestBody Content content) {
        contentService.updateContent(content);
        return ResponseEntity.ok("Actualizacion exitosa");
    }

    @DeleteMapping("/deletecontent")
    public ResponseEntity<Content> deleteContent(@RequestBody Content content) {
        contentService.deleteContent(content);
        return ResponseEntity.ok(content);
    }
}
