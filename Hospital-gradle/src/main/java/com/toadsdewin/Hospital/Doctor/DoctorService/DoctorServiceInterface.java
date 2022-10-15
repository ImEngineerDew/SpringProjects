package com.toadsdewin.Hospital.Doctor.DoctorService;
import com.toadsdewin.Hospital.Doctor.DoctorModel.DoctorModel;
import java.util.ArrayList;

public interface DoctorServiceInterface
{
    ArrayList<DoctorModel> getDoctors();
    DoctorModel saveDoctor(DoctorModel doctor);
}
