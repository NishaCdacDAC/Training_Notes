#include <iostream>

int main() {
    // Declare variables for start and end range
    int start, end;

    // Ask the user to enter the start and end range
    std::cout << "Enter the start range: ";
    std::cin >> start;

    std::cout << "Enter the end range: ";
    std::cin >> end;

    // Print all odd numbers between the start and end range
    std::cout << "Odd numbers between " << start << " and " << end << " are: ";
    for (int i = start; i <= end; ++i) {
        if (i % 2 != 0) {
            std::cout << i << " ";
        }
    }
    std::cout << std::endl;

    return 0;
}