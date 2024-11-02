package edu.icet.crm.service;

import edu.icet.crm.dto.MedicalReport;

import java.util.List;

public interface MedicalReportService {
    void addMedicalReport(MedicalReport medicalReport);
    List<MedicalReport> getMedicalReports();
    Boolean deleteReportById(Integer id);
}
