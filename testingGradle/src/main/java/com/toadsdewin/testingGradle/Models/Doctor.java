package com.toadsdewin.testingGradle.Models;
import lombok.Data;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Table
@Entity
public class Doctor extends Model
{
    @Column(nullable = false, length = 10)
    private String specialization;

    @Column (nullable = false, length = 10)
    private String universityOfOrigin;

    public Doctor()
    {
        super();
    }
}
