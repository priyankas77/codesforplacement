import java.util.Scanner;

public class IdentityMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of rows for the matrix:");
        int rows = scanner.nextInt();

        System.out.println("Enter the number of columns for the matrix:");
        int cols = scanner.nextInt();

        if (rows != cols) {
            System.out.println("Not  possible ");
            return;
        }

        int[][] mat= new int[rows][cols];

        System.out.println("Enter elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                mat[i][j] = scanner.nextInt();
            }
        }

        if (isIdentityMatrix(mat)) {
            System.out.println("it  is an identity matrix.");
        } else {
            System.out.println("it  is not an identity matrix.");
        }
    }

    public static boolean isIdentityMatrix(int[][] mat) {
        int rows = mat.length;
        int cols = mat[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (i == j) {
                    if (mat[i][j] != 1) {
                        return false;
                    }
                } else {
                    if (mat[i][j] != 0) {
                        return false;
                    }
                }
            }
        }

        return true;
    }
}
