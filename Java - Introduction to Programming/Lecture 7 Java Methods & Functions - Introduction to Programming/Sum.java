import java.util.Scanner;

public class Sum {

    public static int calculateSum(int a, int b){
        int sum = a + b;
        return sum;
    }

    public static int calculateMultiplication(int x, int y){
        int mul = x*y;
        //System.out.println(mul);
        return mul;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();

        int s = calculateSum(a,b);    // here we are storing the return vale of function in new variable called 's' i.e. s = sum;
        System.out.println(s);
        calculateMultiplication(a,b);
        System.out.println("This is another method to access returnType "+calculateMultiplication(a, b));

    }
}
