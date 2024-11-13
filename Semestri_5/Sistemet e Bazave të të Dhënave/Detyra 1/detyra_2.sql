CREATE DATABASE `detyra_2`;
USE `detyra_2`;

CREATE TABLE `agjensioni` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `emri` VARCHAR(255) NOT NULL,
  `nr_max` INT(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

CREATE TABLE `angazhimi` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `aroplani_id` INT(11) NOT NULL,
  `kontroller_komunikacionit_id` INT(11) NOT NULL,
  PRIMARY KEY (`id`),
  FOREIGN KEY (`aroplani_id`) REFERENCES `modeli_areoplanit`(`id`),
  FOREIGN KEY (`kontroller_komunikacionit_id`) REFERENCES `kontroller_komunikacionit`(`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

CREATE TABLE `areoporti` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

CREATE TABLE `kontroll` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `agjensioni_id` INT(11) NOT NULL,
  `tekniku_id` INT(11) NOT NULL,
  `data` DATETIME NOT NULL,
  `ora` VARCHAR(10) NOT NULL,
  PRIMARY KEY (`id`),
  FOREIGN KEY (`agjensioni_id`) REFERENCES `agjensioni`(`id`),
  FOREIGN KEY (`tekniku_id`) REFERENCES `tekniku`(`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

CREATE TABLE `kontroller_komunikacionit` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `emri` VARCHAR(255) NOT NULL,
  `mbiemri` VARCHAR(255) NOT NULL,
  `tel` VARCHAR(255) NOT NULL,
  `rroga` DECIMAL(10, 0) NOT NULL,
  `kontrolli_mjeksor` TINYINT(1) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

CREATE TABLE `modeli_areoplanit` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `nr_modelit` VARCHAR(255) NOT NULL,
  `kapaciteti` VARCHAR(255) NOT NULL,
  `pesha` VARCHAR(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

CREATE TABLE `puna` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `kontroller_komunikacionit_id` INT(11) NOT NULL,
  `punesuar_id` INT(11) NOT NULL,
  PRIMARY KEY (`id`),
  FOREIGN KEY (`kontroller_komunikacionit_id`) REFERENCES `kontroller_komunikacionit`(`id`),
  FOREIGN KEY (`punesuar_id`) REFERENCES `punesuar`(`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

CREATE TABLE `punesuar` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `emri` VARCHAR(255) NOT NULL,
  `mbiemri` VARCHAR(255) NOT NULL,
  `tel` VARCHAR(255) NOT NULL,
  `lloji_punes` TEXT NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

CREATE TABLE `tekniku` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `emri` VARCHAR(255) NOT NULL,
  `mbiemri` VARCHAR(255) NOT NULL,
  `rroga` DECIMAL(10, 0) NOT NULL,
  `tel` VARCHAR(255) NOT NULL,
  `modeli_aroplanit_id` INT(11) NOT NULL,
  PRIMARY KEY (`id`),
  FOREIGN KEY (`modeli_aroplanit_id`) REFERENCES `modeli_areoplanit`(`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

CREATE TABLE `testimi_aroplanit` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `agjensioni_id` INT(11) NOT NULL,
  `aroplani_id` INT(11) NOT NULL,
  PRIMARY KEY (`id`),
  FOREIGN KEY (`agjensioni_id`) REFERENCES `agjensioni`(`id`),
  FOREIGN KEY (`aroplani_id`) REFERENCES `modeli_areoplanit`(`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- Inserting dummy data

INSERT INTO `agjensioni` (`emri`, `nr_max`) VALUES
('Agjensioni 1', 10),
('Agjensioni 2', 20);

INSERT INTO `kontroller_komunikacionit` (`emri`, `mbiemri`, `tel`, `rroga`, `kontrolli_mjeksor`) VALUES
('John', 'Doe', '123456789', 50000, 1),
('Jane', 'Smith', '987654321', 45000, 0);

INSERT INTO `modeli_areoplanit` (`nr_modelit`, `kapaciteti`, `pesha`) VALUES
('A320', '150', '70000'),
('B737', '180', '80000');

INSERT INTO `areoporti` () VALUES ();

INSERT INTO `tekniku` (`emri`, `mbiemri`, `rroga`, `tel`, `modeli_aroplanit_id`) VALUES
('Tom', 'Brown', 30000, '5551234', 1),
('Anna', 'Johnson', 35000, '5555678', 2);

INSERT INTO `punesuar` (`emri`, `mbiemri`, `tel`, `lloji_punes`) VALUES
('Robert', 'Miller', '7771111', 'Maintenance'),
('Sara', 'Davis', '7772222', 'Security');

INSERT INTO `kontroll` (`agjensioni_id`, `tekniku_id`, `data`, `ora`) VALUES
(1, 1, '2024-11-13 08:00:00', '08:00'),
(2, 2, '2024-11-14 09:30:00', '09:30');

INSERT INTO `testimi_aroplanit` (`agjensioni_id`, `aroplani_id`) VALUES
(1, 1),
(2, 2);

INSERT INTO `angazhimi` (`aroplani_id`, `kontroller_komunikacionit_id`) VALUES
(1, 1),
(2, 2);

INSERT INTO `puna` (`kontroller_komunikacionit_id`, `punesuar_id`) VALUES
(1, 1),
(2, 2);
