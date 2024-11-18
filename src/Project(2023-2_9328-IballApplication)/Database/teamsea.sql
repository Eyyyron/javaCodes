-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: May 16, 2024 at 12:17 PM
-- Server version: 8.2.0
-- PHP Version: 8.2.13

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `teamsea`
--

-- --------------------------------------------------------

--
-- Table structure for table `availability`
--

DROP TABLE IF EXISTS `availability`;
CREATE TABLE IF NOT EXISTS `availability` (
  `AvailabilityID` int NOT NULL AUTO_INCREMENT,
  `IdolID` int NOT NULL,
  `AvailableDay` varchar(60) NOT NULL,
  `StartTime` time NOT NULL,
  `EndTime` time NOT NULL,
  PRIMARY KEY (`AvailabilityID`),
  KEY `availability_ibfk_1_idx` (`IdolID`)
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `availability`
--

INSERT INTO `availability` (`AvailabilityID`, `IdolID`, `AvailableDay`, `StartTime`, `EndTime`) VALUES
(1, 1, 'Sunday', '13:00:00', '14:00:00'),
(2, 2, 'Monday', '16:00:00', '17:00:00'),
(3, 2, 'Tuesday', '14:00:00', '15:00:00'),
(4, 3, 'Tuesday', '14:00:00', '15:00:00'),
(5, 4, 'Wednesday', '16:00:00', '17:00:00'),
(6, 5, 'Thursday', '17:00:00', '18:00:00'),
(7, 6, 'Friday', '10:00:00', '11:00:00'),
(8, 7, 'Saturday', '11:00:00', '12:00:00'),
(9, 8, 'Sunday', '14:00:00', '15:00:00'),
(10, 9, 'Monday', '16:00:00', '17:00:00'),
(11, 10, 'Tuesday', '15:00:00', '16:00:00'),
(12, 11, 'Wednesday', '17:00:00', '18:00:00'),
(13, 12, 'Thursday', '18:00:00', '19:00:00'),
(14, 13, 'Friday', '11:00:00', '12:00:00'),
(15, 13, 'Monday', '13:00:00', '18:00:00'),
(16, 14, 'Saturday', '12:00:00', '13:00:00'),
(17, 15, 'Sunday', '15:00:00', '16:00:00');

-- --------------------------------------------------------

--
-- Table structure for table `fan`
--

DROP TABLE IF EXISTS `fan`;
CREATE TABLE IF NOT EXISTS `fan` (
  `FanID` int NOT NULL AUTO_INCREMENT,
  `FanFullName` varchar(60) NOT NULL,
  `Username` varchar(60) NOT NULL,
  `FanEmail` varchar(60) NOT NULL,
  `FanPassword` varchar(60) NOT NULL,
  `Gender` varchar(10) NOT NULL,
  `Birthdate` date NOT NULL,
  `FanBio` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`FanID`),
  UNIQUE KEY `Username_UNIQUE` (`Username`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `fan`
--

INSERT INTO `fan` (`FanID`, `FanFullName`, `Username`, `FanEmail`, `FanPassword`, `Gender`, `Birthdate`, `FanBio`) VALUES
(1, 'Aaron Kyle Aguilar', 'Aaron', '1@gmail.com', '1', 'Male', '2003-09-27', 'Rank 1 Velkoz PH S13 Split1'),
(2, 'Emily Smith', 'emily_smith', 'emily@yahoo.com', 'pass123', 'Female', '1995-08-14', 'K-pop lover\r'),
(3, 'John Doe', 'john_doe', 'john@gmail.com', 'secret123', 'Male', '1987-05-20', 'Music enthusiast\r'),
(4, 'Sarah Johnson', 'sarahj', 'sarah@yahoo.com', 'sarah123', 'Female', '2000-11-03', 'Dancing queen\r'),
(5, 'David Lee', 'david_lee', 'david@gmail.com', 'lee123', 'Male', '1998-03-10', 'Sports fanatic\r'),
(6, 'Jessica Brown', 'jess_brown', 'jess@yahoo.com', 'brownie321', 'Female', '1992-12-17', 'Bookworm\r'),
(7, 'Michael Chen', 'mike_c', 'mike@yahoo.com', 'm1k3c4t', 'Male', '1983-07-29', 'Tech geek\r'),
(8, 'Amanda White', 'amanda_white', 'amanda@gmail.com', 'amanda123', 'Female', '1997-09-05', 'Nature lover\r'),
(9, 'Ryan Wilson', 'ryan_w', 'ryan@yahoo.com', 'wilson321', 'Male', '1994-04-22', 'Movie buff\r'),
(10, 'Lisa Kim', 'lisa_kim', 'lisa@yahoo.com', 'kim123', 'Female', '2001-06-18', 'Foodie\r'),
(11, 'Daniel Martinez', 'dan_martinez', 'daniel@yahoo.com', 'dan321', 'Male', '1989-02-08', 'Traveler\r'),
(12, 'Michelle Nguyen', 'mich_nguyen', 'michelle@gmail.com', 'mich123', 'Female', '1996-10-25', 'Fashionista\r'),
(13, 'Alex Johnson', 'alex_j', 'alex@yahoo.com', 'alex1234', 'Male', '1990-11-15', 'Fitness enthusiast\r'),
(14, 'Samantha Taylor', 'sam_taylor', 'samantha@yahoo.com', 'sammy321', 'Female', '1985-03-07', 'Musician\r'),
(15, 'Kevin Brown', 'kev_brown', 'kevin@yahoo.com', 'kev123', 'Male', '1980-09-12', 'Artist');

-- --------------------------------------------------------

--
-- Table structure for table `fanreport`
--

DROP TABLE IF EXISTS `fanreport`;
CREATE TABLE IF NOT EXISTS `fanreport` (
  `FanReportID` int NOT NULL AUTO_INCREMENT,
  `FanID` int NOT NULL,
  `IdolID` int NOT NULL,
  `FanReportType` varchar(60) NOT NULL,
  `FanReportDescription` varchar(1000) DEFAULT NULL,
  PRIMARY KEY (`FanReportID`),
  KEY `fanreport_ibfk_1_idx` (`FanID`),
  KEY `fanreport_ibfk_2_idx` (`IdolID`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `fanreport`
--

INSERT INTO `fanreport` (`FanReportID`, `FanID`, `IdolID`, `FanReportType`, `FanReportDescription`) VALUES
(1, 1, 1, 'Inappropriate Behavior', 'Disruptive manners\r'),
(2, 5, 5, 'Verbal Abuse', 'Verbal attacks'),
(3, 1, 1, 'Inappropriate Behavior', 'she is toxic!');

-- --------------------------------------------------------

--
-- Table structure for table `fantoidolmsg`
--

DROP TABLE IF EXISTS `fantoidolmsg`;
CREATE TABLE IF NOT EXISTS `fantoidolmsg` (
  `FanMsgID` int NOT NULL AUTO_INCREMENT,
  `MeetupID` int NOT NULL,
  `FanMsgDesc` varchar(100) DEFAULT NULL,
  `FanTimeStamp` timestamp NOT NULL,
  PRIMARY KEY (`FanMsgID`),
  KEY `fantoidolmsg_ibfk_1_idx` (`MeetupID`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `fantoidolmsg`
--

INSERT INTO `fantoidolmsg` (`FanMsgID`, `MeetupID`, `FanMsgDesc`, `FanTimeStamp`) VALUES
(1, 1, 'Hello', '2024-02-04 05:00:05'),
(2, 2, 'Hi', '2024-02-05 07:00:05'),
(3, 3, 'How are you', '2024-02-06 06:00:05'),
(4, 4, 'Good day', '2024-02-07 08:00:05'),
(5, 5, 'Heya', '2024-02-08 09:00:05');

-- --------------------------------------------------------

--
-- Table structure for table `feedback`
--

DROP TABLE IF EXISTS `feedback`;
CREATE TABLE IF NOT EXISTS `feedback` (
  `FeedbackID` int NOT NULL AUTO_INCREMENT,
  `MeetupID` int NOT NULL,
  `Rating` int NOT NULL,
  `Comment` varchar(60) DEFAULT NULL,
  PRIMARY KEY (`FeedbackID`),
  KEY `feedback_ibfk_1_idx` (`MeetupID`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `feedback`
--

INSERT INTO `feedback` (`FeedbackID`, `MeetupID`, `Rating`, `Comment`) VALUES
(1, 1, 1, 'Worst meeting!\r'),
(2, 2, 5, 'Excellent experience!\r'),
(3, 3, 3, NULL),
(4, 4, 4, 'Good interaction.\r'),
(5, 5, 2, 'Disappointing session.\r'),
(6, 6, 5, 'Amazing meetup!\r'),
(7, 7, 2, 'Poor experience.\r'),
(8, 8, 4, 'Great session.\r'),
(9, 9, 3, NULL),
(10, 10, 1, 'Terrible experience.\r'),
(11, 11, 5, 'Fantastic meetup!\r'),
(12, 12, 2, 'Dissatisfied.\r'),
(13, 13, 4, 'Satisfactory.\r'),
(14, 14, 3, NULL),
(15, 15, 5, 'Wonderful experience!');

-- --------------------------------------------------------

--
-- Table structure for table `idol`
--

DROP TABLE IF EXISTS `idol`;
CREATE TABLE IF NOT EXISTS `idol` (
  `IdolID` int NOT NULL AUTO_INCREMENT,
  `IdolFullName` varchar(60) NOT NULL,
  `Alias` varchar(60) NOT NULL,
  `IdolEmail` varchar(60) NOT NULL,
  `IdolPassword` varchar(60) NOT NULL,
  `IdolType` varchar(60) NOT NULL,
  `IdolBio` varchar(100) DEFAULT NULL,
  `QBitRatePer10Mins` float NOT NULL,
  PRIMARY KEY (`IdolID`),
  UNIQUE KEY `Alias_UNIQUE` (`Alias`)
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `idol`
--

INSERT INTO `idol` (`IdolID`, `IdolFullName`, `Alias`, `IdolEmail`, `IdolPassword`, `IdolType`, `IdolBio`, `QBitRatePer10Mins`) VALUES
(1, 'Ennik Somi Douma', 'Jeon Somi', 'jsomi@gmail.com', 'iloveseoul543', 'Celebrity', 'Aaron<3', 300),
(2, 'Aaron Aguilar', 'Eydala', '2@gmail.com', '2', 'Gamer', 'crazy', 100),
(3, 'ReyJan Toress', 'Johanri', 'ilovejr@gmail.com', 'Howareyou1717', 'Gamer', 'IloveR', 200),
(4, 'Rasc Binuya', 'Lebron2.0', 'LebronJ@gmail.com', 'akosilebron', 'Youtuber', 'LebronLebron', 500),
(5, 'Eyron Aguilera', 'Eydalla', 'njoyer@gmail.com', 'Imissmyidol28', 'Influencer', 'Not a fan of Ursula', 250),
(6, 'Caloy Lionel', 'Patricio', 'waninamilyon@gmail.com', 'misskonasya128', 'Celebrity', 'Bigboi101', 400),
(7, 'Reyza Monti', 'Wisa', 'jrhehe@gmail.com', 'mwamwa', 'Celebrity', '<33', 200),
(8, 'Gordon Ramsay', 'Chef', 'gramsay@gmail.com', 'sandwich', 'Celebrity', 'masarap magluto', 400),
(9, 'Oleksandr Kostyljev', 's1mple', 'simple@gmail.com', 'byenavi', 'Gamer', 'lf new team', 250),
(10, 'Sean William McLoughlin', 'JSE', 'TOTM@yahoo.com', 'JS3_0432', 'Youtuber', 'part time youtuber full time coffee lover', 450),
(11, 'Ramon Emmiel Jasmin', 'Choco Martin', 'jasminRE@gmail.com', 'doctorAnugbati2012', 'Celebrity', 'YUHHHHH', 400),
(12, 'Daniela Callira', 'Archerist143', 'daniii@gmail.com', 'Imissmyidol', 'Idol', 'Kaya kang ipaglaban', 200),
(13, 'Kasper Tondo', 'Taga', 'kasper@gmail.com', '123', 'Gamer', 'hahah', 100),
(14, 'Ivana Barida', 'Ivananana', 'alberteinstein@gmail.com', 'BatangQuiapo', 'Influencer', 'I love coco martin', 200),
(15, 'Jeon Jungkook', 'KookieMonster', 'abcdefghilm@gmail.com', 'AsawakosiIU', 'Youtuber', 'Ilong', 500);

-- --------------------------------------------------------

--
-- Table structure for table `idolearnings`
--

DROP TABLE IF EXISTS `idolearnings`;
CREATE TABLE IF NOT EXISTS `idolearnings` (
  `IdolEarnID` int NOT NULL AUTO_INCREMENT,
  `IdolID` int NOT NULL,
  `Year` year NOT NULL,
  `TotalInDollars` float NOT NULL,
  `TotalInQbits` float NOT NULL,
  PRIMARY KEY (`IdolEarnID`),
  KEY `idolearnings_ibfk_1` (`IdolID`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `idolearnings`
--

INSERT INTO `idolearnings` (`IdolEarnID`, `IdolID`, `Year`, `TotalInDollars`, `TotalInQbits`) VALUES
(1, 1, '2024', 3.75, 300),
(2, 2, '2024', 15, 1200),
(3, 3, '2024', 15, 1200),
(4, 4, '2024', 18.75, 1500),
(5, 5, '2024', 9.375, 750),
(6, 6, '2024', 25, 2000),
(7, 7, '2024', 10, 800),
(8, 8, '2024', 25, 2000),
(9, 9, '2024', 18.75, 1500),
(10, 10, '2024', 90, 7200),
(11, 11, '2024', 30, 2400),
(12, 12, '2024', 15, 1200),
(13, 13, '2024', 35, 2800),
(14, 14, '2024', 15, 1200),
(15, 15, '2024', 37.5, 3000);

-- --------------------------------------------------------

--
-- Table structure for table `idolreport`
--

DROP TABLE IF EXISTS `idolreport`;
CREATE TABLE IF NOT EXISTS `idolreport` (
  `IdolReportID` int NOT NULL AUTO_INCREMENT,
  `IdolID` int NOT NULL,
  `FanID` int NOT NULL,
  `IdolReportType` varchar(60) NOT NULL,
  `IdolReportDescription` varchar(1000) DEFAULT NULL,
  PRIMARY KEY (`IdolReportID`),
  KEY `idolreport_ibfk_2_idx` (`FanID`),
  KEY `idolreport_ibfk_1_idx` (`IdolID`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `idolreport`
--

INSERT INTO `idolreport` (`IdolReportID`, `IdolID`, `FanID`, `IdolReportType`, `IdolReportDescription`) VALUES
(1, 1, 1, 'Inappropriate Behavior', 'Weird behavior\r'),
(2, 5, 5, 'Verbal Abuse', 'Offensive language\r'),
(3, 7, 7, 'Harassment', 'The fan harassed me\r'),
(4, 10, 10, 'Inappropriate Behavior', 'Rude behavior\r'),
(5, 12, 12, 'Verbal Abuse', 'Hostile behavior');

-- --------------------------------------------------------

--
-- Table structure for table `idoltofanmsg`
--

DROP TABLE IF EXISTS `idoltofanmsg`;
CREATE TABLE IF NOT EXISTS `idoltofanmsg` (
  `IdolMsgID` int NOT NULL AUTO_INCREMENT,
  `MeetupID` int NOT NULL,
  `IdolMsgDesc` varchar(100) DEFAULT NULL,
  `IdolTimeStamp` timestamp NOT NULL,
  PRIMARY KEY (`IdolMsgID`),
  KEY `idoltofanmsg_ibfk_1_idx` (`MeetupID`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `idoltofanmsg`
--

INSERT INTO `idoltofanmsg` (`IdolMsgID`, `MeetupID`, `IdolMsgDesc`, `IdolTimeStamp`) VALUES
(1, 1, 'Hello too', '2024-02-04 05:00:10'),
(2, 2, 'Hi too', '2024-02-05 07:00:10'),
(3, 3, 'I am good', '2024-02-06 06:00:10'),
(4, 4, 'Good day too', '2024-02-07 08:00:10'),
(5, 5, 'Heya too', '2024-02-08 09:00:10');

-- --------------------------------------------------------

--
-- Table structure for table `meetup`
--

DROP TABLE IF EXISTS `meetup`;
CREATE TABLE IF NOT EXISTS `meetup` (
  `MeetupID` int NOT NULL AUTO_INCREMENT,
  `FanID` int NOT NULL,
  `IdolID` int NOT NULL,
  `DurationInMinutes` int NOT NULL,
  `ScheduledDate` date NOT NULL,
  `ScheduledTime` time NOT NULL,
  `Status` varchar(60) NOT NULL,
  PRIMARY KEY (`MeetupID`),
  KEY `meetup_ibfk_2_idx` (`IdolID`),
  KEY `meetup_ibfk_1_idx` (`FanID`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `meetup`
--

INSERT INTO `meetup` (`MeetupID`, `FanID`, `IdolID`, `DurationInMinutes`, `ScheduledDate`, `ScheduledTime`, `Status`) VALUES
(1, 1, 1, 10, '2024-02-04', '13:00:00', 'Finished\r'),
(2, 2, 2, 20, '2024-02-05', '15:00:00', 'Finished\r'),
(3, 3, 3, 60, '2024-02-06', '14:00:00', 'Finished\r'),
(4, 4, 4, 30, '2024-02-07', '16:00:00', 'Finished\r'),
(5, 5, 5, 30, '2024-02-08', '17:00:00', 'Finished\r'),
(6, 6, 6, 40, '2024-02-09', '10:00:00', 'Finished\r'),
(7, 7, 7, 40, '2024-02-10', '11:00:00', 'Finished\r'),
(8, 8, 8, 50, '2024-02-11', '14:00:00', 'Finished\r'),
(9, 9, 9, 50, '2024-02-12', '16:00:00', 'Finished\r'),
(10, 10, 10, 60, '2024-02-13', '15:00:00', 'Finished\r'),
(11, 11, 11, 60, '2024-02-14', '17:00:00', 'Finished\r'),
(12, 12, 12, 60, '2024-02-15', '18:00:00', 'Finished\r'),
(13, 13, 13, 60, '2024-02-16', '11:00:00', 'Finished\r'),
(14, 14, 14, 60, '2024-02-17', '12:00:00', 'Finished\r'),
(15, 15, 15, 60, '2024-02-18', '15:00:00', 'Finished');

-- --------------------------------------------------------

--
-- Table structure for table `payment`
--

DROP TABLE IF EXISTS `payment`;
CREATE TABLE IF NOT EXISTS `payment` (
  `PaymentID` int NOT NULL AUTO_INCREMENT,
  `MeetupID` int NOT NULL,
  `AmountInDollars` float NOT NULL,
  `AmountInQbits` float NOT NULL,
  `PaymentDate` date NOT NULL,
  `PaymentTime` time NOT NULL,
  `PaymentMode` varchar(60) NOT NULL,
  PRIMARY KEY (`PaymentID`),
  KEY `payment_ibfk_1_idx` (`MeetupID`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `payment`
--

INSERT INTO `payment` (`PaymentID`, `MeetupID`, `AmountInDollars`, `AmountInQbits`, `PaymentDate`, `PaymentTime`, `PaymentMode`) VALUES
(1, 1, 3.75, 300, '2024-02-03', '05:00:00', 'PayPal\r'),
(2, 2, 12.5, 1000, '2024-02-04', '06:00:00', 'Credit Card\r'),
(3, 3, 15, 1200, '2024-02-05', '07:00:00', 'PayPal\r'),
(4, 4, 18.75, 1500, '2024-02-06', '08:00:00', 'Debit Card\r'),
(5, 5, 9.375, 750, '2024-02-07', '09:00:00', 'GCash\r'),
(6, 6, 20, 1600, '2024-02-08', '10:00:00', 'PayPal\r'),
(7, 7, 10, 800, '2024-02-09', '11:00:00', 'Credit Card\r'),
(8, 8, 25, 2000, '2024-02-10', '12:00:00', 'GCash\r'),
(9, 9, 15.625, 1250, '2024-02-11', '13:00:00', 'Debit Card\r'),
(10, 10, 33.75, 2700, '2024-02-12', '14:00:00', 'PayPal\r'),
(11, 11, 30, 2400, '2024-02-13', '15:00:00', 'Credit Card\r'),
(12, 12, 15, 1200, '2024-02-14', '16:00:00', 'Debit Card\r'),
(13, 13, 26.25, 2100, '2024-02-15', '17:00:00', 'GCash\r'),
(14, 14, 15, 1200, '2024-02-16', '18:00:00', 'PayPal\r'),
(15, 15, 37.5, 3000, '2024-02-17', '19:00:00', 'Credit Card');

-- --------------------------------------------------------

--
-- Table structure for table `wishlist`
--

DROP TABLE IF EXISTS `wishlist`;
CREATE TABLE IF NOT EXISTS `wishlist` (
  `WishlistID` int NOT NULL AUTO_INCREMENT,
  `FanID` int NOT NULL,
  `IdolID` int NOT NULL,
  `DateAdded` date NOT NULL,
  PRIMARY KEY (`WishlistID`),
  KEY `wishlist_ibfk_1_idx` (`FanID`),
  KEY `wishlist_ibfk_2_idx` (`IdolID`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `wishlist`
--

INSERT INTO `wishlist` (`WishlistID`, `FanID`, `IdolID`, `DateAdded`) VALUES
(1, 1, 2, '2024-01-15'),
(2, 3, 4, '2024-01-17'),
(3, 5, 6, '2024-01-19'),
(4, 7, 8, '2024-01-21'),
(5, 9, 10, '2024-01-23');

--
-- Constraints for dumped tables
--

--
-- Constraints for table `availability`
--
ALTER TABLE `availability`
  ADD CONSTRAINT `availability_ibfk_1` FOREIGN KEY (`IdolID`) REFERENCES `idol` (`IdolID`) ON DELETE CASCADE ON UPDATE RESTRICT;

--
-- Constraints for table `fanreport`
--
ALTER TABLE `fanreport`
  ADD CONSTRAINT `fanreport_ibfk_1` FOREIGN KEY (`FanID`) REFERENCES `fan` (`FanID`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  ADD CONSTRAINT `fanreport_ibfk_2` FOREIGN KEY (`IdolID`) REFERENCES `idol` (`IdolID`) ON DELETE RESTRICT ON UPDATE RESTRICT;

--
-- Constraints for table `fantoidolmsg`
--
ALTER TABLE `fantoidolmsg`
  ADD CONSTRAINT `fantoidolmsg_ibfk_1` FOREIGN KEY (`MeetupID`) REFERENCES `meetup` (`MeetupID`) ON DELETE RESTRICT ON UPDATE RESTRICT;

--
-- Constraints for table `feedback`
--
ALTER TABLE `feedback`
  ADD CONSTRAINT `feedback_ibfk_1` FOREIGN KEY (`MeetupID`) REFERENCES `meetup` (`MeetupID`) ON DELETE RESTRICT ON UPDATE RESTRICT;

--
-- Constraints for table `idolearnings`
--
ALTER TABLE `idolearnings`
  ADD CONSTRAINT `idolearnings_ibfk_1` FOREIGN KEY (`IdolID`) REFERENCES `idol` (`IdolID`) ON DELETE RESTRICT ON UPDATE RESTRICT;

--
-- Constraints for table `idolreport`
--
ALTER TABLE `idolreport`
  ADD CONSTRAINT `idolreport_ibfk_1` FOREIGN KEY (`IdolID`) REFERENCES `idol` (`IdolID`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  ADD CONSTRAINT `idolreport_ibfk_2` FOREIGN KEY (`FanID`) REFERENCES `fan` (`FanID`) ON DELETE RESTRICT ON UPDATE RESTRICT;

--
-- Constraints for table `idoltofanmsg`
--
ALTER TABLE `idoltofanmsg`
  ADD CONSTRAINT `idoltofanmsg_ibfk_1` FOREIGN KEY (`MeetupID`) REFERENCES `meetup` (`MeetupID`) ON DELETE RESTRICT ON UPDATE RESTRICT;

--
-- Constraints for table `meetup`
--
ALTER TABLE `meetup`
  ADD CONSTRAINT `meetup_ibfk_1` FOREIGN KEY (`FanID`) REFERENCES `fan` (`FanID`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  ADD CONSTRAINT `meetup_ibfk_2` FOREIGN KEY (`IdolID`) REFERENCES `idol` (`IdolID`) ON DELETE RESTRICT ON UPDATE RESTRICT;

--
-- Constraints for table `payment`
--
ALTER TABLE `payment`
  ADD CONSTRAINT `payment_ibfk_1` FOREIGN KEY (`MeetupID`) REFERENCES `meetup` (`MeetupID`) ON DELETE RESTRICT ON UPDATE RESTRICT;

--
-- Constraints for table `wishlist`
--
ALTER TABLE `wishlist`
  ADD CONSTRAINT `wishlist_ibfk_1` FOREIGN KEY (`FanID`) REFERENCES `fan` (`FanID`) ON DELETE CASCADE ON UPDATE RESTRICT,
  ADD CONSTRAINT `wishlist_ibfk_2` FOREIGN KEY (`IdolID`) REFERENCES `idol` (`IdolID`) ON DELETE CASCADE ON UPDATE RESTRICT;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
