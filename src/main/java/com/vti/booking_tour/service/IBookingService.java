package com.vti.booking_tour.service;

import com.vti.booking_tour.entity.Booking;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Optional;

public interface IBookingService {



    public Optional<Booking> getBookingById(Long id);


    public Booking insert(Booking booking);


    public Booking deleteBooking(Long id);

}
