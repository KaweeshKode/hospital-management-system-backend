package edu.icet.crm.controller;

import edu.icet.crm.dto.Appointment;
import edu.icet.crm.service.AppointmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/appointment")
public class AppointmentController {

    final AppointmentService service;

    @PostMapping("/add-appointment")
    @ResponseStatus(HttpStatus.CREATED)
    public void addAppointment(@RequestBody Appointment appointment) {
        service.addAppointment(appointment);
    }

    @PutMapping("update-appointment")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void updateAppointment(@RequestBody Appointment appointment) {
        service.addAppointment(appointment);
    }

    @DeleteMapping("/delete-appointment/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Boolean deleteAppointment(@PathVariable Integer id) {
        return service.deleteById(id);
    }

    @GetMapping("/get-all")
    @ResponseStatus(HttpStatus.OK)
    public List<Appointment> getAllAppointments() {
        return service.getAppointment();
    }

    @GetMapping("/search-by-id/{id}")
    public Appointment searchById(@PathVariable Integer id){
        return service.findById(id);
    }

    @GetMapping("/search-by-type/{type}")
    public List<Appointment> searchByType(@PathVariable String type){
        return service.findByType(type);
    }

    @GetMapping("/search-by-patient-id/{id}")
    @ResponseStatus(HttpStatus.OK)
    public List<Appointment> searchByPatientId(@PathVariable Integer id) {
        return service.findByPatientId(id);
    }

    @GetMapping("/search-by-admin-id/{id}")
    public List<Appointment> searchByAdminId(@PathVariable Integer id){
        return service.findByAdminId(id);
    }
}
