package com.codeclan.examples.coursebookingsystem.controllers;

import com.codeclan.examples.coursebookingsystem.models.Customer;
import com.codeclan.examples.coursebookingsystem.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerController {

    @Autowired
    CustomerRepository customerRepository;

    @GetMapping(value = "/customers")
    public ResponseEntity<List<Customer>> getAllCustomers(){
        return new ResponseEntity<>(customerRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/customers/{id}")
    public ResponseEntity getCustomer(@PathVariable Long id){
        return new ResponseEntity<>(customerRepository.findById(id), HttpStatus.OK);
    }

//    @GetMapping("/customers/course")
//    public ResponseEntity<List<Customer>> getCustomersByCourse(@RequestParam(name = "course") String course){
//        return new ResponseEntity<>(customerRepository.findCustomersByBookingCourseName(course), HttpStatus.OK);
//    }
}
