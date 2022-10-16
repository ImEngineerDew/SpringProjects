package com.toadsdewin.Hospital.Patient.PatientController;
import com.toadsdewin.Hospital.Patient.PatientModel.PatientModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

public interface PatientControllerInterface
{
    @GetMapping(path="/")
    ResponseEntity<String> answerPage();
    @PostMapping(path = "/add")
    ResponseEntity<PatientModel>saveDoctorInfo(@Valid @RequestBody PatientModel patient);
    @RequestMapping(value ="/query",params = "gender")
    ResponseEntity<Object>getByGender(@RequestParam String gender);
}
