package advancedSortingUsingRecursion;

public class quickSort {

    public static int partition(int[] arr, int high, int low) {
        int pivot = arr[high];
        int x = low - 1;

        for(int i = low; i < high ;i++) { 
            if(arr[i] < pivot) {
                x++;

                // swap
                int temp = arr[x];
                arr[x] = arr[i];
                arr[i] = temp;
            }
        }
        for(int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }System.out.println();


        x++;
        int temp = arr[x];
        arr[x] = arr[high];
        arr[high] = temp;

        return x;       // index of pivot
    }
    public static void pivot (int[] arr, int low, int high) {
        if(low < high) {
            int pidx = partition(arr, high, low);
            
            for(int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }System.out.println();

            pivot(arr, low, pidx-1);
            pivot(arr, pidx+1, high);
            return;
        }
    }
    public static void main(String[] args) {
        int [] arr = {2,4,1,6,3};

        pivot(arr, 0, arr.length-1);

        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
