import java.util.Scanner;

public class Homework4_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 0;
        do{
            System.out.print("Enter your option: ");
            boolean option = sc.nextBoolean();
            if (option == true){

                while(option == true){
                    System.out.print("enter marks: ");
                    int marks = sc.nextInt();
                    
                    if(marks>90){System.out.println("Great!");}
                    else if(marks>60){System.out.println("Good!");}
                    else{System.out.println("Not Bad!");}
                }
            }else {x=1;}
            }while(x==0);
            sc.close();
        }
    }
        
