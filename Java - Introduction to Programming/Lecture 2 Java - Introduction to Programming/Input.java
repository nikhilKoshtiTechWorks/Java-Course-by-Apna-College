/* Qs. 1 Take 2 variables 'a' & 'b' and print their sum */
/* Qs. 2
   Make a program that takes the radius of a circle as input, calculates its radius and area and prints it as output to the user.

 */

import java.util.Scanner; //java.util is a package (collection of code) which we are importing (using that packeage code in our code)

public class Input {
    public static void main(String args[]){
        //Input
        Scanner sc = new Scanner(System.in); //'Scanner' is a class & sc is a object
        String name = sc.next();             //'next' will just take a word as input
        System.out.println(name);
        //To take a whole line as code we use following
        Scanner sc1 = new Scanner(System.in);
        String name2 = sc1.nextLine();
        System.out.println(name2);
        
        /*For different data types we have following
        nextInt()
        nextFloat()
        etc.
        */
        
        System.out.println("Answer of Qs. 1\n Enter the values of 'a' and 'b'");
        Scanner sc2 = new Scanner(System.in);
        int a = sc2.nextInt();
        int b = sc2.nextInt();
        int sum = a + b;
        System.out.println(sum);
        
        System.out.println("Answer of Qs. 2\n Enter the radius of Circle");        
        Scanner sc3 = new Scanner(System.in);
        double radius = sc3.nextDouble();
        final double pi = 3.14;
        double area = radius * pi;
        System.out.println(area);
        sc.close();
        sc1.close();
        sc2.close();
        sc3.close();
    }
}
