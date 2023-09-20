public class selectionSort {

    public static void printArray(int array[]){
        for(int i = 0; i<array.length; i++){
            System.out.print(array[i]);
        }System.out.println();
    }

    public static void main(String[] args) {

        // time comliexity = O(n^2)
        int arr[] = {7,8,3,1,2,10,-1,5};
        
        for(int i=0; i<arr.length; i++){         // traversing in array
            int smallest = i;
            for(int j=i+1; j<arr.length; j++){   // traversing to find smallest for ith position
                if(arr[smallest]<arr[j]){        // you can chage the condition here for ascending '>' descending '<'
                    smallest = j;
                }
            }
            int temp = arr[smallest];            // swapping is done with smallest index and ith index
            arr[smallest] = arr[i];
            arr[i] = temp;
        }printArray(arr);
    }
}
