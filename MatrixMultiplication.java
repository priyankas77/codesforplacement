import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of rows for matrix A:");
        int rowsA = scanner.nextInt();
        System.out.println("Enter the number of columns for matrix A:");
        int colsA = scanner.nextInt();
        System.out.println("Enter the number of rows for matrix B:");
        int rowsB = scanner.nextInt();
        System.out.println("Enter the number of columns for matrix B:");
        int colsB = scanner.nextInt();
           if (colsA != rowsB) {
            System.out.println(" multiplication is not possible ");
            return;
        }
         int[][] matrixA = new int[rowsA][colsA];
          int[][] matrixB = new int[rowsB][colsB];
       System.out.println("Enter elements of mat A:");
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsA; j++) {
                matrixA[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Enter elements of mat B:");
        for (int i = 0; i < rowsB; i++) {
            for (int j = 0; j < colsB; j++) {
                matrixB[i][j] = scanner.nextInt();
            }
        }

        int[][] result = multiplyMatrices(matrixA, matrixB);

        System.out.println("Result:");
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] multiplyMatrices(int[][] matrixA, int[][] matrixB) {
        int rowsA = matrixA.length;
        int colsA = matrixA[0].length;
        int rowsB = matrixB.length;
        int colsB = matrixB[0].length;

        int[][] result = new int[rowsA][colsB];

        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                for (int k = 0; k < colsA; k++) {
                    result[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }

        return result;
    }
}