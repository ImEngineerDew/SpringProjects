package com.toadsdewin.Hospital.DoctorController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/doctor")
public class DoctorController implements  DoctorControllerInterface
{
    @Override
    public ResponseEntity<String> answerPage()
    {
        return ResponseEntity.ok("The webpage has been loaded");
    }
}
