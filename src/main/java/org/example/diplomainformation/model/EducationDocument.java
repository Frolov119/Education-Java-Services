package org.example.diplomainformation.model;

import javax.persistence.*;
import java.util.Date;


public class EducationDocument {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String documentName;
    private String documentType;
    private String institution;
    private String specialization;
    private Date graduationDate;

    // id
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    // documentName
    public String getDocumentName() {
        return documentName;
    }
    public void setDocumentName(String documentName) {
        this.documentName = documentName;
    }
    // documentType
    public String getDocumentType() {
        return documentType;
    }
    public void setDocumentType(String documentType) {
        this.documentType = documentType;
    }
    // institution
    public String getInstitution() {
        return institution;
    }
    public void setInstitution(String institution) {
        this.institution = institution;
    }
    // specialization
    public String getSpecialization() {
        return specialization;
    }
    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }
    // graduationDate
    public Date getGraduationDate() {
        return graduationDate;
    }
    public void setGraduationDate(Date graduationDate) {
        this.graduationDate = graduationDate;
    }


}
