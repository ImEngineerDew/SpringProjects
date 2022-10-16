package com.toadsdewin.Hospital.Patient.PatientService;
import com.toadsdewin.Hospital.Patient.PatientModel.PatientModel;

import java.util.ArrayList;

public interface PatientServiceInterface
{
    ArrayList<PatientModel> getGender(String gender);
    PatientModel savePatient(PatientModel patient);
}
