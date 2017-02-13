package com.ocr.domain;

import lombok.Data;
import org.hibernate.annotations.Type;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * Created by Ankit on 28-01-2017.
 */
@Data
@Entity
@Table(name = "Course")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotEmpty(message = "course name must not be empty.")
    @Column(name="courseName",length = 50)
    private String courseName;

    @Column(name = "description",length = 50)
    private String description;

}
