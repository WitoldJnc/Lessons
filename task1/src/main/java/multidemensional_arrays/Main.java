package multidemensional_arrays;

public class Main {
    public static void main(String[] args) {
        int matixSize = 9;

        printMatrix(matixSize);


    }

    public static void printMatrix(int size) {
        int[][] matrix = new int[size][size];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][matrix.length - i - 1] = 1;
                matrix[i][i] = 1;
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

}