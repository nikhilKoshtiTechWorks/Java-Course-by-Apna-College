import java.util.Scanner;

public class Conditional{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        sc.close();

        if (age > 18){
            System.out.println("You are an Adult");
        }
        else{
            System.out.println("You are not an Adult");
        }
    }
}
