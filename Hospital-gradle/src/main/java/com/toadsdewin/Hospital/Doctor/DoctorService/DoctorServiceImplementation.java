package com.toadsdewin.Hospital.Doctor.DoctorService;
import com.toadsdewin.Hospital.Doctor.DoctorModel.DoctorModel;
import com.toadsdewin.Hospital.Doctor.DoctorRepository.DoctorRepositoryInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;

@Service
public class DoctorServiceImplementation implements DoctorServiceInterface
{
    @Autowired
    DoctorRepositoryInterface doctorRepository;

    @Override
    public ArrayList<DoctorModel> getDoctors()
    {
        return (ArrayList<DoctorModel>) this.doctorRepository.findAll();
    }
    @Override
    public DoctorModel saveDoctor(DoctorModel doctor) {
        if(doctor.getId() == null)
        {
            return doctorRepository.save(doctor);
        }
        else
        {
            return null;
        }
    }
}
