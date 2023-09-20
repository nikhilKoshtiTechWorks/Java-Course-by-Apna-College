// Print the spiral order matrix as output for a given matrix of numbers. [Difficult for Beginners]

// Problem is parially solved the issue is that we don't know where to stop the loops.

import java.util.Scanner;

public class HW11_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of colunms: ");
        int cols = sc.nextInt();

        int matrix[][] = new int[rows][cols];
        System.out.println("Enter elements: ");

        for(int i = 0; i<rows; i++){
            for(int j = 0; j<cols; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i<rows; i++){
            for(int j = 0; j<cols; j++){
                System.out.print(matrix[i][j]+" ");
            }System.out.println();
        }

        // Spiral order
        int cr = 0;
        int cc = 0;

        for(int x = 0; x<(rows+cols/4); x++){
            // cols increments row is constant
            for(int j = cc; j<cols-x; j++){
                System.out.print(matrix[cr][cc]+" ");
                cc++;
            }//System.out.println();
            cc--;
            cr++;
            // rows increment col is constant
            for(int i = cr; i<rows-x; i++){
                System.out.print(matrix[cr][cc]+" ");
                cr++;
            }//System.out.println();
            cr--;
            cc--;
            // cols decrement row is constant
            for(int j = cc; j>x-1; j--){
                System.out.print(matrix[cr][cc]+" ");
                cc--;
            }//System.out.println();
            cc++;
            cr--;
            // rows decrement col id constant
            for(int i = cr; i>x; i--){
                System.out.print(matrix[cr][cc]+" ");
                cr--;
            }//System.out.println();
            cr++;
            cc++;
            //System.out.println(cr+" "+cc);
        }


        sc.close();
    }
}


// Niranjan's Logic

// int cr = 0;
// int cc = 0;
// for(int x = 0; x<rows; x++){
//     for(int j = 0; j<cols; j++){
//         System.out.print(matrix[cr][cc]+" ");
//         cc++;
//     }
//     for(int i = 1; i<rows; i++){
//         cr++;
//         System.out.print(matrix[cr][cc-1]+" ");
//     }cc = cc-1;
//     for(int j = 1; j<cols; j++){
//         cc--;
//         System.out.print(matrix[cr][cc]+" ");
//     }
//     for(int i = 2; i<rows; i++){
//         cr--;
//         System.out.print(matrix[cr][cc]+" ");
//     }
//     cc--;
// }