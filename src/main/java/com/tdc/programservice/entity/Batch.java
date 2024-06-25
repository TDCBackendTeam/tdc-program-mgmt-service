package com.tdc.programservice.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalTime;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name="batch")
public class Batch {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private int batch_id;
    @Column(nullable = false)
    private String batch_name;
    @Column(nullable = false)
    private String batch_time;

}
