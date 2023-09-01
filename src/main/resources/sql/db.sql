DROP DATABASE IF EXISTS `booking_tour`;

CREATE DATABASE `booking_tour`;

USE `booking_tour`;

CREATE TABLE `Booking` (
                           id 					INT AUTO_INCREMENT PRIMARY KEY,
                           `code` 				VARCHAR(50),
                           username 			VARCHAR(100),
                           phone				VARCHAR(100),
                           booking_name			VARCHAR(100),
                           price				INT,
                           start_date 			DATE,
                           finish_date			DATE,
                           created_date			DATE,
                           destination			VARCHAR(200),
                           departure			VARCHAR(200),
                           `status`				INT
);


INSERT INTO `booking_tour`.`booking` (`username`, `status`, `price`) VALUES ('BOOKING_CANCEL', '-1', '1');
INSERT INTO `booking_tour`.`booking` (`username`, `status`, `price`) VALUES ('BOOKING_PENDING', '0', '1');
INSERT INTO `booking_tour`.`booking` (`username`, `status`, `price`) VALUES ('BOOKING_GOING', '1', '1');
INSERT INTO `booking_tour`.`booking` (`username`, `status`, `price`) VALUES ('BOOKING_FINISH', '2', '1');
