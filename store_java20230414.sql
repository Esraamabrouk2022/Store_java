-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema store_java
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema store_java
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `store_java` DEFAULT CHARACTER SET utf8 ;
USE `store_java` ;

-- -----------------------------------------------------
-- Table `store_java`.`categories`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `store_java`.`categories` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  `description` TEXT NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `id_UNIQUE` (`id` ASC) )
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `store_java`.`brand`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `store_java`.`brand` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  `logo_path` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `id_UNIQUE` (`id` ASC) )
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `store_java`.`products`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `store_java`.`products` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `categorey_id` INT NOT NULL,
  `brand_id` INT NOT NULL,
  `name` VARCHAR(100) NOT NULL,
  `descriotion` TEXT NOT NULL,
  `picture_path` VARCHAR(45) NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `id_UNIQUE` (`id` ASC) ,
  INDEX `fk_products_categories_idx` (`categorey_id` ASC) ,
  INDEX `fk_products_brand1_idx` (`brand_id` ASC) ,
  CONSTRAINT `fk_products_categories`
    FOREIGN KEY (`categorey_id`)
    REFERENCES `store_java`.`categories` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_products_brand1`
    FOREIGN KEY (`brand_id`)
    REFERENCES `store_java`.`brand` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `store_java`.`sizes`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `store_java`.`sizes` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(100) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `id_UNIQUE` (`id` ASC))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `store_java`.`product_size`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `store_java`.`product_size` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `products_id` INT NOT NULL,
  `sizes_id` INT NOT NULL,
  `size` INT NOT NULL,
  `quantity_id` INT NOT NULL,
  `price` FLOAT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `id_UNIQUE` (`id` ASC) ,
  INDEX `fk_product_size_products1_idx` (`products_id` ASC) ,
  INDEX `fk_product_size_sizes1_idx` (`sizes_id` ASC) ,
  CONSTRAINT `fk_product_size_products1`
    FOREIGN KEY (`products_id`)
    REFERENCES `store_java`.`products` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_product_size_sizes1`
    FOREIGN KEY (`sizes_id`)
    REFERENCES `store_java`.`sizes` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `store_java`.`cities`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `store_java`.`cities` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `id_UNIQUE` (`id` ASC) )
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `store_java`.`zones`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `store_java`.`zones` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `city_id` INT NOT NULL,
  `name` VARCHAR(100) NULL,
  `zonescol` VARCHAR(45) NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `id_UNIQUE` (`id` ASC) ,
  INDEX `fk_zones_cities1_idx` (`city_id` ASC) ,
  CONSTRAINT `fk_zones_cities1`
    FOREIGN KEY (`city_id`)
    REFERENCES `store_java`.`cities` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `store_java`.`branches`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `store_java`.`branches` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `zone_id` INT NOT NULL,
  `name` VARCHAR(100) NOT NULL,
  `building_name` VARCHAR(45) NOT NULL,
  `street_name` VARCHAR(45) NOT NULL,
  `working_start` TIME NULL,
  `working_end` TIME NULL,
  `telephonel` VARCHAR(45) NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `id_UNIQUE` (`id` ASC) ,
  INDEX `fk_branches_zones1_idx` (`zone_id` ASC) ,
  CONSTRAINT `fk_branches_zones1`
    FOREIGN KEY (`zone_id`)
    REFERENCES `store_java`.`zones` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
