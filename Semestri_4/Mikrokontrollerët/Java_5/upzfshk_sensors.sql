-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: localhost:3306
-- Generation Time: Dec 01, 2023 at 08:26 PM
-- Server version: 10.3.39-MariaDB
-- PHP Version: 8.1.16

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `upzfshk_sensors`
--

-- --------------------------------------------------------

--
-- Table structure for table `dataset`
--

CREATE TABLE `dataset` (
  `id` int(11) NOT NULL,
  `temperature` float NOT NULL,
  `humidity` float NOT NULL,
  `date` datetime NOT NULL DEFAULT current_timestamp(),
  `deviceid` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Dumping data for table `dataset`
--

INSERT INTO `dataset` (`id`, `temperature`, `humidity`, `date`, `deviceid`) VALUES
(1, 32, 65, '2023-11-25 10:23:49', 1),
(2, 32, 65, '2023-11-25 10:23:50', 1),
(3, 32, 65, '2023-11-25 10:24:17', 1),
(4, 32, 65, '2023-11-25 10:25:17', 1),
(5, 32, 65, '2023-11-25 10:26:31', 4),
(6, 32, 65, '2023-11-25 10:26:50', 6),
(7, 22, 75, '2023-11-25 10:28:12', 3),
(8, 19, 21, '2023-11-25 10:54:42', 1),
(9, 21, 31, '2023-11-25 10:54:50', 1),
(10, 20, 36, '2023-11-25 10:54:58', 1),
(11, 21, 37, '2023-11-25 10:55:06', 1),
(12, 16, 22, '2023-11-25 10:57:59', 1),
(13, 16, 22, '2023-11-25 10:58:07', 1),
(14, 19, 33, '2023-11-25 10:58:15', 1),
(15, 21, 28, '2023-11-25 11:00:27', 2),
(16, 19, 29, '2023-11-25 11:00:35', 2),
(17, 19, 27, '2023-11-25 11:00:43', 2),
(18, 18, 27, '2023-11-25 11:00:51', 2),
(19, 18, 27, '2023-11-25 11:00:59', 2),
(20, 18, 27, '2023-11-25 11:01:07', 2),
(21, 18, 27, '2023-11-25 11:01:15', 2),
(22, 19, 26, '2023-11-25 11:01:24', 2),
(23, 19, 35, '2023-11-25 11:09:11', 1),
(24, 19, 34, '2023-11-25 11:09:19', 1),
(25, 18, 22, '2023-11-25 11:09:27', 1),
(26, 18, 22, '2023-11-25 11:09:35', 1),
(27, 18, 39, '2023-11-25 11:09:43', 1),
(28, 18, 22, '2023-11-25 11:09:51', 1),
(29, 18, 22, '2023-11-25 11:10:00', 1);

-- --------------------------------------------------------

--
-- Table structure for table `dataset2`
--

CREATE TABLE `dataset2` (
  `id` int(11) NOT NULL,
  `temperature` float NOT NULL,
  `humidity` float NOT NULL,
  `data` datetime NOT NULL,
  `deviceid` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

-- --------------------------------------------------------

--
-- Table structure for table `led`
--

CREATE TABLE `led` (
  `id` int(11) NOT NULL,
  `data` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Dumping data for table `led`
--

INSERT INTO `led` (`id`, `data`) VALUES
(1, 1);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `dataset`
--
ALTER TABLE `dataset`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `dataset2`
--
ALTER TABLE `dataset2`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `led`
--
ALTER TABLE `led`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `dataset`
--
ALTER TABLE `dataset`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=30;

--
-- AUTO_INCREMENT for table `dataset2`
--
ALTER TABLE `dataset2`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `led`
--
ALTER TABLE `led`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
