package com.toadsdewin.Hospital.Doctor.DoctorModel;
import com.toadsdewin.Hospital.Person.PersonModel;
import javax.persistence.*;

@Entity
@Table(name = "doctor")
public class DoctorModel extends PersonModel
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column (name= "Id",unique = true, nullable = false)
    private Long id;
    @Column(name= "Especializacion",nullable = false,length = 255)
    private String specializationType;
    @Column (name = "Salario",unique = true, nullable = false)
    private Integer wages;

    public DoctorModel() {

    }
    public DoctorModel(Long id, String specializationType, Integer wages)
    {
        super();
        this.id = id;
        this.specializationType = specializationType;
        this.wages = wages;
    }

    /** Getters and Setters **/
    public Long getId() {
        return id;
    }
    public String getSpecializationType() {
        return specializationType;
    }
    public Integer getWages() {
        return wages;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public void setSpecializationType(String specializationType) {
        this.specializationType = specializationType;
    }
    public void setWages(Integer wages) {
        this.wages = wages;
    }
}
