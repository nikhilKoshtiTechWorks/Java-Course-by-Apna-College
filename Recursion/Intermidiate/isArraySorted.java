package Intermidiate;
// Check is an array is sorted (Strictly Increasing)

public class isArraySorted {
    public static boolean isAnArraySorted(int i, int arr[]){
        if(i==(arr.length-1)){
            return true;
        }

        if(arr[i]<arr[i+1]){
            //array is sorted till now
            return isAnArraySorted(i+1, arr);   // checking for next indexes
        }else{return false;}
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        boolean x = isAnArraySorted(0, arr);
        System.out.println(x);
    }
}
