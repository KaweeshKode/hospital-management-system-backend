package edu.icet.crm.service.impl;

import edu.icet.crm.dto.MedicalReport;
import edu.icet.crm.entity.MedicalReportEntity;
import edu.icet.crm.repository.MedicalReportRepository;
import edu.icet.crm.service.MedicalReportService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class MedicalReportServiceImpl implements MedicalReportService {
    final MedicalReportRepository repository;
    final ModelMapper mapper;

    @Override
    public void addMedicalReport(MedicalReport medicalReport) {
        repository.save(mapper.map(medicalReport, MedicalReportEntity.class));
    }

    @Override
    public List<MedicalReport> getMedicalReports() {
        List<MedicalReport> medicalReportList= new ArrayList<>();
        repository.findAll().forEach(reports -> medicalReportList.add(mapper.map(reports, MedicalReport.class)));
        return medicalReportList;
    }

    @Override
    public Boolean deleteReportById(Integer id) {
        repository.deleteById(id);
        return true;
    }
}
