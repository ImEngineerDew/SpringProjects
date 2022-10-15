package com.toadsdewin.Hospital.Doctor.DoctorModel;

import com.toadsdewin.Hospital.Patient.PatientModel;

import javax.persistence.*;

@Entity
@Table(name = "doctor")
public class DoctorModel
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column (unique = true, nullable = false)
    private Long id;

    private String name;
    private String surname;
    private String specializationType;

    private String countryOfOrigin;
    private Integer wages;
    private PatientModel patient;

    public PatientModel getPatient() {
        return patient;
    }

    public void setPatient(PatientModel patient) {
        this.patient = patient;
    }

    public DoctorModel()
    {
        //Empty constructor
    }
    public DoctorModel(Long id,String name, String surname, String countryOfOrigin, String specializationType, Integer wages)
    {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.countryOfOrigin = countryOfOrigin;
        this.specializationType = specializationType;
        this.wages = wages;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSpecializationType() {
        return specializationType;
    }

    public void setSpecializationType(String specializationType) {
        this.specializationType = specializationType;
    }

    public Integer getWages() {
        return wages;
    }

    public void setWages(Integer wages) {
        this.wages = wages;
    }

    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    public void setCountryOfOrigin(String countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
    }
}
