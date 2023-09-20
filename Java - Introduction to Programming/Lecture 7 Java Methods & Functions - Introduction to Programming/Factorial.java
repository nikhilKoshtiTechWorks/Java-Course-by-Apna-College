public class Factorial {

    public static int factorial(int a){
        if(a<0){
            System.out.println("invalid input");
            return 0;
        }else{
            int fact = 1;
            for(int i = 1; i<=a; i++){
                fact = fact*i;
            }
            return fact;
        }
    }

    public static void main(String[] args) {
        System.out.println("The Factorial is"+factorial(-5));
    }
}
