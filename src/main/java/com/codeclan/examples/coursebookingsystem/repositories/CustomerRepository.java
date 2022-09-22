package com.codeclan.examples.coursebookingsystem.repositories;

import com.codeclan.examples.coursebookingsystem.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerRepository extends JpaRepository <Customer, Long> {

//    List<Customer> findCustomersByBookingCourseName(String course);
}
