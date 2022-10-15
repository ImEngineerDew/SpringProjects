package com.toadsdewin.Hospital.DoctorController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

public interface DoctorControllerInterface
{
    @GetMapping(path="/")
    ResponseEntity<String> answerPage();
}
