package com.toadsdewin.Hospital.Patient.PatientModel;
import com.toadsdewin.Hospital.Doctor.DoctorModel.DoctorModel;
import com.toadsdewin.Hospital.Person.PersonModel;

import javax.persistence.*;

@Entity
@Table(name= "patient")
public class PatientModel extends PersonModel
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column (name= "Id",unique = true, nullable = false)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "doctor_id", nullable = false)
    private DoctorModel doctor;
    @Column(name = "género", nullable = false)
    private String gender;

    public PatientModel()
    {
        super();
    }
    public PatientModel(String name, String surname, String countryOfOrigin, Integer age,DoctorModel doctor, String gender)
    {
        super(name,surname,countryOfOrigin,age);
        this.doctor = doctor;
        this.gender = gender;
    }
    public DoctorModel getDoctor() {
        return doctor;
    }
    public String getGender()
    {
        return gender;
    }

    public void setDoctor(DoctorModel doctor) {
        this.doctor = doctor;
    }
    public void setGender(String gender)
    {
        this.gender = gender;
    }
}
