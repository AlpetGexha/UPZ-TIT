-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: May 05, 2025 at 07:39 AM
-- Server version: 5.7.31
-- PHP Version: 7.3.21

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `smu_upz_tit3`
--

-- --------------------------------------------------------

--
-- Table structure for table `departamenti`
--

DROP TABLE IF EXISTS `departamenti`;
CREATE TABLE IF NOT EXISTS `departamenti` (
  `id` int(11) NOT NULL,
  `emri` char(100) DEFAULT NULL,
  `fakulteti` int(11) DEFAULT NULL,
  `numriStudenteveRegjistruar` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fakulteti` (`fakulteti`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `departamenti`
--

INSERT INTO `departamenti` (`id`, `emri`, `fakulteti`, `numriStudenteveRegjistruar`) VALUES
(1, 'Dizajn Softueri', 1, 0),
(2, 'TIT', 1, 13),
(3, 'TIT - (Gj.Boshnjake)', 1, 0),
(4, 'TIT - (Gj.Turke)', 1, 0),
(5, 'Administrim Biznesi', 3, 0),
(6, 'Menaxhim Nderkombetar', 3, 0),
(7, 'Juridik', 2, 0),
(8, 'Gjuhe shqipe', 4, 0),
(9, 'Gjuhe angleze', 4, 0),
(10, 'Gjuhe gjermane', 4, 0),
(11, 'Programi fillor', 5, 0),
(12, 'Programi parafillor', 5, 0),
(13, 'Agrobiznes', 6, 0);

-- --------------------------------------------------------

--
-- Table structure for table `fakulteti`
--

DROP TABLE IF EXISTS `fakulteti`;
CREATE TABLE IF NOT EXISTS `fakulteti` (
  `id` int(11) NOT NULL,
  `emri` char(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `fakulteti`
--

INSERT INTO `fakulteti` (`id`, `emri`) VALUES
(1, 'Fakulteti i Shkencave Kompjuterike'),
(2, 'Fakulteti Juridik'),
(3, 'Fakulteti Ekonomik'),
(4, 'Fakulteti Filologjik'),
(5, 'Fakulteti i Edukimit'),
(6, 'Fakulteti i Shkencave te Jetes dhe Mjedisit');

-- --------------------------------------------------------

--
-- Table structure for table `lenda`
--

DROP TABLE IF EXISTS `lenda`;
CREATE TABLE IF NOT EXISTS `lenda` (
  `kodi` int(11) NOT NULL,
  `emri` char(100) DEFAULT NULL,
  `kredite` int(11) DEFAULT NULL,
  `statusi` char(15) DEFAULT NULL,
  PRIMARY KEY (`kodi`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `lenda`
--

INSERT INTO `lenda` (`kodi`, `emri`, `kredite`, `statusi`) VALUES
(123, 'Hyrje ne Programim', 6, 'Obligative'),
(124, 'Hyrje ne Informatike', 6, 'Obligative'),
(125, 'Matematika 1', 6, 'Obligative'),
(126, 'Media e re dhe multimedia', 6, 'Obligative'),
(127, 'Hyrje ne Rrjeta', 6, 'Obligative');

-- --------------------------------------------------------

--
-- Table structure for table `ligjerimet`
--

DROP TABLE IF EXISTS `ligjerimet`;
CREATE TABLE IF NOT EXISTS `ligjerimet` (
  `id` int(11) NOT NULL,
  `lenda` char(12) DEFAULT NULL,
  `profesori` int(11) DEFAULT NULL,
  `semestri` int(11) DEFAULT NULL,
  `departamenti` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `lenda` (`lenda`),
  KEY `profesori` (`profesori`),
  KEY `semestri` (`semestri`),
  KEY `departamenti` (`departamenti`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `ligjerimet`
--

INSERT INTO `ligjerimet` (`id`, `lenda`, `profesori`, `semestri`, `departamenti`) VALUES
(1, '124', 2, 1, 1),
(2, '123', 3, 1, 1),
(3, '126', 4, 1, 1),
(4, '127', 5, 1, 1),
(5, '125', 6, 1, 1),
(6, '128', 2, 1, 2);

-- --------------------------------------------------------

--
-- Table structure for table `perdoruesi`
--

DROP TABLE IF EXISTS `perdoruesi`;
CREATE TABLE IF NOT EXISTS `perdoruesi` (
  `id` int(11) NOT NULL,
  `emri` char(50) DEFAULT NULL,
  `email` char(30) DEFAULT NULL,
  `fjalekalimi` char(32) DEFAULT NULL,
  `roli` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `roli` (`roli`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `perdoruesi`
--

INSERT INTO `perdoruesi` (`id`, `emri`, `email`, `fjalekalimi`, `roli`) VALUES
(1, 'Xhevat Kallaba', 'xhevat.kallaba@gmail.com', 'e10adc3949ba59abbe56e057f20f883e', 1),
(2, 'Samedin Krrabaj', 'samedin.krrabaj@gmail.com', 'e10adc3949ba59abbe56e057f20f883e', 2),
(3, 'Ercan Canhasi', 'ercan.canhasi@gmail.com', 'e10adc3949ba59abbe56e057f20f883e', 2),
(4, 'Astrit Hulaj', 'astrit.hulaj@gmail.com', 'e10adc3949ba59abbe56e057f20f883e', 2),
(5, 'Arsim Susuri', 'arsim.susuri@gmail.com', 'e10adc3949ba59abbe56e057f20f883e', 2),
(6, 'Avdullah Zejnullahu', 'avdullah.zejnullahu@gmail.com', 'e10adc3949ba59abbe56e057f20f883e', 2),
(123456789, 'Genc Shala', 'genc.shala@gmail.com', 'e10adc3949ba59abbe56e057f20f883e', 3),
(123456798, 'Test Testi', 'test.testi@hotmail.com', 'e10adc3949ba59abbe56e057f20f883e', 3),
(123456879, 'Filan Fisteku', 'filan.fisteku@gmail.com', 'e10adc3949ba59abbe56e057f20f883e', 3),
(110928390, 'Flora Morina', 'flora@gmail.com', 'e10adc3949ba59abbe56e057f20f883e', 3),
(213456789, 'Filan Fisteku', 'filan@gmail.com', '40ab3e35bbe344e4cdc74525ed0ff73a', 3),
(207891230, 'Agnesa Berisha', 'aaa@hotmail.com', 'eed61713d4c39236cd72245dbcb08d49', 3),
(207891231, 'Fisnik Hoxha', 'fisnik@hotmail.com', '0600398c2f97309492ae46678f566b22', 3),
(129034567, 'Vlora Berisha', 'vlora.berisha@gmail.com', '1df22fa754f312f414649522a899a365', 3),
(109234567, 'Ditar Gashi', 'd.gashi@live.com', '9ee823d55a313c702c89ca7c559ddbb1', 3),
(312456789, 'Filan Fisteku', 'filan@live.com', '40ab3e35bbe344e4cdc74525ed0ff73a', 3),
(321456789, 'Krenare Krasniqi', 'krenare@hotmail.com', '3548a685073fa67f4dc48bd3a6f95262', 3),
(341256789, 'Vlora Berisha', 'vlora.berisha@gmail.com', '1df22fa754f312f414649522a899a365', 3),
(412356789, 'Filan Fisteku', 'filan@live.com', '40ab3e35bbe344e4cdc74525ed0ff73a', 3),
(410235678, 'Filan Fisteku', 'filan@live.com', '40ab3e35bbe344e4cdc74525ed0ff73a', 3),
(543216789, 'Filan Fisteku', 'filan@live.com', '40ab3e35bbe344e4cdc74525ed0ff73a', 3),
(601234567, 'Fisnik Jaha', 'fisnik.jaha@live.com', '61f7bd1270bb3bc0b7cdec696fee192c', 3),
(912345678, 'Test Testi', 'test@hotmail.com', 'e10adc3949ba59abbe56e057f20f883e', 2);

-- --------------------------------------------------------

--
-- Table structure for table `profesori`
--

DROP TABLE IF EXISTS `profesori`;
CREATE TABLE IF NOT EXISTS `profesori` (
  `id` int(11) NOT NULL,
  `titulli` char(30) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `profesori`
--

INSERT INTO `profesori` (`id`, `titulli`) VALUES
(2, 'Profesor i Asocuar'),
(3, 'Profesor i Asocuar'),
(4, 'Profesor Asistent'),
(5, 'Profesor Asistent'),
(6, 'Profesor Doktor');

-- --------------------------------------------------------

--
-- Table structure for table `rezultatet`
--

DROP TABLE IF EXISTS `rezultatet`;
CREATE TABLE IF NOT EXISTS `rezultatet` (
  `studenti` int(11) NOT NULL,
  `provimi` int(11) NOT NULL,
  `nota` int(11) DEFAULT NULL,
  `transkripte` int(1) NOT NULL,
  `notuar` int(1) NOT NULL,
  PRIMARY KEY (`studenti`,`provimi`),
  KEY `provimi` (`provimi`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `rezultatet`
--

INSERT INTO `rezultatet` (`studenti`, `provimi`, `nota`, `transkripte`, `notuar`) VALUES
(123456789, 5, 0, 0, 0),
(123456789, 4, 0, 0, 0),
(123456789, 3, 5, 0, 0),
(123456798, 1, 9, 0, 0),
(123456798, 5, 0, 0, 0),
(123456879, 1, 0, 0, 0),
(123456879, 3, 0, 0, 0),
(123456879, 4, 0, 0, 0),
(123456789, 2, 10, 1, 0),
(123456789, 1, 9, 1, 0);

-- --------------------------------------------------------

--
-- Table structure for table `roli`
--

DROP TABLE IF EXISTS `roli`;
CREATE TABLE IF NOT EXISTS `roli` (
  `id` int(11) NOT NULL,
  `pershkrimi` char(15) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `roli`
--

INSERT INTO `roli` (`id`, `pershkrimi`) VALUES
(1, 'Administrator'),
(2, 'Profesor'),
(3, 'Student');

-- --------------------------------------------------------

--
-- Table structure for table `semestri`
--

DROP TABLE IF EXISTS `semestri`;
CREATE TABLE IF NOT EXISTS `semestri` (
  `id` int(11) NOT NULL,
  `pershkrimi` char(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `semestri`
--

INSERT INTO `semestri` (`id`, `pershkrimi`) VALUES
(1, 'Semestri i pare'),
(2, 'Semestri i dyte'),
(3, 'Semestri i trete'),
(4, 'Semestri i katert'),
(5, 'Semestri i peste'),
(6, 'Semestri i gjashte'),
(7, 'Semestri i shtate'),
(8, 'Semestri i tete');

-- --------------------------------------------------------

--
-- Table structure for table `studenti`
--

DROP TABLE IF EXISTS `studenti`;
CREATE TABLE IF NOT EXISTS `studenti` (
  `id` int(11) NOT NULL,
  `dataregjistrimit` date DEFAULT NULL,
  `departamenti` int(11) DEFAULT NULL,
  `semestri` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `departamenti` (`departamenti`),
  KEY `semestri` (`semestri`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `studenti`
--

INSERT INTO `studenti` (`id`, `dataregjistrimit`, `departamenti`, `semestri`) VALUES
(123456789, '2020-03-31', 1, 2),
(123456798, '2020-03-31', 2, 2),
(123456879, '2020-03-31', 5, 6),
(129034567, '2025-03-18', 1, 1),
(109234567, '2025-03-18', 2, 1),
(312456789, '2025-03-19', 2, 1),
(321456789, '2025-03-19', 2, 1),
(341256789, '2025-03-19', 2, 1),
(412356789, '2025-03-19', 2, 1),
(410235678, '2025-03-19', 2, 1),
(543216789, '2025-03-19', 2, 1),
(601234567, '2025-03-19', 2, 1),
(912345678, '2025-03-19', 2, 1);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
