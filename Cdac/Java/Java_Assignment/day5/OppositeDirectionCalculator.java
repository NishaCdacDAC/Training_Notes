
/*Define an enum for cardinal directions (NORTH, SOUTH, EAST, WEST).
Write a program that asks the user for a direction (e.g., "NORTH") and
then calculates and prints the opposite direction.*/

import java.util.Scanner;

// Enum for cardinal directions
enum CardinalDirection {
    NORTH, SOUTH, EAST, WEST;

    // Get the opposite direction
    public CardinalDirection getOppositeDirection() {
        switch (this) {
            case NORTH:
                return SOUTH;
            case SOUTH:
                return NORTH;
            case EAST:
                return WEST;
            case WEST:
                return EAST;
            default:
                return null; 
        }
    }
}
public class OppositeDirectionCalculator 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a cardinal direction: ");
        String userInput = scanner.nextLine().toUpperCase();

        try {
            CardinalDirection inputDirection = CardinalDirection.valueOf(userInput);
            CardinalDirection oppositeDirection = inputDirection.getOppositeDirection();

            if (oppositeDirection != null) {
                System.out.println("The opposite direction is: " + oppositeDirection);
            } else {
                System.out.println("Invalid cardinal direction.");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid cardinal direction input.");
        }

        scanner.close();
    }
}
