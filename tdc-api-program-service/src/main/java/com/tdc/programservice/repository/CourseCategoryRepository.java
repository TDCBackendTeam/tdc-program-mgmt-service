package com.tdc.programservice.repository;

import com.tdc.programservice.entity.CourseCategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseCategoryRepository extends JpaRepository<CourseCategory ,Integer> {
}
