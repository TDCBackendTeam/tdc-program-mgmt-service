package com.tdc.programservice.entity;
import jakarta.persistence.*;
import lombok.*;
@Data
@Entity
@Table(name="courses")
@NoArgsConstructor
@AllArgsConstructor
public class Course {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(nullable = false)
        private int course_id;

        @Column(nullable = false)
        private String course_name;

        @Column(nullable = false)
        private int emp_id;


        @JoinColumn
        private int batch_id;


        @JoinColumn (nullable = false)
        private int cat_id;

        @Column(nullable = false)
        private String details;

        @Column(nullable = false)
        private Double course_fee;

        @Column(nullable = false)
        private Long duration;

        @Column(nullable = false)
        private String year;

        }

