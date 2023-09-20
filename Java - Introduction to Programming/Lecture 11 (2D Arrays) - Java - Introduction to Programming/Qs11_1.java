import java.util.Scanner;

public class Qs11_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();
        int matrix[][] = new int[rows][cols];

        System.out.println("Enter the elements:");
        for(int i = 0; i<rows; i++){
            for(int j = 0; j<cols; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.print("Enter the value of 'x': ");
        int x = sc.nextInt();
        for(int i = 0; i<rows; i++){
            for(int j = 0; j<cols; j++){
                if(matrix[i][j]==x){
                    System.out.println("The entered number x="+x+" is at location ("+(i)+", "+(j)+")");
                }
            }
        }
        sc.close();
    }
}
