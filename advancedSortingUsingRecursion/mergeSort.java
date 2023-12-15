package advancedSortingUsingRecursion;

import java.util.Scanner;

// public class mergeSort {

//     public static void conquer(int arr[], int si, int mid, int ei) {
//         int [] mergedArr = new int[ei - si + 1];
 
//         int idx1 = si;              // tracks first array
//         int idx2 = mid + 1;         // tracks second array

//         int x = 0;                  // tracks mergedArr

//         while((idx1 <= mid) && (idx2 <= ei)) {
//             if(arr[idx1] <= arr[idx2]){
//                 mergedArr[x++] = arr[idx1++];
//             } else {
//                 mergedArr[x++] = arr[idx2++];
//             }
//         }

//         while (idx1 <= mid) {
//             mergedArr[x++] = arr[idx1++];
//         }

//         while (idx2 <= ei) {
//             mergedArr[x++] = arr[idx2++];
//         }

//         for(int i = 0, j = si; i < mergedArr.length; i++, j++) {
//             arr[j] = mergedArr[i];
//         }
//     }

//     public static void divide(int arr[], int si, int ei) {      // si -> starting index     ; ei -> ending index

//         if(si == ei){       // case can also be 'si >= ei'
//             return;
//         }

//         int mid = si + (ei - si) / 2;       // (si + ei) / 2  avoid this calculation for space complexity issues like (si + ei) can exceed 'int' limits

//         divide(arr, si, mid);
//         divide(arr, mid+1, ei);
//         conquer(arr, si, mid, ei);
//     }
//     public static void main(String[] args) {
//         int [] arr = {6,4,8,2,3,5};
//         int n = arr.length;

//         divide(arr, 0, n-1);

//         for(int i = 0; i < n; i++){
//             System.out.print(arr[i]+" ");
//         }System.out.println();
//     }
// }


        //# Reivised the coding on GDB Compiler          

public class mergeSort
{
    public static void conquer(int[] arr, int si, int mid, int ei) {
        int[] merged = new int[ei-si+1];        // to create new sorted array
        
        int index1 = si;
        int index2 = mid + 1;
        int x = 0;
        
        while(index1<=mid && index2<= ei) {
            if(arr[index1] <= arr[index2]) {
                merged[x] = arr[index1];
                x++; index1++;
            } else {
                merged[x] = arr[index2];
                x++; index2++;
            }
        }
        
        while(index1<=mid) {
            merged[x] = arr[index1];
                x++; index1++;
        }
        
        while(index2<=ei) {
            merged[x] = arr[index2];
                x++; index2++;
        }
        
        for(int i = 0, j = si; i<merged.length; i++, j++){
            arr[j] = merged[i];
        }
    }
    
    public static void divide(int[] arr, int si, int ei) {
        if(si == ei) {
            return;
        }
        int mid = (si + ei) / 2;
        
        divide(arr, si, mid);
        divide(arr, mid+1, ei);
        conquer(arr, si, mid, ei);
        
    }
    
	public static void main(String[] args) {
	    
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = sc.nextInt();

        int arr[] = new int[size];

        // to input elements
        System.out.print("Enter elements of array: ");
        for(int i = 0; i<size; i++){
            arr[i] = sc.nextInt();
        }
	    System.out.print("Unsorted array: ");
	    for(int i = 0; i< arr.length; i++) {
		    System.out.print(arr[i] + " ");
		}System.out.println();
		
		divide(arr, 0, arr.length-1);
		
		System.out.print("Sorted array: ");
		for(int i = 0; i< arr.length; i++) {
		    System.out.print(arr[i] + " ");
		}
        sc.close();
	}
}


