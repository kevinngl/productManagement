-- Database: productDb

-- DROP DATABASE IF EXISTS "productDb";

CREATE DATABASE "productDb"
    WITH
    OWNER = postgres
    ENCODING = 'UTF8'
    LC_COLLATE = 'English_Indonesia.1252'
    LC_CTYPE = 'English_Indonesia.1252'
    TABLESPACE = pg_default
    CONNECTION LIMIT = -1
    IS_TEMPLATE = False;
	
	CREATE TABLE Products (
    Id INT PRIMARY KEY,
    ProductName VARCHAR(255) NOT NULL,
    CategoryID INT,
    SupplierID INT,
    Price DECIMAL(10, 2),
    StockQuantity INT,
    FOREIGN KEY (CategoryID) REFERENCES Categories(Id),
    FOREIGN KEY (SupplierID) REFERENCES Suppliers(Id)
);

CREATE TABLE Categories (
    Id INT PRIMARY KEY,
    CategoryName VARCHAR(255) NOT NULL
);

CREATE TABLE Suppliers (
    Id INT PRIMARY KEY,
    SupplierName VARCHAR(255) NOT NULL,
    ContactPhone VARCHAR(20)
);

CREATE TABLE Inventories (
    Id INT PRIMARY KEY,
    ProductID INT,
    StockQuantity INT,
    LastUpdated TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (ProductID) REFERENCES Products(Id)
);

CREATE TABLE Users (
    UserID INT PRIMARY KEY,
    Username VARCHAR(255) NOT NULL,
    PasswordHash VARCHAR(255) NOT NULL,
    FirstName VARCHAR(255),
    LastName VARCHAR(255),
    Email VARCHAR(255) UNIQUE NOT NULL,
    CreatedAt TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);



-- Insert dummy data into Categories
INSERT INTO Categories (Id, CategoryName) VALUES
(1, 'Electronics'),
(2, 'Clothing'),
(3, 'Home and Garden'),
(4, 'Toys');

-- Insert dummy data into Suppliers
INSERT INTO Suppliers (Id, SupplierName, ContactPhone) VALUES
(1, 'Tech Distributors', '+1234567890'),
(2, 'Fashion Trends', '+9876543210'),
(3, 'Home Essentials', '+1112233445'),
(4, 'Toy Emporium', '+9988776655');

-- Insert dummy data into Products
INSERT INTO Products (Id, ProductName, CategoryID, SupplierID, Price, StockQuantity) VALUES
(1, 'Smartphone X', 1, 1, 599.99, 100),
(2, 'Laptop Pro', 1, 1, 1299.99, 50),
(3, 'Men''s Casual Shirt', 2, 2, 29.99, 200),
(4, 'Women''s Summer Dress', 2, 2, 49.99, 150),
(5, 'Lawn Mower Deluxe', 3, 3, 199.99, 30),
(6, 'Garden Furniture Set', 3, 3, 499.99, 20),
(7, 'Robot Toy Kit', 4, 4, 39.99, 100),
(8, 'Educational Board Game', 4, 4, 24.99, 120);

-- Insert dummy data into Inventories
INSERT INTO Inventories (Id, ProductID, StockQuantity) VALUES
(1, 1, 50),
(2, 2, 25),
(3, 3, 100),
(4, 4, 75),
(5, 5, 15),
(6, 6, 10),
(7, 7, 50),
(8, 8, 80);

-- Insert dummy data into Users
INSERT INTO Users (UserID, Username, PasswordHash, FirstName, LastName, Email) VALUES
(1, 'john_doe', 'hashed_password_1', 'John', 'Doe', 'john.doe@example.com'),
(2, 'jane_smith', 'hashed_password_2', 'Jane', 'Smith', 'jane.smith@example.com'),
(3, 'bob_johnson', 'hashed_password_3', 'Bob', 'Johnson', 'bob.johnson@example.com');
