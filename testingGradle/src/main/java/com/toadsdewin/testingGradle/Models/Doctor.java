package com.toadsdewin.testingGradle.Models;
import javax.persistence.*;

@Entity
@Table(name = "Doctor")
@PrimaryKeyJoinColumn(referencedColumnName = "doctor_model")
public class Doctor extends Model
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false, length = 20)
    private Long idDoctor;
    @ManyToOne (fetch = FetchType.LAZY)
    @JoinColumn(name = "idPatient")
    private Patient patient;
}