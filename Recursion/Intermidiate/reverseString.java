package Intermidiate;
public class reverseString{
    public static void reverseMyString(String x, int i){
        if(i==0){
            System.out.print(x.charAt(i));
            return;
        }
        System.out.print(x.charAt(i));
        reverseMyString(x, i-1);
    }
    public static void main(String[] args) {
        String x = "aman";
        reverseMyString(x, x.length()-1);
    }
}
