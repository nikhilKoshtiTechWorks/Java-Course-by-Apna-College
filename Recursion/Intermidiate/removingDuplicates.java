package Intermidiate;
public class removingDuplicates {

    public static boolean map[] = new boolean[26];      // by default all values are 'false'

    public static void removeDuplicates(String str, int i, String newStr){

        //BASE CASE
        if(i==str.length()){
            System.out.println(newStr);
            return;
        }

        int mapIndex = str.charAt(i)-'a';           // 'a' - 'a' = 0; 'b' - 'a' = 1; ...... 'z' -'a' = 25

        if(map[mapIndex]==true){
            removeDuplicates(str, i+1, newStr);
        }else{
            newStr += str.charAt(i);
            map[mapIndex] = true;                   // changing value to 'true' as we found the char 
            removeDuplicates(str, i+1, newStr);
        }
    }
    public static void main(String[] args) {
        removeDuplicates("abbxchcda", 0, "");
    }
}
