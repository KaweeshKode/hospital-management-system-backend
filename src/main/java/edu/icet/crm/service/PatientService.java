package edu.icet.crm.service;

import edu.icet.crm.dto.Patient;

import java.util.List;

public interface PatientService {
    List<Patient> getPatient();

    void addPatient(Patient patient);

    void deleteById(Integer id);

    List<Patient> findByName(String name);

    List<Patient> findByAddress(String address);

    List<Patient> findByNic(String nic);

    List<Patient> findByContact(String contact);

    List<Patient> searchByCategory(String category);

    List<Patient> searchByBloodGroup(String bloodGroup);
}
