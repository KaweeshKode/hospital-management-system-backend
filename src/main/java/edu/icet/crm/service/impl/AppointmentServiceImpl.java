package edu.icet.crm.service.impl;

import edu.icet.crm.dto.Appointment;
import edu.icet.crm.entity.AppointmentEntity;
import edu.icet.crm.repository.AppointmentRepository;
import edu.icet.crm.service.AppointmentService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class AppointmentServiceImpl implements AppointmentService {

    final AppointmentRepository repository;
    final ModelMapper mapper;

    @Override
    public void addAppointment(Appointment appointment) {
        log.info(appointment.toString());
        repository.save(mapper.map(appointment, AppointmentEntity.class));
    }

    @Override
    public Boolean deleteById(Integer id) {
        repository.deleteById(id);
        return true;
    }

    @Override
    public List<Appointment> getAppointment() {
        List<Appointment> appointmentList = new ArrayList<>();
        repository.findAll().forEach(appointment -> appointmentList.add(mapper.map(appointment, Appointment.class)));
        return appointmentList;
    }

    @Override
    public List<Appointment> findByPatientId(Integer patientId) {
        List<Appointment> appointmentList = new ArrayList<>();
        repository.findByPatientId(patientId).forEach(appointment -> appointmentList.add(mapper.map(appointment, Appointment.class)));
        return appointmentList;
    }

}
