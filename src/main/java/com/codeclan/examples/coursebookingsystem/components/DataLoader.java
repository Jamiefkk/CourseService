package com.codeclan.examples.coursebookingsystem.components;

import com.codeclan.examples.coursebookingsystem.models.Booking;
import com.codeclan.examples.coursebookingsystem.models.Course;
import com.codeclan.examples.coursebookingsystem.models.Customer;
import com.codeclan.examples.coursebookingsystem.models.StarRating;
import com.codeclan.examples.coursebookingsystem.repositories.BookingRepository;
import com.codeclan.examples.coursebookingsystem.repositories.CourseRepository;
import com.codeclan.examples.coursebookingsystem.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    public DataLoader(){}

    @Autowired
    CustomerRepository customerRepo;

    @Autowired
    CourseRepository courseRepo;

    @Autowired
    BookingRepository bookingRepo;


    @Override
    public void run(ApplicationArguments args) throws Exception {

        bookingRepo.deleteAll();
        customerRepo.deleteAll();
        courseRepo.deleteAll();

        Customer john = new Customer("John", "Bathgate", 25);
        customerRepo.save(john);

        Customer jacob = new Customer("jacob", "Bathgate", 40);
        customerRepo.save(jacob);

        Customer jamie = new Customer("Jamie", "Portobello", 30);
        customerRepo.save(jamie);

        Customer damon = new Customer("Damon", "Gathbate", 42);
        customerRepo.save(damon);

        Course python = new Course("Intro to Python", "Edinburgh", StarRating.STAR5);
        courseRepo.save(python);

        Course java = new Course("Intro to Python", "Edinburgh", StarRating.STAR4);
        courseRepo.save(java);


        Booking booking = new Booking("05/05/2022", python, john);
        bookingRepo.save(booking);

        Booking booking2 = new Booking("05/05/2022", python, jacob);
        bookingRepo.save(booking2);

        Booking booking3 = new Booking("07/05/2022", java, damon);
        bookingRepo.save(booking3);

    }
}
