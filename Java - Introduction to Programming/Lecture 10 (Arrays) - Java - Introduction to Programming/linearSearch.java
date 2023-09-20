import java.util.Scanner;

public class linearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of Array: ");
        int size = sc.nextInt();
        int numbers[] = new int[size];
        System.out.println("Enter elements of array:");
        for(int i = 0 ; i < size; i++){
            numbers[i] = sc.nextInt();
        }
        System.out.print("Enter the number you want to find: ");
        int x = sc.nextInt();
        for(int i = 0 ; i < size ; i++){
            if(x == numbers[i]){
                System.out.println("The index of "+x+" is "+i);
                break;
            }
        }
        sc.close();
    }
}
