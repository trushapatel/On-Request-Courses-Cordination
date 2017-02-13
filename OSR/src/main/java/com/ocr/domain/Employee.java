package com.ocr.domain;

import lombok.Data;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.URL;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * Created by Ankit on 27-12-2016.
 */
@Data
@Entity
@Table(name = "user")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotEmpty(message = "firstname must not be empty.")
    @Column(name="firstname", nullable=false,length=50)
    private String firstName;

    @NotEmpty(message = "lastname must not be empty.")
    @Column(name="lastname", nullable=false,length=50)
    private String lastName;


    @Column(name="password",length=50)
    private String password;

    @Column(name="birthdate")
    private String birthDate;

    @NotEmpty(message = "email must not be empty.")
    @Email(message = "Invalid Email address.")
    @Column(name="email", nullable=false, unique = true)
    private String email;

    @NotEmpty(message = "contact number must not be empty.")
    @Column(name="contactno", length=50)
    private String contactNumber;

    @NotEmpty(message = "usertype must not be empty.")
    @Column(name="usertype", length=50)
    private String userType;

    @OneToOne(cascade = CascadeType.ALL)
    private Address address;

    @ManyToOne
    private Department department;
}
