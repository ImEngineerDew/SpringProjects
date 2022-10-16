package com.toadsdewin.Hospital.Doctor.DoctorController;
import com.toadsdewin.Hospital.Doctor.DoctorModel.DoctorModel;
import com.toadsdewin.Hospital.Doctor.DoctorService.DoctorServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(path = "/api/hospital/doctor")
public class DoctorController implements  DoctorControllerInterface
{
    @Autowired
    DoctorServiceInterface doctorService;

    @Override
    public ResponseEntity<String> answerPage()
    {
        return ResponseEntity.ok("The webpage has been loaded");
    }
    @Override
    public ResponseEntity<?>getAllDoctors()
    {
        ArrayList<DoctorModel> allDoctors = this.doctorService.getDoctors();
        return ResponseEntity.status(HttpStatus.OK).body(allDoctors);
    }
    @Override
    public ResponseEntity<DoctorModel>saveDoctorInfo(@Valid @RequestBody DoctorModel doctor)
    {
        DoctorModel newDoctor = null;
        try
        {
            newDoctor = this.doctorService.saveDoctor(doctor);
        }catch(Exception error)
        {
            error.getMessage();
        }
        return new ResponseEntity<>(newDoctor,HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<Object> getBySpecialization(String specialization) {
        List<DoctorModel> doctorSpecialization = this.doctorService.getSpecialization(specialization);
        boolean isAvailable = doctorSpecialization.isEmpty();

        if(!isAvailable)
        {
            return ResponseEntity.status(HttpStatus.OK).body(doctorSpecialization);
        }
        else
        {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Specialization doesn't found!");
        }
    }
}
