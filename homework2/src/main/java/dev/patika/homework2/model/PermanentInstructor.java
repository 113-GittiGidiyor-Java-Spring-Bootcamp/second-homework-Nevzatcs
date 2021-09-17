package dev.patika.homework2.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
// implemented according to requirements
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class PermanentInstructor extends Instructor{
    private double fixedSalary;


}