package com.codeclan.examples.coursebookingsystem.repositories;

import com.codeclan.examples.coursebookingsystem.models.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Booking, Long> {
}
