package dev.patika.homework2.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
// implemented according to requirements
@Data
@AllArgsConstructor
@NoArgsConstructor
@Inheritance(strategy = InheritanceType.JOINED)
@Entity
@Builder
public class Instructor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String address;
    private String phoneNumber;


    @OneToMany(mappedBy = "instructor")
    @JsonIgnore
    private List<Course> instructorCourse = new ArrayList<>();

}