# Console-Based Dealership Inventory Application

## Description

This is a console-based application for managing a car dealership's inventory. Designed for use by salespeople or sales managers, it allows users to search, list, add, and remove vehicles from a dealership inventory stored in a pipe-delimited text file.

## Features

The application supports the following actions:

- ` 1 - Find vehicles within a price range
- ` 2 - Find vehicles by make/model
- ` 3 - Find vehicles by year range
- ` 4 - Find vehicles by color
- ` 5 - Find vehicles by mileage range
- ` 6 - Find vehicles by type (car, truck, SUV, van)
- ` 7 - List all vehicles
- ` 8 - Add a vehicle
- ` 9 - Remove a vehicle
- ` 99 - Quit the application

All inventory changes (add/remove) are saved to a persistent file.

## Project Structure

The application is divided into the following main classes:

### Vehicle
- Holds data for a single vehicle.
- Attributes: VIN, year, make, model, type, color, mileage, price.

### Dealership
- Holds dealership information (name, address, phone).
- Maintains a list of vehicles.
- Provides methods to search, add, and remove vehicles.

### DealershipFileManager
- Reads vehicle data from a pipe-delimited file and constructs a `Dealership` object.
- Saves dealership and vehicle data back into the file in the same format.

### UserInterface
- Handles all user interaction (displaying menus, reading input).
- Dispatches user commands to appropriate `Dealership` methods.

### Program
- Contains the `main()` method.
- Starts the application by initializing the `UserInterface`.

## Data File Format

The vehicle inventory is stored in a pipe-delimited file.


