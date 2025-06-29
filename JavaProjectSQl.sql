CREATE DATABASE JProject ; 

USE JProject ; 

CREATE TABLE Customer (
    CustomerID INT PRIMARY KEY,
    Name VARCHAR(100),
    Email VARCHAR(100),
    Password VARCHAR(100),
    PhoneNo VARCHAR(20),
    Address VARCHAR(255),
    DateRegistered DATE
);

CREATE TABLE Product (
    ProductID INT PRIMARY KEY,
    Name VARCHAR(100),
    Description TEXT,
    Price DECIMAL(10,2),
    Category VARCHAR(50),
    Brand VARCHAR(50),
    StockQuantity INT
);

CREATE TABLE Cart (
    CartID INT PRIMARY KEY,
    CustomerID INT,
    CreatedAt DATETIME,
    UpdatedAt DATETIME,
    FOREIGN KEY (CustomerID) REFERENCES Customer(CustomerID)
);


-- CartItems Table
CREATE TABLE CartItems (
    CartItemID INT PRIMARY KEY,
    CartID INT,
    ProductID INT,
    Quantity INT,
    FOREIGN KEY (CartID) REFERENCES Cart(CartID),
    FOREIGN KEY (ProductID) REFERENCES Product(ProductID)
);

-- Order Table
CREATE TABLE OrderTable (
    OrderID INT AUTO_INCREMENT PRIMARY KEY,
    CustomerID INT,
    OrderDate DATE,
    TotalAmount DECIMAL(10,2),
    OrderStatus VARCHAR(20),
    PaymentID INT,
    ShippingID INT,
    FOREIGN KEY (CustomerID) REFERENCES Customer(CustomerID)
);

-- Payment Table
CREATE TABLE Payment (
    PaymentID INT  PRIMARY KEY,
    OrderID INT,
    CustomerID INT,
    PaymentDate DATE,
    PaymentMethod VARCHAR(50),
    Amount DECIMAL(10,2),
    PaymentStatus VARCHAR(20),
    FOREIGN KEY (OrderID) REFERENCES OrderTable(OrderID),
    FOREIGN KEY (CustomerID) REFERENCES Customer(CustomerID)
);

-- Shipping Table
CREATE TABLE Shipping (
    ShippingID INT AUTO_INCREMENT PRIMARY KEY,
    OrderID INT,
    ShippingAddress VARCHAR(255),
    ShippingDate DATE,
    DeliveryDate DATE,
    ShippingStatus VARCHAR(20),
    ShippingMethod VARCHAR(50),
    FOREIGN KEY (OrderID) REFERENCES OrderTable(OrderID)
);

-- Inventory Table
CREATE TABLE Inventory (
    InventoryID INT PRIMARY KEY,
    ProductID INT,
    QuantityAvailable INT,
    WarehouseLocation VARCHAR(100),
    LastUpdated DATE,
    FOREIGN KEY (ProductID) REFERENCES Product(ProductID)
);

-- OrderItems Table
CREATE TABLE OrderItems (
    OrderItemID INT PRIMARY KEY,
    OrderID INT,
    ProductID INT,
    Quantity INT,
    PriceAtPurchase DECIMAL(10,2),
    FOREIGN KEY (OrderID) REFERENCES OrderTable(OrderID),
    FOREIGN KEY (ProductID) REFERENCES Product(ProductID)
);


CREATE TABLE Admin (
    AdminID INT PRIMARY KEY,
    AdminName VARCHAR(100),
    Email VARCHAR(100),
    LastLogin DATETIME
);


CREATE TABLE Supplier (
    SupplierID INT PRIMARY KEY,
    CompanyName VARCHAR(100),
    ContactNo VARCHAR(15),
    Email VARCHAR(100)
);

CREATE TABLE Address (
    AddressID INT PRIMARY KEY,
    CustomerID INT,
    Street VARCHAR(255),
    City VARCHAR(100),
    State VARCHAR(100),
    ZipCode VARCHAR(10),
    FOREIGN KEY (CustomerID) REFERENCES Customer(CustomerID)
);

SELECT * FROM Customer;
SELECT * FROM Product;
SELECT * FROM OrderTable;
SELECT * FROM Cart;
SELECT * FROM Payment;
SELECT * FROM Shipping;
SELECT * FROM Inventory;
SELECT * FROM OrderItems;
SELECT * FROM CartItems;
Select * from Admin ; 
Select * from Supplier ; 
Select * from Address ;


