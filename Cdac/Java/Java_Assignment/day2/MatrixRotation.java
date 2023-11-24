/*Rotate a matrix by 90 degree in clockwise direction in Java. */


import java.util.Scanner;

public class MatrixRotation 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();

        System.out.print("Enter the number of columns: ");
        int cols = scanner.nextInt();

        int[][] matrix = new int[rows][cols];

        System.out.println("Enter the matrix elements:");
        for (int i = 0; i < rows; i++) 
        {
            for (int j = 0; j < cols; j++) 
            {
                matrix[i][j] = scanner.nextInt();
               
            }
            
          }

        rotateMatrixClockwise(matrix);

        System.out.println("Rotated matrix:");
        for (int i = 0; i < cols; i++) {
            for (int j = rows - 1; j >= 0; j--) 
            {
                System.out.print(matrix[j][i] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }

    public static void rotateMatrixClockwise(int[][] matrix) 
    {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int[][] rotatedMatrix = new int[cols][rows];

        for (int i = 0; i < rows; i++) 
        {
            for (int j = 0; j < cols; j++)
             {
                rotatedMatrix[j][rows - 1 - i] = matrix[i][j];
            }
        }

       
        for (int i = 0; i < cols; i++) 
        {
            System.arraycopy(rotatedMatrix[i], 0, matrix[i], 0, rows);
        }
    }
}
