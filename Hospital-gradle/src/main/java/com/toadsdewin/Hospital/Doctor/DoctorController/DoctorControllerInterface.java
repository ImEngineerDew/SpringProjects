package com.toadsdewin.Hospital.Doctor.DoctorController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

public interface DoctorControllerInterface
{
    @GetMapping(path="/")
    ResponseEntity<String> answerPage();

    @GetMapping(path = "all")
    ResponseEntity<?> getAllDoctors();

}
