#include <iostream>

int main() {
    // Declare variables to store user input and the count of numbers to print
    int userNumber, count;

    // Ask the user to enter a number
    std::cout << "Enter a number: ";
    std::cin >> userNumber;

    // Ask the user for the count of numbers to print
    std::cout << "Enter the count of numbers to print: ";
    std::cin >> count;

    // Print the specified number of consecutive numbers after the user-entered number
    std::cout << "The next " << count << " numbers are: ";
    for (int i = 1; i <= count; ++i) {
        std::cout << userNumber + i << " ";
    }
    std::cout << std::endl;

    return 0;
}