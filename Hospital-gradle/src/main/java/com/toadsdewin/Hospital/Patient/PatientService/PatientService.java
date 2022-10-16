package com.toadsdewin.Hospital.Patient.PatientService;

import com.toadsdewin.Hospital.Patient.PatientModel.PatientModel;
import com.toadsdewin.Hospital.Patient.PatientRepo.PatientRepositoryInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class PatientService implements PatientServiceInterface
{
    @Autowired
    PatientRepositoryInterface patientRepository;

    @Override
    public ArrayList<PatientModel> getGender(String gender) {
        return patientRepository.findByGender(gender);
    }
    @Override
    public PatientModel savePatient(PatientModel patient) {
        return patientRepository.save(patient);
    }
}
