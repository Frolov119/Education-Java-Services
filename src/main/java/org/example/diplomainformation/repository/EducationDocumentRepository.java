package org.example.diplomainformation.repository;

import org.example.diplomainformation.model.EducationDocument;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface EducationDocumentRepository extends JpaRepository<EducationDocument, Long> {

}
