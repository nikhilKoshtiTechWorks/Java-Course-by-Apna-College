class GFG {
 
    // Function to check if x is power of 2
    static boolean isPowerofTwo(int n)
    {
        int cnt = 0;
        while (n > 0) {
            if ((n & 1) == 1) {
                cnt++; // if n&1 == 1 keep incrementing cnt
                // variable
            }
            n = n >> 1; // keep dividing n by 2 using right
                        // shift operator
        }
        if (cnt == 1) {
            // if cnt = 1 only then it is power of 2
            return true;
        }
        return false;
    }
 
    // Driver code
    public static void main(String[] args)
    {
        // Function call
        if (isPowerofTwo(14) == true)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
 
// This code is contributed by devendra salunke.