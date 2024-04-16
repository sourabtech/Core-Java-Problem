/*Create database*/
CREATE DATABASE IF NOT EXISTS wishkar_wellness_world;
/* Use the database*/
USE wishkar_wellness_world;

/*Create Users table*/
CREATE TABLE IF NOT EXISTS Users (
    user_id INT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(50) NOT NULL,
    email VARCHAR(100) NOT NULL,
    password VARCHAR(100) NOT NULL
);
desc Users;

/*Create Services table*/
CREATE TABLE IF NOT EXISTS Services (
    service_id INT AUTO_INCREMENT PRIMARY KEY,
    service_name VARCHAR(100) NOT NULL,
    description TEXT,
    price DECIMAL(10, 2) NOT NULL
);
desc Services;

 /*Create Appointment table*/
CREATE TABLE IF NOT EXISTS Appointment (
    appointment_id INT AUTO_INCREMENT PRIMARY KEY,
    user_id INT,
    service_id INT,
    date_time DATETIME,
    status VARCHAR(50),
    FOREIGN KEY (user_id) REFERENCES Users(user_id),
    FOREIGN KEY (service_id) REFERENCES Services(service_id)
);
desc Appointment;

/*Create Partner table*/
CREATE TABLE IF NOT EXISTS Partner (
    partner_id INT AUTO_INCREMENT PRIMARY KEY,
    partner_name VARCHAR(100) NOT NULL,
    partner_type VARCHAR(100),
    contact_info VARCHAR(255),
    location VARCHAR(255)
);
desc Partner;

 /*Create Product table*/
CREATE TABLE IF NOT EXISTS Product (
    product_id INT AUTO_INCREMENT PRIMARY KEY,
    product_name VARCHAR(100) NOT NULL,
    description TEXT,
    price DECIMAL(10, 2) NOT NULL,
    quantity_available INT
);
desc Product;

/* Create Pets table*/
CREATE TABLE IF NOT EXISTS Pets (
    pet_id INT AUTO_INCREMENT PRIMARY KEY,
    pet_name VARCHAR(100) NOT NULL,
    species VARCHAR(100),
    breed VARCHAR(100),
    age INT,
    owner_id INT,
    FOREIGN KEY (owner_id) REFERENCES Users(user_id)
);
/*desc  Create Pets table*/
CREATE TABLE IF NOT EXISTS Pets (
    pet_id INT AUTO_INCREMENT PRIMARY KEY,
    pet_name VARCHAR(100) NOT NULL,
    species VARCHAR(100),
    breed VARCHAR(100),
    age INT,
    owner_id INT,
    FOREIGN KEY (owner_id) REFERENCES Users(user_id)
);
desc Pets;

 /*Create DayCareBooking table*/
CREATE TABLE IF NOT EXISTS DayCareBooking (
    booking_id INT AUTO_INCREMENT PRIMARY KEY,
    user_id INT,
    pet_id INT,
    date DATE,
    status VARCHAR(50),
    FOREIGN KEY (user_id) REFERENCES Users(user_id),
    FOREIGN KEY (pet_id) REFERENCES Pets(pet_id)
);
desc DayCareBooking;

/*Create BoardingBooking table*/
CREATE TABLE IF NOT EXISTS BoardingBooking (
    booking_id INT AUTO_INCREMENT PRIMARY KEY,
    user_id INT,
    pet_id INT,
    start_date DATE,
    end_date DATE,
    status VARCHAR(50),
    FOREIGN KEY (user_id) REFERENCES Users(user_id),
    FOREIGN KEY (pet_id) REFERENCES Pets(pet_id)
);
desc BoardingBooking;

 /*Create UniqueFeature table*/
CREATE TABLE IF NOT EXISTS UniqueFeature (
    feature_id INT AUTO_INCREMENT PRIMARY KEY,
    feature_description TEXT
);
desc UniqueFeature;

/*Create SpaAppointment table*/
CREATE TABLE IF NOT EXISTS SpaAppointment (
    appointment_id INT AUTO_INCREMENT PRIMARY KEY,
    user_id INT,
    pet_id INT,
    service_type VARCHAR(100),
    date_time DATETIME,
    FOREIGN KEY (user_id) REFERENCES Users(user_id),
    FOREIGN KEY (pet_id) REFERENCES Pets(pet_id)
);
desc SpaAppointment;

/*Create ContactInfo table*/
CREATE TABLE IF NOT EXISTS ContactInfo (
    contact_id INT AUTO_INCREMENT PRIMARY KEY,
    location VARCHAR(255),
    phone_number VARCHAR(20),
    email VARCHAR(100),
    social_media_links TEXT
);
desc ContactInfo;

/*Create Location table*/
CREATE TABLE IF NOT EXISTS Location (
    location_id INT AUTO_INCREMENT PRIMARY KEY,
    location_name VARCHAR(100) NOT NULL,
    type VARCHAR(100),
    address VARCHAR(255),
    latitude DECIMAL(10, 6),
    longitude DECIMAL(10, 6)
);
desc Location;

SHOW DATABASES;
USE wishkar_wellness_world;
SHOW TABLES;