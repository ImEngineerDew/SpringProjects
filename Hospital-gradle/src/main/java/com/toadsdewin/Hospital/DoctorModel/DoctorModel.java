package com.toadsdewin.Hospital.DoctorModel;

import javax.persistence.*;

@Entity
@Table(name = "doctor")
public class DoctorModel
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column (unique = true, nullable = false)
    public Long id;

    public String name;
    public String surname;
    public String specializationType;
    public Integer wages;

    public DoctorModel()
    {
        //Empty constructor
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
}
