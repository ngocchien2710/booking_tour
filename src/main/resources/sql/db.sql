DROP DATABASE IF EXISTS `booking_tour`;

CREATE DATABASE `booking_tour`;

USE `booking_tour`;

CREATE TABLE `Booking` (
                           id 					INT AUTO_INCREMENT PRIMARY KEY,
                           `code` 				VARCHAR(50),
                           username 			VARCHAR(100),
                           phone				VARCHAR(100),
                           bookingName			VARCHAR(100),
                           price				DOUBLE,
                           startDate 			DATE,
                           finishDate			DATE,
                           createdDate			DATE,
                           destination			VARCHAR(200),
                           departure			VARCHAR(200),
                           `status`				INT
);


INSERT INTO `booking_tour`.`booking` (`username`, `status`) VALUES ('BOOKING_CANCEL', '-1');
INSERT INTO `booking_tour`.`booking` (`username`, `status`) VALUES ('BOOKING_PENDING', '0');
INSERT INTO `booking_tour`.`booking` (`username`, `status`) VALUES ('BOOKING_GOING', '1');
INSERT INTO `booking_tour`.`booking` (`username`, `status`) VALUES ('BOOKING_FINISH', '2');
