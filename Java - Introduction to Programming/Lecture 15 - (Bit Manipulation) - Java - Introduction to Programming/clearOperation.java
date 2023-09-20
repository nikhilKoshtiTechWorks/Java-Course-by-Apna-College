// Clear 3rd bit (position = 2) of a number n. (n = 0101)
/*
    bitMask: 1<<2 = 0100;
    ~bitMask = 1011;
    ~bitMask & 0101 = 0001; (1 in decimal)
 */
public class clearOperation {
    public static void main(String[] args) {
        int n = 5;
        int position = 2;
        int bitMask = 1<<position;
        int notBitMask = ~bitMask;   // NOT operation on bitMask i.e. negation of bitMask
        int newNumber = notBitMask & n;
        System.out.println(newNumber);  // expected output = 0001 = 1
    }
}
