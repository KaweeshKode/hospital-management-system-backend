package edu.icet.crm.service;

import edu.icet.crm.dto.Appointment;

import java.util.List;

public interface AppointmentService {

    void addAppointment(Appointment appointment);

    Boolean deleteById(Integer id);

    List<Appointment> getAppointment();

    Appointment findById(Integer id);

    List<Appointment> findByType(String type);

    List<Appointment> findByPatientId(Integer id);

    List<Appointment> findByAdminId(Integer id);
}
