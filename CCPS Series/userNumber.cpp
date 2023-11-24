#include <iostream>

int main() {
    // Declare a variable to store the user input
    int userNumber;

    // Ask the user to enter a number
    std::cout << "Enter a number: ";
    std::cin >> userNumber;

    // Print the next 5 numbers
    std::cout << "The next 5 numbers are: ";
    for (int i = 1; i <= 5; ++i) {
        std::cout << userNumber + i << " ";
    }
    std::cout << std::endl;

    return 0;
}