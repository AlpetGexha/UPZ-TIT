CREATE DATABASE shitja_makinave;

USE shitja_makinave;

CREATE TABLE `user` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `Emri` VARCHAR(255) NOT NULL,
  `Mbiemri` VARCHAR(255) NOT NULL,
  `Email` VARCHAR(255) NOT NULL,
  `Tel` VARCHAR(255) NOT NULL,
  `Address` VARCHAR(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE = InnoDB DEFAULT CHARSET = utf8mb4;

CREATE TABLE `klienti` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `user_id` INT(11) NOT NULL,
  `nr_llogaris` VARCHAR(255) NOT NULL,
  PRIMARY KEY (`id`),
  FOREIGN KEY (`user_id`) REFERENCES `user` (`id`)
) ENGINE = InnoDB DEFAULT CHARSET = utf8mb4;

CREATE TABLE `admin` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `user_id` INT(11) NOT NULL,
  PRIMARY KEY (`id`),
  FOREIGN KEY (`user_id`) REFERENCES `user` (`id`)
) ENGINE = InnoDB DEFAULT CHARSET = utf8mb4;

CREATE TABLE `kategori` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `emri` VARCHAR(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE = InnoDB DEFAULT CHARSET = utf8mb4;

CREATE TABLE `porosit` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `data_porosis` DATE NOT NULL,
  `data_dergeses` DATE NOT NULL,
  `lloi_dergeses` VARCHAR(255) NOT NULL,
  `lloi_pagese` VARCHAR(255) NOT NULL,
  `totali` DECIMAL(10, 0) NOT NULL,
  `Adresa_dergeses` VARCHAR(255) NOT NULL,
  `klienti_id` INT(11) NOT NULL,
  PRIMARY KEY (`id`),
  FOREIGN KEY (`klienti_id`) REFERENCES `klienti` (`id`)
) ENGINE = InnoDB DEFAULT CHARSET = utf8mb4;

CREATE TABLE `produktet_porosit` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `product_id` INT(11) NOT NULL,
  `porosit_id` INT(11) NOT NULL,
  PRIMARY KEY (`id`),
  FOREIGN KEY (`product_id`) REFERENCES `produkti` (`id`),
  FOREIGN KEY (`porosit_id`) REFERENCES `porosit` (`id`)
) ENGINE = InnoDB DEFAULT CHARSET = utf8mb4;

CREATE TABLE `produkti` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `Emri` VARCHAR(255) NOT NULL,
  `Sasia` INT(11) NOT NULL,
  `Pershkrimi` TEXT NOT NULL,
  `Ngjyra` VARCHAR(255) NOT NULL,
  `Modeli` VARCHAR(255) NOT NULL,
  `Cmimi` DECIMAL(10, 0) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE = InnoDB DEFAULT CHARSET = utf8mb4;

CREATE TABLE `produkt_kategori` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `produkt_id` INT(11) NOT NULL,
  `kategori_id` INT(11) NOT NULL,
  PRIMARY KEY (`id`),
  FOREIGN KEY (`produkt_id`) REFERENCES `produkti` (`id`),
  FOREIGN KEY (`kategori_id`) REFERENCES `kategori` (`id`)
) ENGINE = InnoDB DEFAULT CHARSET = utf8mb4;

-- Dummy data insertion
INSERT INTO `user` (`Emri`, `Mbiemri`, `Email`, `Tel`, `Address`) VALUES
('John', 'Doe', 'johndoe@example.com', '123456789', '123 Main St'),
('Jane', 'Smith', 'janesmith@example.com', '987654321', '456 Elm St');

INSERT INTO `klienti` (`user_id`, `nr_llogaris`) VALUES
(1, 'ABC123'),
(2, 'XYZ456');

INSERT INTO `admin` (`user_id`) VALUES
(1),
(2);

INSERT INTO `kategori` (`emri`) VALUES
('Electronics'),
('Clothing');

INSERT INTO `produkti` (`Emri`, `Sasia`, `Pershkrimi`, `Ngjyra`, `Modeli`, `Cmimi`) VALUES
('Laptop', 10, 'High-end gaming laptop', 'Black', 'Model X', 1500),
('T-shirt', 50, 'Cotton T-shirt', 'Red', 'Model A', 20);

INSERT INTO `porosit` (`data_porosis`, `data_dergeses`, `lloi_dergeses`, `lloi_pagese`, `totali`, `Adresa_dergeses`, `klienti_id`) VALUES
('2024-11-10', '2024-11-12', 'Courier', 'Credit Card', 1520, '123 Main St', 1),
('2024-11-11', '2024-11-13', 'Courier', 'PayPal', 40, '456 Elm St', 2);

INSERT INTO `produktet_porosit` (`product_id`, `porosit_id`) VALUES
(1, 1),
(2, 2);

INSERT INTO `produkt_kategori` (`produkt_id`, `kategori_id`) VALUES
(1, 1),
(2, 2);
