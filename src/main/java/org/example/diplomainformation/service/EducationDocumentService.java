package org.example.diplomainformation.service;

import org.example.diplomainformation.model.EducationDocument;
import org.example.diplomainformation.repository.EducationDocumentRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class EducationDocumentService {
    private final EducationDocumentRepository educationDocumentRepository;

    @Autowired
    public EducationDocumentService(EducationDocumentRepository educationDocumentRepository) {
        this.educationDocumentRepository = educationDocumentRepository;
    }

    public EducationDocument getDocumentById(Long id) {
        return educationDocumentRepository.findById(id).orElse(null);
    }

    public EducationDocument saveDocument(EducationDocument document) {
        return educationDocumentRepository.save(document);
    }

    public void deleteDocument(Long id) {
        educationDocumentRepository.deleteById(id);
    }
}
