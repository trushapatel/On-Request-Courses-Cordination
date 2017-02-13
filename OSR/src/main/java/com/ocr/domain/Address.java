package com.ocr.domain;

import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;

import javax.annotation.Generated;
import javax.persistence.*;
import java.lang.reflect.Method;

/**
 * Created by Ankit on 27-12-2016.
 */
@Data
@Entity
@Table(name = "address")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer id;

    @Column(name="address1",length = 100)
    @NotEmpty(message="Address can not be blank.")
    private String address1;

    @Column(name="address2",length = 100)
    private String address2;

    @Column(name="city",length = 50)
    private String city;

    @Column(name="state",length = 50)
    private String state;

    @Column(name="country",length = 50)
    private String country;

    @Column(name="zipcode",length = 50)
    private String zipcode;
}
