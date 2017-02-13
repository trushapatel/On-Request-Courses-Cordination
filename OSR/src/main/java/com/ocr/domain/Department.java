package com.ocr.domain;

import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;

import javax.annotation.Generated;
import javax.persistence.*;
import java.lang.reflect.Method;

    @Data
    @Entity
    @Table(name = "department")
    public class Department {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer id;

        @Column(name="departmentName",length = 50)
        @NotEmpty(message="name can not be blank.")
        private String departmentName;

        @Column(name="description",length = 100)
        private String description;

}
