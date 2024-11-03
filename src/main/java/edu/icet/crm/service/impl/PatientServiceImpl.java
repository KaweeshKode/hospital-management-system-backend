package edu.icet.crm.service.impl;

import edu.icet.crm.dto.Patient;
import edu.icet.crm.entity.PatientEntity;
import edu.icet.crm.repository.PatientRepository;
import edu.icet.crm.service.PatientService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class PatientServiceImpl implements PatientService {

    final PatientRepository repository;
    final ModelMapper mapper;


    @Override
    public List<Patient> getPatient() {
        List<Patient> patientList = new ArrayList<>();
        repository.findAll().forEach(patient -> patientList.add(mapper.map(patient, Patient.class)));
        return patientList;
    }

    @Override
    public void addPatient(Patient patient) {
        repository.save(mapper.map(patient, PatientEntity.class));
    }

    @Override
    public void deleteById(Integer id) {
        repository.deleteById(id);
    }

    @Override
    public List<Patient> findByName(String name) {
        List<Patient> patientList = new ArrayList<>();
        repository.findByName(name).forEach(entity -> patientList.add(mapper.map(entity, Patient.class)));
        return patientList;
    }

    @Override
    public List<Patient> findByAddress(String address) {
        List<Patient> patientList = new ArrayList<>();
        repository.findByAddress(address).forEach(entity -> patientList.add(mapper.map(entity, Patient.class)));
        return patientList;
    }

    @Override
    public List<Patient> findByNic(String nic) {
        List<Patient> patientList = new ArrayList<>();
        repository.findByNic(nic).forEach(entity -> patientList.add(mapper.map(entity, Patient.class)));
        return patientList;
    }

    @Override
    public List<Patient> findByContact(String contact) {
        List<Patient> patientList = new ArrayList<>();
        repository.findByContact(contact).forEach(entity -> patientList.add(mapper.map(entity, Patient.class)));
        return patientList;
    }

    @Override
    public List<Patient> searchByCategory(String category) {
        List<Patient> patients = new ArrayList<>();
        repository.findByCategory(category).forEach(entity->{
            patients.add(mapper.map(entity, Patient.class));
        });
        return patients;
    }

    @Override
    public List<Patient> searchByBloodGroup(String bloodGroup) {
        List<Patient> patients = new ArrayList<>();
        repository.findByBloodGroup(bloodGroup).forEach(entity->{
            patients.add(mapper.map(entity, Patient.class));
        });
        return patients;
    }

}
