package com.toadsdewin.Hospital.Patient.PatientModel;
import com.toadsdewin.Hospital.Doctor.DoctorModel.DoctorModel;
import com.toadsdewin.Hospital.Person.PersonModel;
import lombok.Data;
import javax.persistence.*;
import java.util.*;


@Data
@Entity
@Table(name= "patient")
public class PatientModel extends PersonModel
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column (name= "id",unique = true, nullable = false)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    private List<DoctorModel> doctor;
    @Column(name = "género", nullable = false)
    private String gender;

    public PatientModel()
    {
        super();
    }
    public PatientModel(String name, String surname, String countryOfOrigin, Integer age,List<DoctorModel> doctor, String gender)
    {
        super(name,surname,countryOfOrigin,age);
        this.doctor = doctor;
        this.gender = gender;
    }
    /**Getters and Setters**/

    public Long getId()
    {
        return id;
    }
    public void setId(Long id)
    {
        this.id = id;
    }
    /**Used by Lombok**/
}
