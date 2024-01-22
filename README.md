# Simple E-commerce Cart System

This is a simple Java project that simulates a basic ecommerce shopping cart system. It allows users to add products to the cart, update quantities, remove items, and calculate the total bill with a discount strategy.

## Features

- Add products to the cart.
- Update quantities of items in the cart.
- Remove items from the cart.
- Calculate the total bill with a discount strategy (percentage-based).

## Usage

To run the project, follow these steps:

1. Clone the repository to your local machine:

   ```shell
   git clone <repository_url>

2. Compile the Java files:

   ```shell
   javac com/EI_Assignment/*.java

3. Run the ecommerce_cart class:

   ```shell
   java com.EI_Assignment.ecommerce_cart


#Project Structure
The project is organized into multiple Java classes:

- Product.java: Represents a product with name, price, and availability.
- ElectronicsProduct.java: Extends Product and represents an electronics product.
- ApparelProduct.java: Extends Product and represents an apparel product.
- DiscountStrategy.java: Defines a discount strategy interface.
- PercentageDiscountStrategy.java: Implements a percentage-based discount strategy.
- ShoppingCart.java: Manages the shopping cart, including adding, updating, and removing items, and calculating the total bill.
- ecommerce_cart.java: Contains the main method to run the program.


---Made By Krutik Soni - as a part Educational Initiatives's Programming Exercise---


