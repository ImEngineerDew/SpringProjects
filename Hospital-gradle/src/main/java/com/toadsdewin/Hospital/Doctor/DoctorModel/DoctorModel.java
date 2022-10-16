package com.toadsdewin.Hospital.Doctor.DoctorModel;
import com.toadsdewin.Hospital.Patient.PatientModel.PatientModel;
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
    @Column(name = "Especializacion",nullable = false,length = 255)
    private String specialization;
    @Column (name = "Salario",unique = true, nullable = false)
    private Integer wages;

    @ManyToOne
    @JoinColumn(name= "id_patient", nullable = false)
    private PatientModel patient;

    public DoctorModel()
    {
        super();
    }
    public DoctorModel(String name, String surname, String countryOfOrigin, Integer age, Long id, String specialization, Integer wages,PatientModel patient)
    {
        super(name,surname,countryOfOrigin,age);
        this.id = id;
        this.specialization = specialization;
        this.wages = wages;
        this.patient = patient;
    }

    /** Getters and Setters **/
    public Long getId() {
        return id;
    }
    public String getSpecialization() {
        return specialization;
    }
    public Integer getWages() {
        return wages;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public void setSpecializationType(String specializationType) {
        this.specialization = specializationType;
    }
    public void setWages(Integer wages) {
        this.wages = wages;
    }
}
