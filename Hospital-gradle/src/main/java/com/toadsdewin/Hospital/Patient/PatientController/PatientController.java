package com.toadsdewin.Hospital.Patient.PatientController;

import com.toadsdewin.Hospital.Patient.PatientModel.PatientModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
    public ResponseEntity<PatientModel> saveDoctorInfo(PatientModel patient) {
        return null;
    }

    @Override
    public ResponseEntity<Object> getByGender(String gender) {
        return null;
    }
}
