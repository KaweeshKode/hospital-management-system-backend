package edu.icet.crm.repository;

import edu.icet.crm.entity.AppointmentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AppointmentRepository extends JpaRepository<AppointmentEntity, Integer> {

    Iterable<Object> findByType(String type);

    List<AppointmentEntity> findByPatientId(Integer patientId);

    Iterable<Object> findByAdminId(Integer id);
}
