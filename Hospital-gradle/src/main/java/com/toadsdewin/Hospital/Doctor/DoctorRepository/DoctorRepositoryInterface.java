package com.toadsdewin.Hospital.Doctor.DoctorRepository;
import com.toadsdewin.Hospital.Doctor.DoctorModel.DoctorModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DoctorRepositoryInterface extends JpaRepository<DoctorModel,Long> {
}
