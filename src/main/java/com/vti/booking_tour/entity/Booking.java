package com.vti.booking_tour.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.vti.booking_tour.models.BookingStatus;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "booking")
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "code")
    private String code;

    @Column(name = "username")
    private String username;

    @Column(name = "phone")
    private String phone;

    @Column(name = "booking_name")
    private String bookingName;

    @Column(name = "price")
    private int price;

    @Column(name = "start_date")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime startDate;

    @Column(name = "finish_date")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime  finishDate;

    @Column(name = "created_date")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime  createdDate;

    @Column(name = "destination")
    private String destination;

    @Column(name = "departure")
    private String departure;

    @Column(name = "status")
    private int status;

    private String url;

    public boolean isActive(){
        return  status == BookingStatus.BOOKING_PENDING || status == BookingStatus.BOOKING_GOING;
    }

    public boolean isCancel(){
        return status == BookingStatus.BOOKING_CANCEL;
    }

    public  boolean isFinish(){
        return status == BookingStatus.BOOKING_FINISH;
    }

}
