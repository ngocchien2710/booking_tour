package com.vti.booking_tour.service;

import com.vti.booking_tour.entity.Booking;
import com.vti.booking_tour.models.BookingStatus;
import com.vti.booking_tour.repository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class BookingService implements IBookingService{
    @Autowired
    private BookingRepository bookingRepository;

    public Booking insert(Booking booking){
        booking.setStatus(BookingStatus.BOOKING_PENDING);
        booking.setCreatedDate(LocalDateTime.now());
        return bookingRepository.save(booking);
    }

    public Booking updateBooking(Booking booking){
        Optional<Booking> optionalBooking = bookingRepository.findById(booking.getId());
        if (optionalBooking.isPresent()) {
            return bookingRepository.save(booking);
        }
    return null;
    }

    public Booking deleteBooking(Long id) {
        Optional<Booking> optionalBooking = bookingRepository.findById(id);
        if (optionalBooking.isPresent()) {
            Booking foundBooking = optionalBooking.get();
            if (foundBooking.getStatus() == BookingStatus.BOOKING_PENDING) {
                foundBooking.setStatus(BookingStatus.BOOKING_CANCEL);
                return bookingRepository.save(foundBooking);
            }
        }
            return null;
        }

    public List<Booking> findAll() {

        return bookingRepository.findAll();
    }

    public List<Booking> findAllActive(){

       return bookingRepository.findAll().stream().filter(booking -> booking.isActive()== true).collect(Collectors.toList());

    }
    public List<Booking> findAllCancel(){

        return bookingRepository.findAll().stream().filter(booking -> booking.isCancel()== true).collect(Collectors.toList());
    }

    public List<Booking> findAllFinish(){

        return bookingRepository.findAll().stream().filter(booking -> booking.isFinish()== true).collect(Collectors.toList());
    }




    @Override
    public Optional<Booking> getBookingById(Long id) {
        return bookingRepository.findById(id);
    }





}
