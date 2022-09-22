package com.codeclan.examples.coursebookingsystem.controllers;

import com.codeclan.examples.coursebookingsystem.models.Course;
import com.codeclan.examples.coursebookingsystem.models.StarRating;
import com.codeclan.examples.coursebookingsystem.repositories.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CourseController {
    @Autowired
    CourseRepository courseRepository;

    @GetMapping(value = "/courses")
    public ResponseEntity<List<Course>> getAllCoursesAndFillers(@RequestParam(required = false, name = "rating") String rating,
                                                                @RequestParam(required = false, name = "name") String name,
                                                                @RequestParam(required = false, name = "town") String town)
    { if(rating != null){
        return new ResponseEntity<>(courseRepository.findByStarRating(StarRating.STAR5), HttpStatus.OK);
    }

        return new ResponseEntity<>(courseRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/courses/{id}")
    public ResponseEntity getCourse(@PathVariable Long id){
        return new ResponseEntity<>(courseRepository.findById(id), HttpStatus.OK);
    }
//    @GetMapping(value = "/courses/byRating")
//    public ResponseEntity<List<Course>> getAllCoursesByRating(@RequestParam(name="rating") int rating){
//        return new ResponseEntity<>(courseRepository.findByStarRating(rating), HttpStatus.OK);
//    }

//    @GetMapping(value = "/courses/customer")
    //    public ResponseEntity<List<Course>> getCoursesByCustomer(@RequestParam (name="customer") String customer){
//        return new ResponseEntity<>(courseRepository.findByBookingCustomerName(customer), HttpStatus.OK)
//    }
}
