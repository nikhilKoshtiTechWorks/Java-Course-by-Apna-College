package Advance;

/*
 *  Qs. Find the number of ways in which you can invite 'n' people to your party, single or pairs.
 * 
 *  consider n = 3; person A ,person B and person C
 * 
 *  Possible ways,
 *  A   B   C                   for this we will just call recursive function by decrementing input by 1 i.e. (n-1)
 *  A - B   c
 *  A   B - C
 *  A - C   B
 *  
 *  So here, we have 2 (n-1 = 3-1) choices for pairing
 *  i.e. A can pair with B & C
 *  similar case is with B & C they also have two choices
 *  This is the reason why we have multiplied by (n-1) in a pair recursive function at Line 30
 * 
 */
public class partyInvitation {
    public static int countWays(int n){
        if(n<=1){                          // here n<1 condition is for input n=2 (since we call recursive function by passing (n-2)==0)
            return 1;
        }

        // single invitation
        int single = countWays(n-1);

        // pair invitation
        int pair = (n-1) * countWays(n-2);              // here we have (n-1) choices for the second partner

        return single + pair;
    }
    public static void main(String[] args) {
        int n = 3;
        System.out.println(countWays(n));
    }
}
