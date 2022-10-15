package com.toadsdewin.Hospital.Doctor.DoctorController;
import com.toadsdewin.Hospital.Doctor.DoctorModel.DoctorModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import javax.validation.Valid;

public interface DoctorControllerInterface
{
    @GetMapping(path="/")
    ResponseEntity<String> answerPage();
    @GetMapping(path = "all")
    ResponseEntity<?> getAllDoctors();
    @PostMapping(path = "/add")
    ResponseEntity<DoctorModel>saveDoctorInfo(@Valid @RequestBody DoctorModel doctor);

}
