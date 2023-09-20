import java.util.Scanner;

public class inputArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int numbers[] = new int[size];

        // to input elements
        for(int i = 0; i<size; i++){
            numbers[i] = sc.nextInt();
        }

        // to access elements
        for(int i = 0; i<size; i++){
            System.out.println(numbers[i]);
        }
        sc.close();
    }
}
