package edu.icet.crm.repository;

import edu.icet.crm.entity.MedicalReportEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicalReportRepository extends JpaRepository<MedicalReportEntity, Integer> {
}
