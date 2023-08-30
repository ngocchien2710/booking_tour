package com.vti.booking_tour.service;

import com.vti.booking_tour.entity.Booking;
import com.vti.booking_tour.models.BookingStatus;
import com.vti.booking_tour.repository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class BookingService {
    @Autowired
    private BookingRepository bookingRepository;

    public Booking insert(Booking booking){
        return bookingRepository.save(booking);
    }

    public Booking update(Booking booking){
        Optional<Booking> optionalBooking = bookingRepository.findById(booking.getId());
        if (optionalBooking.isPresent()) {
            return bookingRepository.save(booking);
        }
    return null;
    }

    public Booking delete(Long id) {
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
       Booking booking = new ArrayList<>();
       booking.setStatus(BookingStatus.BOOKING_GOING);
       booking.setStatus(BookingStatus.BOOKING_PENDING);
       return bookingRepository.save(booking);


    }
    public List<Booking> findAllCancel(){

        return null;
    }

    public List<Booking> findAllFinish(){

        return null;
    }

    }
