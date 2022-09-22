package com.codeclan.examples.coursebookingsystem.repositories;

import com.codeclan.examples.coursebookingsystem.models.Course;
import com.codeclan.examples.coursebookingsystem.models.StarRating;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseRepository extends JpaRepository<Course, Long> {
    List<Course> findByStarRating(StarRating rating);

//    List<Course> findByBookingCustomerName(String name);
}
