// Set the 2nd bit (position = 1) of a number n. (n=0101) = (5) in decimal
/*
    bit mask: 1<<1;
    OR: 0010 | 0101 = 0111;
    Here output should be 0111 = 7
 */
public class set_operation {
    public static void main(String[] args) {
        int n = 5;
        int position = 1;
        int bitmask = 1<<position;
        n = n | bitmask;
        System.out.println(n);
    }
}
