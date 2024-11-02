package edu.icet.crm.controller;

import edu.icet.crm.dto.MedicalReport;
import edu.icet.crm.service.MedicalReportService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/medical-report")
@RequiredArgsConstructor
public class MedicalReportController {
    final MedicalReportService service;

    @PostMapping("/add-report")
    public void addMedicalReport(@RequestBody MedicalReport medicalReport) {
        service.addMedicalReport(medicalReport);
    }

//    @GetMapping("/all-reports")
//    public List<MedicalReport> getMedicalReports() {
//        return service.getMedica
//        lReports();
//    }

    @DeleteMapping("/delete-report/{id}")
    public Boolean deleteMedicalReport(@PathVariable Integer id) {
        return service.deleteReportById(id);
    }
}
