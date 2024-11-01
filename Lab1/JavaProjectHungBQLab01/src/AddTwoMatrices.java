import java.util.Scanner;

public class AddTwoMatrices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows for the matrices ");
        int rows = sc.nextInt();
        System.out.println("Enter the number of cols for the matrices ");
        int cols = sc.nextInt();

        int[][] firstMatrix = new int[rows][cols];
        int[][] secondMatrix = new int[rows][cols];
        int[][] sumMatrix = new int[rows][cols];

        System.out.println("Enter the elements of the first matrix:");
        enterMatrix(firstMatrix, rows, cols);

        System.out.println("Enter the elements of the second matrix:");
        enterMatrix(secondMatrix, rows, cols);
        //add two matrices
        for(int i = 0 ; i < rows ; i++) {
            for(int j = 0 ; j < cols ; j++) {
                sumMatrix[i][j] = firstMatrix[i][j] + secondMatrix[i][j];
            }
        }

        System.out.println("The result of matrix addition is:");
        printMatrix(sumMatrix, rows, cols);

        sc.close();
    }
    public static void enterMatrix (int[][] matrix, int rows, int cols) {
        Scanner sc = new Scanner(System.in);
        for(int i = 0 ; i < rows ; i++) {
            for(int j = 0 ; j < cols ; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
    }
    public static void printMatrix (int[][] matrix, int rows, int cols) {
        for(int i = 0 ; i < rows ; i++) {
            for(int j = 0 ; j < cols ; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
