# Transac - Transaction Management System

## Overview

Transac is a Java-based transaction management system designed for the final project of the second semester. This project focuses on implementing object-oriented programming principles to create and manage purchase and sale transactions between clients and suppliers, as well as maintaining information about clients, suppliers, and items. Transac also offers the ability to save transaction data to a CSV file.

## Features

- **Transaction Management:** Transac allows you to create, view, and manage transactions seamlessly. You can record purchase and sale transactions with ease, tracking essential details such as transaction type, id, date,item id, quantity sold/purchased, unit price.

- **Client and Supplier Management:** Easily add, update, and delete client and supplier information, making it simple to keep your records up to date.

- **Item Catalog:** Maintain an organized catalog of items, including details like item name, id, description, unit price, sale price, and stock levels.

- **CSV Data Export:** Transac includes the functionality to export transaction data to a CSV file for easy data storage and sharing.

## Getting Started

To run this project on your local machine, follow these steps:

1. Clone this repository to your local machine using `git clone`.

   ```bash
   git clone https://github.com/FreddyAssaf/Transac.git

2. Compile the Java Files: In the project directory, you will find multiple Java source files. To compile all of them, use the following command:

   ```bash
   javac *.java

3. Run the Application: After successfully compiling the Java files, you can run the application by executing the following command:

   ```bash
   java Transac

## Usage
Upon running Transac, you will be presented with a main menu that contains the following options:

- Client: Choose this option to manage client-related operations. You can add a new client that will automatically be exported to a CSV file, view client details, delete a client, or view all clients.

- Supplier: Manage supplier-related operations, including adding a new supplier that will automatically be exported to a CSV file, viewing supplier details, deleting a supplier, or viewing all suppliers.

- Item: Handle item-related operations, such as adding a new item that will automatically be exported to a CSV file, viewing item details, deleting an item, or viewing all items.

- Transaction: Create and manage transactions. You can record new transactions that will automatically be exported to a CSV file, view transaction history, deleting a transaction, or viewing all transactions.

To navigate through the menu and perform the desired operations, simply follow the on-screen instructions.

## Additional Information
Change the file directory in the code to the same directory of your project file for the CSV file to be created.

## Contributing


Contributions to this project are welcome. If you'd like to contribute or report any issues, please follow these guidelines:

1. Fork the repository on GitHub.
2. Create a new branch with a descriptive name.
3. Make your changes or bug fixes.
4. Test your changes thoroughly.
5. Create a pull request, explaining the changes you made.
