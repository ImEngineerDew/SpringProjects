package com.toadsdewin.Hospital.Patient.PatientRepo;
import com.toadsdewin.Hospital.Patient.PatientModel.PatientModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface PatientRepositoryInterface extends JpaRepository<PatientModel,Long>
{
    List<PatientModel> findByGender(String gender);
}
