-- phpMyAdmin SQL Dump
-- version 4.8.0.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jul 16, 2018 at 05:25 AM
-- Server version: 10.1.32-MariaDB
-- PHP Version: 5.6.36

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `shapedb`
--

-- --------------------------------------------------------

--
-- Table structure for table `comevents`
--

CREATE TABLE `comevents` (
  `id` int(30) NOT NULL,
  `user` varchar(30) NOT NULL,
  `status` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `comevents`
--

INSERT INTO `comevents` (`id`, `user`, `status`) VALUES
(1, 'uni02', 'interested');

-- --------------------------------------------------------

--
-- Table structure for table `comments`
--

CREATE TABLE `comments` (
  `id` int(20) NOT NULL,
  `user` varchar(30) NOT NULL,
  `comment` varchar(500) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `comments`
--

INSERT INTO `comments` (`id`, `user`, `comment`) VALUES
(2, 'uni01', 'Hello! Can I know the maximum number of participants allowed for this event?'),
(3, 'com01', 'We are expecting a total of 300 participants.');

-- --------------------------------------------------------

--
-- Table structure for table `comtemporary`
--

CREATE TABLE `comtemporary` (
  `Type` varchar(30) NOT NULL,
  `Name` varchar(30) NOT NULL,
  `Email` varchar(30) NOT NULL,
  `Username` varchar(30) NOT NULL,
  `Password` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `comtemporary`
--

INSERT INTO `comtemporary` (`Type`, `Name`, `Email`, `Username`, `Password`) VALUES
('rd2', 'CodeGen', 'codegen@gmail.com', 'com02', '123'),
('rd2', 'Virtusa', 'virtusa@gmail.com', 'com03', '123');

-- --------------------------------------------------------

--
-- Table structure for table `date`
--

CREATE TABLE `date` (
  `dates` varchar(50) NOT NULL,
  `events` varchar(1000) NOT NULL,
  `event_id` int(11) NOT NULL,
  `user` varchar(30) NOT NULL DEFAULT 'com01'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `date`
--

INSERT INTO `date` (`dates`, `events`, `event_id`, `user`) VALUES
('2018-07-11', 'Web Development workshop for undergraduates', 1, 'com01'),
('2018-07-24', 'Internship Interviews', 2, 'com01');

-- --------------------------------------------------------

--
-- Table structure for table `dateuni`
--

CREATE TABLE `dateuni` (
  `dates` varchar(30) NOT NULL,
  `events` varchar(50) NOT NULL,
  `event_id` int(30) NOT NULL,
  `user` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `dateuni`
--

INSERT INTO `dateuni` (`dates`, `events`, `event_id`, `user`) VALUES
('2018-08-26', 'Open Day', 1, 'uni01'),
('2018-07-27', 'Annual Talent Show', 2, 'uni02'),
('2018-12-05', 'Convocation', 3, 'uni01');

-- --------------------------------------------------------

--
-- Table structure for table `ideahub`
--

CREATE TABLE `ideahub` (
  `user` varchar(30) NOT NULL,
  `Comments` varchar(500) NOT NULL,
  `id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `ideahub`
--

INSERT INTO `ideahub` (`user`, `Comments`, `id`) VALUES
('uni01', 'Hello! I\'m from NSBM and I would like to let you all know that our open day is coming up :) ', 21),
('uni02', 'Are other universities allowed to participate?', 22),
('uni01', 'Yes of course! You can get more details from our website.', 23);

-- --------------------------------------------------------

--
-- Table structure for table `login`
--

CREATE TABLE `login` (
  `Type` varchar(30) NOT NULL,
  `Username` varchar(30) NOT NULL,
  `Password` varchar(30) NOT NULL,
  `id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `login`
--

INSERT INTO `login` (`Type`, `Username`, `Password`, `id`) VALUES
('rd0', 'adm01', '123', 1),
('rd1', 'uni01', '123', 2),
('rd2', 'com01', '123', 3),
('rd1', 'uni02', '1234', 5);

-- --------------------------------------------------------

--
-- Table structure for table `unitemporary`
--

CREATE TABLE `unitemporary` (
  `Type` varchar(30) NOT NULL,
  `Name` varchar(30) NOT NULL,
  `Email` varchar(30) NOT NULL,
  `Username` varchar(30) NOT NULL,
  `Password` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `unitemporary`
--

INSERT INTO `unitemporary` (`Type`, `Name`, `Email`, `Username`, `Password`) VALUES
('rd1', 'SLIIT', 'sliit@gmail.com', 'uni03', '123'),
('rd1', 'NSBM', 'nsbm@gmail.com', 'uni04', '123');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `comevents`
--
ALTER TABLE `comevents`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `comments`
--
ALTER TABLE `comments`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `comtemporary`
--
ALTER TABLE `comtemporary`
  ADD PRIMARY KEY (`Username`);

--
-- Indexes for table `date`
--
ALTER TABLE `date`
  ADD PRIMARY KEY (`event_id`);

--
-- Indexes for table `dateuni`
--
ALTER TABLE `dateuni`
  ADD PRIMARY KEY (`event_id`);

--
-- Indexes for table `ideahub`
--
ALTER TABLE `ideahub`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `login`
--
ALTER TABLE `login`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `unitemporary`
--
ALTER TABLE `unitemporary`
  ADD PRIMARY KEY (`Username`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `comevents`
--
ALTER TABLE `comevents`
  MODIFY `id` int(30) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `comments`
--
ALTER TABLE `comments`
  MODIFY `id` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `date`
--
ALTER TABLE `date`
  MODIFY `event_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `dateuni`
--
ALTER TABLE `dateuni`
  MODIFY `event_id` int(30) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `ideahub`
--
ALTER TABLE `ideahub`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=24;

--
-- AUTO_INCREMENT for table `login`
--
ALTER TABLE `login`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
