package com.tdc.programservice.repository;

import com.tdc.programservice.entity.Batch;
import com.tdc.programservice.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository <Course,Integer>{
   @Query("SELECT c FROM Course c WHERE c.course_name = :courseName")
   Course findByCourseName(@Param("courseName") String courseName);

    //Course findByCourseName(String name);

}
