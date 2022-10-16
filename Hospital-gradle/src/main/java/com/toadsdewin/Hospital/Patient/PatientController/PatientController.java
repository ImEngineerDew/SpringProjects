package com.toadsdewin.Hospital.Patient.PatientController;
import com.toadsdewin.Hospital.Patient.PatientModel.PatientModel;
import com.toadsdewin.Hospital.Patient.PatientService.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/api/hospital/patient")
public class PatientController implements PatientControllerInterface
{
    @Autowired
    PatientService patientService;

    @Override
    public ResponseEntity<String> answerPage() {
        return ResponseEntity.ok("The webpage has been loaded");
    }

    @Override
    public ResponseEntity<PatientModel> savePatientInfo(PatientModel patient) {
        PatientModel newPatient = null;
        try
        {
            newPatient = this.patientService.savePatient(patient);
        }catch(Exception error)
        {
            error.getMessage();
        }
        return new ResponseEntity<>(newPatient, HttpStatus.CREATED);
    }
    @Override
    public ResponseEntity<Object> getByGender(String gender) {
        return null;
    }
}
