// Get the 3rd bit (position = 2) of a number n. (n=0101) = (5) in decimal
/*
    bitmask = 1<<2 = 0100;
    AND: 0100 & 0101 = 0100;
    if bitmask&n == 0 then ith bit is '0'
    else ith bit is '1'
*/ 
public class get_operation {
    public static void main(String[] args) {
        int n = 5;  // binary --> 0101
        int pos = 2;
        int bitmask = 1<<pos;

        if ((bitmask&n)==0){
            System.out.println("bit is '0'");
        }else{
            System.out.println("bit is '1'");
        }
    }
}
