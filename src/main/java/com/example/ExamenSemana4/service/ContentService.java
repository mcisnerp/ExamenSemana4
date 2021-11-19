package com.example.ExamenSemana4.service;

import com.example.ExamenSemana4.entity.Content;
import com.example.ExamenSemana4.repository.ContentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContentService {
    @Autowired
    ContentRepository contentRepository;

    public void addContent(Content content) {
        contentRepository.save(content);
    }

    public List<Content> getAllContents() {
        return (List<Content>) contentRepository.findAll();
    }

    public Content updateContent(Content content) {
        return contentRepository.save(content);
    }

    public void deleteContent(Content content) {
        contentRepository.delete(content);
    }
}
