-- phpMyAdmin SQL Dump
-- version 4.1.14
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Mar 25, 2021 at 10:16 PM
-- Server version: 5.6.17
-- PHP Version: 5.5.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `unismu`
--

-- --------------------------------------------------------

--
-- Table structure for table `departamenti`
--

CREATE TABLE IF NOT EXISTS `departamenti` (
  `ID` int(11) NOT NULL,
  `emri` char(100) DEFAULT NULL,
  `fakulteti` int(11) DEFAULT NULL,
  `nrStdRegjistruar` int(11) DEFAULT '0',
  PRIMARY KEY (`ID`),
  KEY `fakulteti` (`fakulteti`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `departamenti`
--

INSERT INTO `departamenti` (`ID`, `emri`, `fakulteti`, `nrStdRegjistruar`) VALUES
(11, 'Dizajn Softueri', 1, 0),
(12, 'TIT', 1, 0),
(13, 'TIT - (Gj.Boshnjake)', 1, 0),
(14, 'TIT - (Gj.Turke)', 1, 0),
(21, 'Juridik', 2, 0),
(31, 'Administrim Biznesi', 3, 0),
(32, 'Menaxhim Nderkombetar', 3, 0),
(41, 'Gjuhe shqipe', 4, 0),
(42, 'Gjuhe angleze', 4, 0),
(43, 'Gjuhe gjermane', 4, 0),
(51, 'Programi fillor', 5, 0),
(52, 'Programi parafillor', 5, 0),
(61, 'Agrobiznes', 6, 0);

-- --------------------------------------------------------

--
-- Table structure for table `fakulteti`
--

CREATE TABLE IF NOT EXISTS `fakulteti` (
  `ID` int(11) NOT NULL,
  `emri` char(100) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `fakulteti`
--

INSERT INTO `fakulteti` (`ID`, `emri`) VALUES
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
  `kodi` int(11) NOT NULL,
  `emri` char(100) DEFAULT NULL,
  `kredi` int(11) DEFAULT NULL,
  `statusi` char(20) DEFAULT NULL,
  PRIMARY KEY (`kodi`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `lenda`
--

INSERT INTO `lenda` (`kodi`, `emri`, `kredi`, `statusi`) VALUES
(123, 'Hyrje ne Programim', 6, 'Obligative'),
(124, 'Hyrje ne Informatike', 6, 'Obligative'),
(125, 'Matematika 1', 6, 'Obligative'),
(126, 'Media e re dhe multimedia', 6, 'Obligative'),
(127, 'Hyrje ne Rrjeta', 6, 'Obligative');

-- --------------------------------------------------------

--
-- Table structure for table `ligjerimet`
--

CREATE TABLE IF NOT EXISTS `ligjerimet` (
  `ID` int(11) NOT NULL,
  `lenda` int(11) DEFAULT NULL,
  `profesori` int(11) DEFAULT NULL,
  `semestri` int(11) DEFAULT NULL,
  `departamenti` int(11) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `lenda` (`lenda`),
  KEY `profesori` (`profesori`),
  KEY `semestri` (`semestri`),
  KEY `departamenti` (`departamenti`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `ligjerimet`
--

INSERT INTO `ligjerimet` (`ID`, `lenda`, `profesori`, `semestri`, `departamenti`) VALUES
(1, 124, 2, 1, 11),
(2, 123, 3, 1, 11),
(3, 126, 4, 1, 11),
(4, 127, 5, 1, 11),
(5, 125, 6, 1, 11);

-- --------------------------------------------------------

--
-- Table structure for table `perdoruesi`
--

CREATE TABLE IF NOT EXISTS `perdoruesi` (
  `ID` int(11) NOT NULL,
  `emri` char(100) DEFAULT NULL,
  `email` char(100) DEFAULT NULL,
  `fjalekalimi` char(32) DEFAULT NULL,
  `roli` int(11) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `roli` (`roli`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `perdoruesi`
--

INSERT INTO `perdoruesi` (`ID`, `emri`, `email`, `fjalekalimi`, `roli`) VALUES
(1, 'Xhevat Kallaba', 'xhevat.kallaba@gmail.com', 'e10adc3949ba59abbe56e057f20f883e', 1),
(2, 'Samedin Krrabaj', 'samedin.krrabaj@gmail.com', 'e10adc3949ba59abbe56e057f20f883e', 2),
(3, 'Ercan Canhasi', 'ercan.canhasi@gmail.com', 'e10adc3949ba59abbe56e057f20f883e', 2),
(4, 'Astrit Hulaj', 'astrit.hulaj@gmail.com', 'e10adc3949ba59abbe56e057f20f883e', 2),
(5, 'Arsim Susuri', 'arsim.susuri@gmail.com', 'e10adc3949ba59abbe56e057f20f883e', 2),
(6, 'Avdullah Zejnullahu', 'avdullah.zejnullahu@gmail.com', 'e10adc3949ba59abbe56e057f20f883e', 2),
(123456789, 'Genc Shala', 'genc.shala@gmail.com', 'e10adc3949ba59abbe56e057f20f883e', 3),
(123456798, 'Test Testi', 'test.testi@hotmail.com', 'e10adc3949ba59abbe56e057f20f883e', 3),
(123456879, 'Filan Fisteku', 'filan.fisteku@gmail.com', 'e10adc3949ba59abbe56e057f20f883e', 3);

-- --------------------------------------------------------

--
-- Table structure for table `profesori`
--

CREATE TABLE IF NOT EXISTS `profesori` (
  `ID` int(11) NOT NULL,
  `titulli` char(20) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `profesori`
--

INSERT INTO `profesori` (`ID`, `titulli`) VALUES
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
  `studenti` int(11) NOT NULL,
  `provimi` int(11) NOT NULL,
  `nota` char(20) DEFAULT NULL,
  PRIMARY KEY (`studenti`,`provimi`),
  KEY `provimi` (`provimi`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `rezultatet`
--

INSERT INTO `rezultatet` (`studenti`, `provimi`, `nota`) VALUES
(123456789, 1, '8'),
(123456789, 2, '9'),
(123456789, 3, '7'),
(123456798, 1, '9'),
(123456798, 5, '10'),
(123456879, 1, '9'),
(123456879, 3, '7'),
(123456879, 4, '9');

-- --------------------------------------------------------

--
-- Table structure for table `roli`
--

CREATE TABLE IF NOT EXISTS `roli` (
  `ID` int(11) NOT NULL,
  `pershkrimi` char(20) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `roli`
--

INSERT INTO `roli` (`ID`, `pershkrimi`) VALUES
(1, 'Administrator'),
(2, 'Profesor'),
(3, 'Student');

-- --------------------------------------------------------

--
-- Table structure for table `semestri`
--

CREATE TABLE IF NOT EXISTS `semestri` (
  `ID` int(11) NOT NULL,
  `pershkrimi` char(20) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `semestri`
--

INSERT INTO `semestri` (`ID`, `pershkrimi`) VALUES
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
-- Stand-in structure for view `studentetfshk`
--
CREATE TABLE IF NOT EXISTS `studentetfshk` (
`id` int(11)
,`studenti` char(100)
,`semestri` int(11)
,`departamenti` char(100)
);
-- --------------------------------------------------------

--
-- Table structure for table `studenti`
--

CREATE TABLE IF NOT EXISTS `studenti` (
  `ID` int(11) NOT NULL,
  `dataRegjistrimit` date DEFAULT NULL,
  `departamenti` int(11) DEFAULT NULL,
  `semestri` int(11) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `departamenti` (`departamenti`),
  KEY `semestri` (`semestri`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `studenti`
--

INSERT INTO `studenti` (`ID`, `dataRegjistrimit`, `departamenti`, `semestri`) VALUES
(123456789, '2020-03-31', 11, 1),
(123456798, '2020-03-31', 12, 1),
(123456879, '2020-03-31', 11, 1);

-- --------------------------------------------------------

--
-- Stand-in structure for view `transkripta`
--
CREATE TABLE IF NOT EXISTS `transkripta` (
`ID` int(11)
,`lenda` char(100)
,`profesori` char(100)
,`nota` char(20)
);
-- --------------------------------------------------------

--
-- Structure for view `studentetfshk`
--
DROP TABLE IF EXISTS `studentetfshk`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `studentetfshk` AS select `studenti`.`ID` AS `id`,`perdoruesi`.`emri` AS `studenti`,`studenti`.`semestri` AS `semestri`,`departamenti`.`emri` AS `departamenti` from (((`studenti` join `perdoruesi`) join `departamenti`) join `fakulteti`) where ((`studenti`.`ID` = `perdoruesi`.`ID`) and (`studenti`.`departamenti` = `departamenti`.`ID`) and (`fakulteti`.`ID` = `departamenti`.`fakulteti`) and (`fakulteti`.`emri` = 'Fakulteti i Shkencave Kompjuterike')) order by `departamenti`.`emri`;

-- --------------------------------------------------------

--
-- Structure for view `transkripta`
--
DROP TABLE IF EXISTS `transkripta`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `transkripta` AS select `rezultatet`.`studenti` AS `ID`,`lenda`.`emri` AS `lenda`,`perdoruesi`.`emri` AS `profesori`,`rezultatet`.`nota` AS `nota` from (((((`lenda` join `perdoruesi`) join `profesori`) join `rezultatet`) join `ligjerimet`) join `studenti`) where ((`perdoruesi`.`ID` = `profesori`.`ID`) and (`rezultatet`.`provimi` = `ligjerimet`.`ID`) and (`ligjerimet`.`lenda` = `lenda`.`kodi`) and (`profesori`.`ID` = `ligjerimet`.`profesori`) and (`rezultatet`.`studenti` = `studenti`.`ID`));

--
-- Constraints for dumped tables
--

--
-- Constraints for table `departamenti`
--
ALTER TABLE `departamenti`
  ADD CONSTRAINT `departamenti_ibfk_1` FOREIGN KEY (`fakulteti`) REFERENCES `fakulteti` (`ID`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `ligjerimet`
--
ALTER TABLE `ligjerimet`
  ADD CONSTRAINT `ligjerimet_ibfk_1` FOREIGN KEY (`lenda`) REFERENCES `lenda` (`kodi`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `ligjerimet_ibfk_2` FOREIGN KEY (`profesori`) REFERENCES `profesori` (`ID`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `ligjerimet_ibfk_3` FOREIGN KEY (`semestri`) REFERENCES `semestri` (`ID`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `ligjerimet_ibfk_4` FOREIGN KEY (`departamenti`) REFERENCES `departamenti` (`ID`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `perdoruesi`
--
ALTER TABLE `perdoruesi`
  ADD CONSTRAINT `perdoruesi_ibfk_1` FOREIGN KEY (`roli`) REFERENCES `roli` (`ID`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `profesori`
--
ALTER TABLE `profesori`
  ADD CONSTRAINT `profesori_ibfk_1` FOREIGN KEY (`ID`) REFERENCES `perdoruesi` (`ID`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `rezultatet`
--
ALTER TABLE `rezultatet`
  ADD CONSTRAINT `rezultatet_ibfk_1` FOREIGN KEY (`studenti`) REFERENCES `studenti` (`ID`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `rezultatet_ibfk_2` FOREIGN KEY (`provimi`) REFERENCES `ligjerimet` (`ID`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `studenti`
--
ALTER TABLE `studenti`
  ADD CONSTRAINT `studenti_ibfk_1` FOREIGN KEY (`ID`) REFERENCES `perdoruesi` (`ID`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `studenti_ibfk_2` FOREIGN KEY (`departamenti`) REFERENCES `departamenti` (`ID`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `studenti_ibfk_3` FOREIGN KEY (`semestri`) REFERENCES `semestri` (`ID`) ON DELETE CASCADE ON UPDATE CASCADE;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
