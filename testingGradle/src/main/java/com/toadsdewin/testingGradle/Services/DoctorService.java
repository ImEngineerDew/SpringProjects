package com.toadsdewin.testingGradle.Services;
import com.toadsdewin.testingGradle.Models.Doctor;
import com.toadsdewin.testingGradle.Repositories.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;

@Service
public class
DoctorService
{
    @Autowired
    DoctorRepository doctorRepository;

    public ArrayList<Doctor> getAll()
    {
        return (ArrayList<Doctor>) this.doctorRepository.findAll();
    }
    public Doctor saveDoctor(Doctor doctor)
    {
        return this.doctorRepository.save(doctor);
    }
    public Doctor getById(Long id)
    {
        return this.doctorRepository.getById(id);
    }

    public Doctor upgradeDoctor(Doctor doctor, Long id)
    {
        return this.doctorRepository.findById(id).map(
                doctorModel -> {
                    doctorModel.setFirstName(doctor.getFirstName());
                    doctorModel.setLastName(doctor.getLastName());
                    doctorModel.setAge(doctor.getAge());
                    doctorModel.setCountry(doctor.getCountry());
                    doctorModel.setDNI(doctor.getDNI());

                    return doctorRepository.save(doctorModel);
                }
        ).orElse(null);
    }
}
