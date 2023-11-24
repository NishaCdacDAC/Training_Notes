public class Matrix {
    private int rows;
    private int columns;
    private int[][] elements;

    public Matrix(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        this.elements = new int[rows][columns];
    }

    public int getRows() 
    {
        return rows;
    }

    public int getColumns() 
    {
        return columns;
    }

    public void setElement(int i, int j, int value) {
        if (i >= 0 && i < rows && j >= 0 && j < columns) 
        {
            elements[i][j] = value;
        } else {
            System.out.println("Invalid position.");
        }
    }

    public void add(Matrix other) {
        if (this.rows != other.rows || this.columns != other.columns) 
        {
            System.out.println("Matrices cannot be added.");
            return;
        }

        for (int i = 0; i < rows; i++)
         {
            for (int j = 0; j < columns; j++) 
            {
                this.elements[i][j] += other.elements[i][j];
            }
        }
    }

    public void display() {
        for (int i = 0; i < rows; i++) 
        {
            for (int j = 0; j < columns; j++)
             {
                System.out.print(elements[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Matrix matrix1 = new Matrix(2, 3);
        Matrix matrix2 = new Matrix(2, 3);

        // Set elements in matrix1
        matrix1.setElement(0, 0, 1);
        matrix1.setElement(0, 1, 2);
        matrix1.setElement(0, 2, 3);
        matrix1.setElement(1, 0, 4);
        matrix1.setElement(1, 1, 5);
        matrix1.setElement(1, 2, 6);

        // Set elements in matrix2
        matrix2.setElement(0, 0, 7);
        matrix2.setElement(0, 1, 8);
        matrix2.setElement(0, 2, 9);
        matrix2.setElement(1, 0, 10);
        matrix2.setElement(1, 1, 11);
        matrix2.setElement(1, 2, 12);

        System.out.println("Matrix 1:");
        matrix1.display();

        System.out.println("\nMatrix 2:");
        matrix2.display();

        System.out.println("\nAdding Matrix 1 and Matrix 2:");
        matrix1.add(matrix2);
        matrix1.display();
    }
}
