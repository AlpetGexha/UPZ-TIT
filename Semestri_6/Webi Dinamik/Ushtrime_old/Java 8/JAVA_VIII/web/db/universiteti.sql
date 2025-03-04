-- phpMyAdmin SQL Dump
-- version 4.1.14
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Apr 01, 2020 at 10:18 PM
-- Server version: 5.6.17
-- PHP Version: 5.5.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `universiteti`
--

-- --------------------------------------------------------

--
-- Table structure for table `departamenti`
--

CREATE TABLE IF NOT EXISTS `departamenti` (
  `id` int(11) NOT NULL,
  `emri` char(100) DEFAULT NULL,
  `fakulteti` int(11) DEFAULT NULL,
  `numriStudenteveRegjistruar` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fakulteti` (`fakulteti`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `departamenti`
--

INSERT INTO `departamenti` (`id`, `emri`, `fakulteti`, `numriStudenteveRegjistruar`) VALUES
(1, 'Dizajn Softueri', 1, 0),
(2, 'TIT', 1, 0),
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

CREATE TABLE IF NOT EXISTS `fakulteti` (
  `id` int(11) NOT NULL,
  `emri` char(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

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

CREATE TABLE IF NOT EXISTS `lenda` (
  `kodi` char(12) NOT NULL,
  `emri` char(100) DEFAULT NULL,
  `kredite` int(11) DEFAULT NULL,
  `statusi` char(15) DEFAULT NULL,
  PRIMARY KEY (`kodi`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `lenda`
--

INSERT INTO `lenda` (`kodi`, `emri`, `kredite`, `statusi`) VALUES
('123', 'Hyrje ne Programim', 6, 'Obligative'),
('124', 'Hyrje ne Informatike', 6, 'Obligative'),
('125', 'Matematika 1', 6, 'Obligative'),
('126', 'Media e re dhe multimedia', 6, 'Obligative'),
('127', 'Hyrje ne Rrjeta', 6, 'Obligative');

-- --------------------------------------------------------

--
-- Table structure for table `ligjerimet`
--

CREATE TABLE IF NOT EXISTS `ligjerimet` (
  `lenda` char(12) NOT NULL DEFAULT '',
  `profesori` int(11) NOT NULL DEFAULT '0',
  `semestri` int(11) NOT NULL DEFAULT '0',
  `departamenti` int(11) NOT NULL DEFAULT '0',
  PRIMARY KEY (`lenda`,`profesori`,`semestri`,`departamenti`),
  KEY `profesori` (`profesori`),
  KEY `semestri` (`semestri`),
  KEY `departamenti` (`departamenti`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `ligjerimet`
--

INSERT INTO `ligjerimet` (`lenda`, `profesori`, `semestri`, `departamenti`) VALUES
('123', 2, 2, 1),
('124', 2, 1, 1),
('123', 3, 1, 1),
('124', 3, 1, 2),
('126', 4, 1, 1),
('127', 5, 1, 1),
('125', 6, 1, 1);

-- --------------------------------------------------------

--
-- Table structure for table `perdoruesi`
--

CREATE TABLE IF NOT EXISTS `perdoruesi` (
  `id` int(11) NOT NULL,
  `emri` char(15) DEFAULT NULL,
  `mbiemri` char(15) DEFAULT NULL,
  `email` char(30) DEFAULT NULL,
  `fjalekalimi` char(32) DEFAULT NULL,
  `roli` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `roli` (`roli`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `perdoruesi`
--

INSERT INTO `perdoruesi` (`id`, `emri`, `mbiemri`, `email`, `fjalekalimi`, `roli`) VALUES
(1, 'Xhevat', 'Kallaba', 'xhevat.kallaba@gmail.com', 'e10adc3949ba59abbe56e057f20f883e', 1),
(2, 'Samedin', 'Krrabaj', 'samedin.krrabaj@gmail.com', 'e10adc3949ba59abbe56e057f20f883e', 2),
(3, 'Ercan', 'Canhasi', 'ercan.canhasi@gmail.com', 'e10adc3949ba59abbe56e057f20f883e', 2),
(4, 'Astrit', 'Hulaj', 'astrit.hulaj@gmail.com', 'e10adc3949ba59abbe56e057f20f883e', 2),
(5, 'Arsim', 'Susuri', 'arsim.susuri@gmail.com', 'e10adc3949ba59abbe56e057f20f883e', 2),
(6, 'Avdullah', 'Zejnullahu', 'avdullah.zejnullahu@gmail.com', 'e10adc3949ba59abbe56e057f20f883e', 2),
(123456789, 'Genc', 'Shala', 'genc.shala@gmail.com', 'e10adc3949ba59abbe56e057f20f883e', 3),
(123456798, 'Test', 'Testi', 'test.testi@hotmail.com', 'e10adc3949ba59abbe56e057f20f883e', 3),
(123456879, 'Filan', 'Fisteku', 'filan.fisteku@gmail.com', 'e10adc3949ba59abbe56e057f20f883e', 3),
(123456987, 'Filan', 'Fisteku', 'filani.fisteku@gmail.com', '40ab3e35bbe344e4cdc74525ed0ff73a', 3),
(123459876, 'Gent', 'Berisha', 'gent.berisha@gmail.com', 'e10adc3949ba59abbe56e057f20f883e', 3),
(123546789, 'Alea', 'Morina', 'a.morina@gmail.com', '8a3009ebd8c2812c099c9edcfc2ec9e9', 3);

-- --------------------------------------------------------

--
-- Table structure for table `profesori`
--

CREATE TABLE IF NOT EXISTS `profesori` (
  `id` int(11) NOT NULL,
  `titulli` char(30) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

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

CREATE TABLE IF NOT EXISTS `rezultatet` (
  `studenti` int(11) NOT NULL DEFAULT '0',
  `lenda` char(12) NOT NULL DEFAULT '',
  `profesori` int(11) NOT NULL DEFAULT '0',
  `semestri` int(11) NOT NULL DEFAULT '0',
  `departamenti` int(11) NOT NULL DEFAULT '0',
  `nota` varchar(20) DEFAULT NULL,
  `heraParaqitjes` int(11) DEFAULT NULL,
  `notuar` int(1) DEFAULT NULL,
  `paraqitur` int(1) DEFAULT NULL,
  `refuzuar` int(1) DEFAULT NULL,
  `pranuar` int(1) DEFAULT NULL,
  PRIMARY KEY (`studenti`,`lenda`,`profesori`,`semestri`,`departamenti`),
  KEY `lenda` (`lenda`),
  KEY `profesori` (`profesori`),
  KEY `semestri` (`semestri`),
  KEY `departamenti` (`departamenti`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `roli`
--

CREATE TABLE IF NOT EXISTS `roli` (
  `id` int(11) NOT NULL,
  `pershkrimi` char(15) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

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

CREATE TABLE IF NOT EXISTS `semestri` (
  `id` int(11) NOT NULL,
  `pershkrimi` char(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

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

CREATE TABLE IF NOT EXISTS `studenti` (
  `id` int(11) NOT NULL,
  `dataregjistrimit` date DEFAULT NULL,
  `departamenti` int(11) DEFAULT NULL,
  `semestri` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `departamenti` (`departamenti`),
  KEY `semestri` (`semestri`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `studenti`
--

INSERT INTO `studenti` (`id`, `dataregjistrimit`, `departamenti`, `semestri`) VALUES
(123456789, '2020-03-31', 1, 1),
(123456798, '2020-03-31', 2, 1),
(123456879, '2020-03-31', 1, 1),
(123456987, '2020-04-01', 12, 1),
(123459876, '2020-04-01', 2, 1),
(123546789, '2020-04-01', 13, 1);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `departamenti`
--
ALTER TABLE `departamenti`
  ADD CONSTRAINT `departamenti_ibfk_1` FOREIGN KEY (`fakulteti`) REFERENCES `fakulteti` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `ligjerimet`
--
ALTER TABLE `ligjerimet`
  ADD CONSTRAINT `ligjerimet_ibfk_1` FOREIGN KEY (`lenda`) REFERENCES `lenda` (`kodi`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `ligjerimet_ibfk_2` FOREIGN KEY (`profesori`) REFERENCES `profesori` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `ligjerimet_ibfk_3` FOREIGN KEY (`semestri`) REFERENCES `semestri` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `ligjerimet_ibfk_4` FOREIGN KEY (`departamenti`) REFERENCES `departamenti` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `perdoruesi`
--
ALTER TABLE `perdoruesi`
  ADD CONSTRAINT `perdoruesi_ibfk_1` FOREIGN KEY (`roli`) REFERENCES `roli` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `profesori`
--
ALTER TABLE `profesori`
  ADD CONSTRAINT `profesori_ibfk_1` FOREIGN KEY (`id`) REFERENCES `perdoruesi` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `rezultatet`
--
ALTER TABLE `rezultatet`
  ADD CONSTRAINT `rezultatet_ibfk_1` FOREIGN KEY (`studenti`) REFERENCES `studenti` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `rezultatet_ibfk_2` FOREIGN KEY (`lenda`) REFERENCES `lenda` (`kodi`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `rezultatet_ibfk_3` FOREIGN KEY (`profesori`) REFERENCES `profesori` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `rezultatet_ibfk_4` FOREIGN KEY (`semestri`) REFERENCES `semestri` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `rezultatet_ibfk_5` FOREIGN KEY (`departamenti`) REFERENCES `departamenti` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `studenti`
--
ALTER TABLE `studenti`
  ADD CONSTRAINT `studenti_ibfk_1` FOREIGN KEY (`id`) REFERENCES `perdoruesi` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `studenti_ibfk_2` FOREIGN KEY (`departamenti`) REFERENCES `departamenti` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `studenti_ibfk_3` FOREIGN KEY (`semestri`) REFERENCES `semestri` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
