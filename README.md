# Rectangle Game

Welcome to the Rectangle Game! This is a simple Java program that allows you to move a blue rectangle around the screen using the arrow keys.

## Getting Started

### Prerequisites

Before you start, make sure you have the following software installed on your computer:

- [Java Development Kit (JDK)](https://www.oracle.com/java/technologies/javase-downloads.html)

### Running the Program

1. **Clone the repository**: Download the program files to your computer.

    ```sh
    git clone https://github.com/yourusername/your-repo-name.git
    ```

2. **Navigate to the project directory**:

    ```sh
    cd your-repo-name
    ```

3. **Compile the program**: Open a terminal in the project directory and run the following command:

    ```sh
    javac Main.java
    ```

4. **Run the program**:

    ```sh
    java Main
    ```

### How to Play

- Use the arrow keys on your keyboard to move the blue rectangle around the window:
    - **Up Arrow**: Move up
    - **Down Arrow**: Move down
    - **Left Arrow**: Move left
    - **Right Arrow**: Move right

The rectangle will move in steps of 50 pixels within the 700x700 window.

### Code Overview

- **Main Class**: Sets up the game window and starts the game.
- **Game Class**: Handles the game logic and user input.
    - The rectangle's position is updated based on arrow key inputs.
    - The `paintComponent` method is used to draw the rectangle on the screen.

Feel free to explore and modify the code to learn more about Java Swing and key event handling!
