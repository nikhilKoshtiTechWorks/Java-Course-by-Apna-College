import java.util.Scanner;

public class reverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder("");
        // taking a user input for StringBuilder
        sb.append(sc.nextLine());
        
        // my logic which has less spacce complexity
        int x = sb.length();
        for(int i = (sb.length()-1); i>(-1); i--){
            sb.append(sb.charAt(i));
        }
        sb.delete(0, x);
        System.out.print(sb);


        // shradha didi's logic which has less time complexity
        for(int i = 0; i<sb.length()/2; i++){
            int back = sb.length() - 1 - i;

            char frontChar = sb.charAt(i);
            char backChar = sb.charAt(back);
            sb.setCharAt(i, backChar);
            sb.setCharAt(back, frontChar);
        }System.out.println(sb);
    sc.close();
    }
}
