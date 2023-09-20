public class HollowRectanlge {
    public static void main(String[] args) {
        int i = 1;
        int j = 1;
        int n = 10;     // number of rows
        int m = 10;     // number of columns
        for (i=1 ; i<=n ; i++){                    // accessing row or outer loop
            for (j=1 ; j<=m ; j++){                // accessing column or iner loop
                if(j==1 || j==m || i==1 || i==n){  // for border co-ordinates     || its for 'or'
                    System.out.print("O");       
                }else {System.out.print("0");}   // for in between blank spaces
            }System.out.println();
        }
    }
}
