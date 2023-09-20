// For a given matrix of N x M, print its transpose.

import java.util.Scanner;

public class HW11_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of colunms: ");
        int cols = sc.nextInt();

        int matrix[][] = new int[rows][cols];
        System.out.println("Enter elements: ");

        // for printing actual matrix
        for(int i = 0; i<rows; i++){
            for(int j = 0; j<cols; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        // for printing transpose
        System.out.println("Transpose of Matrix:");
        for(int i = 0; i<rows; i++){
            System.out.print("[ ");
            for(int j = 0; j<cols; j++){
                System.out.print(matrix[i][j]+" ");
            }System.out.println("]");
        }
        System.out.println("is:");
        for(int i = 0; i<cols; i++){
            System.out.print("[ ");
            for(int j = 0; j<rows; j++){
                System.out.print(matrix[j][i]+" ");
            }System.out.println("]");
        }

        System.out.println("Spiral order is as follows: ");
        

    sc.close();}
}
