package com.toadsdewin.testingGradle.Models;
import lombok.Data;

import javax.persistence.*;
@Data
@Entity
@Table(name = "Doctor")
public class Doctor extends Model
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(unique = true, nullable = false, length = 20)
    private Long idDoctor;

    @OneToOne
    @JoinColumn(name = "idPatient")
    private Patient patient;
}
