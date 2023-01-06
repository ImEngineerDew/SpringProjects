package com.toadsdewin.testingGradle.Models;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Table;

@Data
@Table
public class Doctor extends Model
{
    @Column(nullable = false, length = 10)
    private String specialization;

    @Column (nullable = false, length = 10)
    private String universityOfOrigin;
}
