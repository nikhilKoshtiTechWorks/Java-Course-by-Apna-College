// In bubblr sort we push the heavy(higher) element to the last position

public class bubbleSort {

    public static void printArray(int array[]){
        for(int i = 0; i<array.length; i++){
            System.out.print(array[i]);
        }System.out.println();
    }

    public static void ascendingOrder(int arr[]){
        // time complexity = O(n^2)
        
        for(int i=0; i<arr.length-1; i++){
            for(int j=0; j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    // swap
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
                //for(int x=0; x<arr.length; x++){System.out.print(arr[x]);}System.out.println();   // to see waht is happening at every 
                                                                                                  // iteration
            }//System.out.println();                                                              // this line is also part of this
        }printArray(arr);
    }

    public static void descendingOrder(int arr[]){
        // time complexity = O(n^2)
    
        for(int i=0; i<arr.length-1; i++){
            for(int j=0; j<arr.length-i-1;j++){
                if(arr[j]<arr[j+1]){
                    // swap
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            //for(int x=0; x<arr.length; x++){System.out.print(arr[x]);}System.out.println();    // to see waht is happening at every 
                                                                                                // iteration
            }//System.out.println();
        }printArray(arr);
    }
    public static void main(String[] args) {
        int array[] = {7,8,3,1,2};
        ascendingOrder(array);
        descendingOrder(array);
    }
}
