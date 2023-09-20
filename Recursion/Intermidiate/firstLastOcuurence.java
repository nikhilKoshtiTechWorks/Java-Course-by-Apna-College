package Intermidiate;
public class firstLastOcuurence {
    public static int first = -1;
    public static int last = -1;

    public static void firstAndLastOccurence(String str, char element, int i){
        if(i==str.length()){
            System.out.println(first+" "+last);
            return;
        }

        if(str.charAt(i)==element){
            if(first==-1){
                first = i;

            } else{
            last = i;
            }
        }
        firstAndLastOccurence(str, element, i+1);
    }
    public static void main(String[] args) {
        firstAndLastOccurence("ahsjabsjksa", 'j', 0);
    }
}
