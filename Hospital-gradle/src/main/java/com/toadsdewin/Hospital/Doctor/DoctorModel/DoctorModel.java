package com.toadsdewin.Hospital.Doctor.DoctorModel;
import com.toadsdewin.Hospital.Patient.PatientModel.PatientModel;
import com.toadsdewin.Hospital.Person.PersonModel;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "doctor")
public class DoctorModel extends PersonModel
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column (name= "id",unique = true, nullable = false)
    private Long id;
    @Column(name = "Especializacion",nullable = false,length = 255)
    private String specialization;
    @Column (name = "Salario",unique = true, nullable = false)
    private Integer wages;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "doctor", cascade = CascadeType.ALL)
    private List<PatientModel> patient;

    public DoctorModel()
    {
        super();
    }
    public DoctorModel(String name, String surname, String countryOfOrigin, Integer age, Long id, String specialization, Integer wages,List<PatientModel> patient)
    {
        super(name,surname,countryOfOrigin,age);
        this.id = id;
        this.specialization = specialization;
        this.wages = wages;
        this.patient = patient;
    }
    /**Getters and Setters**/
    /**Used by Lombok**/

    public Long getId()
    {
        return id;
    }
    public void setId(Long id)
    {
        this.id =id;
    }
}
