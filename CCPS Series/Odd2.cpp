#include <iostream>

int main() {
    // Declare variables for start and end range
    int start, end;

    // Ask the user to enter the start and end range
    std::cout << "Enter the start range: ";
    std::cin >> start;

    std::cout << "Enter the end range: ";
    std::cin >> end;

    // Ensure start is odd
    if (start % 2 == 0) {
        ++start;
    }

    // Print all odd numbers between the start and end range using a while loop
    std::cout << "Odd numbers between " << start << " and " << end << " are: ";
    while (start <= end) {
        std::cout << start << " ";
        start += 2; // Move to the next odd number
    }
    std::cout << std::endl;

    return 0;
}