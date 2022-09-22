package com.codeclan.examples.coursebookingsystem.controllers;

import com.codeclan.examples.coursebookingsystem.models.Booking;
import com.codeclan.examples.coursebookingsystem.repositories.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookingController {

    @Autowired
    BookingRepository bookingRepository;

    @GetMapping(value = "/bookings")
    public ResponseEntity<List<Booking>> getAllBookings(){
        return new ResponseEntity<>(bookingRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/bookings/{id}")
    public ResponseEntity getBookings(@PathVariable Long id){
        return new ResponseEntity<>(bookingRepository.findById(id), HttpStatus.OK);
    }

//    @GetMapping(value = "/courses/customer")
//    public ResponseEntity<List<Course>> getCoursesByCustomer(@RequestParam (name="customer") String customer){
//    return new ResponseEntity<>(courseRepository.findByBookingCustomerName(customer), HttpStatus.OK)
//    }
}
