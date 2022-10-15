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
}
