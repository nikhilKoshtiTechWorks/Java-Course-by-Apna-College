/*
    Floyd's Triangle

    1                      i=1, i
    2  3                   i=2, i,i+1
    4  5  6                i=3, i+1,i+2,i+3
    7  8  9  10            i=4, i+3,i+4,i+5,i+6
    11 12 13 14 15         i=5, i+6,i+7,i+8,i+9,i+10
    16 17 18 19 20 21      i=6, i+10,i+11,i+12,i+13,i+14,i+15
 */
public class FloydTriangle {
    public static void main(String[] args) {
        int n = 5;
        // for(int i = 1; i<=n; i++){
        //     for(int j = 0; j<i; j++){
        //         System.out.print(i+(j*i));
        //     }
        //     System.out.println();
        // }

        int x=1;
            for(int i = 1; i<=n; i++){
                for(int j=1; j<=i; j++){
                    System.out.print(x+"\t");
                    x++;
                }System.out.println();
            }
    }
}