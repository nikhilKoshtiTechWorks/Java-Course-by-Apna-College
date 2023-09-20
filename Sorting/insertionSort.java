public class insertionSort {

    public static void printArray(int array[]){
        for(int i = 0; i<array.length; i++){
            System.out.print(array[i]);
        }System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {7,8,3,1,2};

        for(int i=1; i<arr.length; i++){          // range of unsorted array
            int current = arr[i];
            int j = i-1;                          // 'j' tracks the sorted part of array
            while(j>=0 && arr[j]>current){
                arr[j+1] = arr[j];                // pushing jth element to j+1
                j--;
            }
            // placement ith element i.e. current at the postion next to 'j' where while condition is dissatisfied
            arr[j+1] = current;   
        }
        printArray(arr);    
    }
}

