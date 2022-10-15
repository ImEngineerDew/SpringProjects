package com.toadsdewin.Hospital.Doctor.DoctorService;
import com.toadsdewin.Hospital.Doctor.DoctorModel.DoctorModel;
import java.util.ArrayList;
import java.util.List;

public interface DoctorServiceInterface
{
    ArrayList<DoctorModel> getDoctors();
    DoctorModel saveDoctor(DoctorModel doctor);
    List<DoctorModel> getSpecialization(String specializtion);
}
