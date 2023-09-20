// Write a function that takes in the radius as input and returns the circumference of a circle.
import java.util.Scanner;

public class Qs8_4 {
    public static double circumferenceOfCircle(double radius){
        return 6.28*radius;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Radius of circle: ");
        double r = sc.nextDouble();
        sc.close();
        System.out.print("The circumference of circle is "+circumferenceOfCircle(r)+" units");
    }
}
