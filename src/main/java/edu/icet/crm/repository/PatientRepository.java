package edu.icet.crm.repository;

import edu.icet.crm.entity.PatientEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PatientRepository extends JpaRepository<PatientEntity, Integer> {
    List<PatientEntity> findByName(String name);

    List<PatientEntity> findByAddress(String address);

    List<PatientEntity> findByNic(String nic);

    List<PatientEntity> findByContact(String contact);
}
