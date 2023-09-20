package Intermidiate;
// In this code the top most disk is disk no. 1 i.e. n = 1;


public class towerOfHanoi {

    public static int count = 0;

    public static int functionForTowerOfHanoi(int n, String src, String help, String dest){
        /* 
        Here,
        int n is a no. pf disks
        String src is a source tower
        String help is a helper tower
        String dest is a destination tower
        */

        if(n==1){
            System.out.println("Transfer disk "+n+" from "+src+" to "+dest);
            count++;        // as we are doing a move we are incrementing the count
           
            return count;    
        }

        count = functionForTowerOfHanoi(n-1, src, dest, help);           // to maintain the value returned by function
        
        System.out.println("Transfer disk "+n+" from "+src+" to "+dest);
        count++;            // as we are doing a move we are incrementing the count
        
        count = functionForTowerOfHanoi(n-1, help, src, dest);
        return count;

    }
    public static void main(String[] args) {
        System.out.println("\nThe number of Steps: "+functionForTowerOfHanoi(4, "S", "H", "D"));
        

    }
}
