package com.toadsdewin.Hospital.Patient;
import com.toadsdewin.Hospital.Doctor.DoctorModel.DoctorModel;
import com.toadsdewin.Hospital.Person;
import javax.persistence.*;

@Entity
@Table(name = "patient")
public class PatientModel extends Person
{
      @Id
      @GeneratedValue(strategy = GenerationType.AUTO)
      @Column (unique = true, nullable = false)
      private Long id;
      private String cityOfOrigin;
      private DoctorModel doctor;


      public PatientModel()
      {
            super();
      }
      public PatientModel(String name, String surname, String country, Integer numberIdent,
                          Integer phoneNumber,Long id,String cityOfOrigin, DoctorModel doctor)
      {
          super(name,surname,country,numberIdent,phoneNumber);
          this.id = id;
          this.cityOfOrigin = cityOfOrigin;
          this.doctor = doctor;
      }

    public Long getPatientId() {
        return id;
    }

    public void setPatientId(Long id) {
        this.id = id;
    }

    public String getCityOfOrigin() {
        return cityOfOrigin;
    }

    public void setCityOfOrigin(String cityOfOrigin) {
        this.cityOfOrigin = cityOfOrigin;
    }

    public DoctorModel getDoctor() {
        return doctor;
    }

    public void setDoctor(DoctorModel doctor) {
        this.doctor = doctor;
    }
}
