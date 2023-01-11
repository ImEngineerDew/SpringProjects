package com.toadsdewin.testingGradle.Models;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
@Entity
@Table(name = "Doctor")
@EqualsAndHashCode(callSuper=false)
public class Doctor extends Model
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(unique = true, nullable = false, length = 20)
    private Long idDoctor;

    @ManyToOne
    @JoinColumn(name = "idPatient")
    private Patient patient;


}