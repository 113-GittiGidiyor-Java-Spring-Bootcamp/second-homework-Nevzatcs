package dev.patika.homework2.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

// implemented according to requirements
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
public class Student  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String s_name;
    private LocalDate s_birthDate;
    private String s_address;
    private String s_gender;

    @ManyToMany
    private List<Course> studentCourse = new ArrayList<>();



}