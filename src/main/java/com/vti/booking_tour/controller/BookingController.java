package com.vti.booking_tour.controller;

import com.vti.booking_tour.entity.Booking;
import com.vti.booking_tour.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/booking")
public class BookingController {

    @Autowired
    private BookingService bookingService;

    @GetMapping("/get-all-active")
    public List<Booking> getAllActive(int status) {
        return bookingService.findAllActive(status);
    }
}
