import java.util.Scanner;

public class EqualTo {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        if (a==b)
            System.out.println("Equal numbers"); 
            else if (a>b) {
                System.out.println("a is greater than b");
            } else 
            System.out.println("a is less than b"); //this statement will check else condition
            System.out.println("xyz"); //this will not check else condition
    }
}
