package com.vti.booking_tour.repository;

import com.vti.booking_tour.entity.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
    public interface BookingRepository extends JpaRepository<Booking, Long> {


}
