import java.util.Scanner;

public class HW_11_2_Trial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of colunms: ");
        int cols = sc.nextInt();
        int loop = 0;
        
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
        int y = 0;
        System.out.println((loop-1)/2);
        if(rows>cols){
            loop = cols+1;
            for(int x = 0; x<((loop-1)/2); x++){
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
                y++;
                //System.out.println(cr+" "+cc);
            }
    
            if(loop%2!=0){
                for(int x = y; x<y+1; x++){
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
                }
            }
            
        }else{
            loop = rows;
            for(int x = 0; x<((loop-1)/2); x++){
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
                y++;
                //System.out.println(cr+" "+cc);
            }
    
            if(loop%2==0){
                for(int x = y; x<y+1; x++){
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
                }
            }else{
                for(int x = y; x<y+1; x++){
                    // cols increments row is constant
                    for(int j = cc; j<cols-x; j++){
                        System.out.print(matrix[cr][cc]+" ");
                        cc++;
                    }//System.out.println();
                    cc--;
                    cr++;
                }
            }
        }
        sc.close();
    }
}
