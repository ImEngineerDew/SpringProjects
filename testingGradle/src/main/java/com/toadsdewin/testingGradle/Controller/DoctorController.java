package com.toadsdewin.testingGradle.Controller;
import com.toadsdewin.testingGradle.Models.Doctor;
import com.toadsdewin.testingGradle.Services.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/api/doctor")
public class DoctorController
{
    @Autowired
    DoctorService doctorService;
    
    @GetMapping(path = "/all")
    public ResponseEntity<?> getAll()
    {
        List<Doctor> allDoctors = this.doctorService.getAll();
        boolean checkedDoctors = allDoctors.isEmpty();

        if(checkedDoctors==true)
        {
            System.out.println("The list is empty: ?"+checkedDoctors);
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Nothing to found here!");
        }
        else
        {
            System.out.println(checkedDoctors);
            return ResponseEntity.status(HttpStatus.OK).body(allDoctors);
        }
    }
}
