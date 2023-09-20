import java.util.Scanner;

public class stringDeclarationAndMethods {
    public static void main(String[] args) {

        // declaration
        Scanner sc = new Scanner(System.in);

        // concatenation
        String fName = sc.nextLine();
        String lName = sc.nextLine();
        String fullName = fName + " " + lName;
        System.out.println(fullName);

        // lenght()
        System.out.println(fullName.length());
 
        // charAt(int index) for fName = "Tony"
        for(int i = 0; i<fName.length(); i++){
            System.out.println(fName.charAt(i));
        }

        // comapareTo()
        String s1 = "aony1";
        String s2 = "aony3";
        int x = s1.compareTo(s2);
        System.out.println(x);
        if(s1.compareTo(s2)==0){System.out.println("Eqaul");}else{System.out.println("not equal");}
        
        // equals();

        s1.equals(s2);   // will return 'true' or 'false'

        // substring(int beginIndex, int endIndex)
        String name = "Shri Ram";
        System.out.println(name.substring(0,4));

        // parseInt(String)
        String str1 = "123";
        int number1 = Integer.parseInt(str1);
        System.out.println(number1+1);

        // toString(int x)
        int number2 = 123;
        String str2 = Integer.toString(number2);
        System.out.println(str2);

        sc.close();
    }    
}
