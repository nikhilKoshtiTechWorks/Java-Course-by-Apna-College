import java.util.Scanner;

public class Swirch {
    public static void main(String srgs[]){
        Scanner sc = new Scanner(System.in);
        String button = sc.next();
        sc.close();
        switch (button){
            case "a" : System.out.println("Namaskar"); // checks button == 1
            break;
            case "b" : System.out.println("Namaste"); // these 1,2,3 can also be a,b,c or x,y,z
            break;
            case "c" : System.out.println("Hello");
            break;
            default : System.out.println("Invalid Button"); //will work as a lase else part
        }
    }
}
