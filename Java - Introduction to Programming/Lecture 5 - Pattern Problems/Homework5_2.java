/*
In this code I have ignored the blank spaces after the number means instead of "_____1_____" I have printed "_____1"
         1                                                                     "____2_2____" I have printed "____2_2" 
        2 2                                                                    "___3_3_3___"                "____3_3_3"                 
       3 3 3                                                                   "__4_4_4_4__"                "__4_4_4_4_"
      4 4 4 4                                                                  "_5_5_5_5_5_"                "_5_5_5_5_5_"
     5 5 5 5 5                                                                  

 */

public class Homework5_2 {
    public static void main(String[] args) {
        int n =5;
        for(int i =1; i<=n; i++){
                for(int x =1; x<=n-i; x++){
                    System.out.print(" ");
                }
                for(int x =1; x<=i; x++){
                    System.out.print(i+" ");
                }System.out.println();
        }
    }
}
