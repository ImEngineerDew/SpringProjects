package com.toadsdewin.testingGradle.Repositories;
import com.toadsdewin.testingGradle.Models.Doctor;
import com.toadsdewin.testingGradle.Models.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DoctorRepository extends JpaRepository<Doctor,Long>
{}
