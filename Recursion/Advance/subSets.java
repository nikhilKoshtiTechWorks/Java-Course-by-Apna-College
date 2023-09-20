/*
 *  Qs. Print all the subsets of a set of first 'n' natural numbers
 *  
 *  eg. n = 3; S = {1,2,3}
 *  subsets = {1,2,3} , {1,2} , {1,3} , {2,3} , {1} , {2} , {3} , {}
 *  
 *  We have note this that every element of set S has a choice to appear in subset or not to appear in subset
 * 
 */
package Advance;

import java.util.ArrayList;
// ArrayList is a dynamic array which do not need mention of array size it will dynamically change as we add or remove the elements

public class subSets {
    public static void printSubset(ArrayList<Integer>subset){
        for(int i=0; i<subset.size(); i++){
            System.out.print(subset.get(i)+" ");
        }
        System.out.println();
    }
    public static void findSubsets(int n, ArrayList<Integer> subset){
        if(n==0){
            printSubset(subset);
            return;
        }
        // adding in ArrayList
        subset.add(n);
        findSubsets(n-1, subset);

        // not adding in Arraylist
        subset.remove(subset.size()-1);  // removing the n=3 in first layer of function to replicate the case where 'n' is not appeared
        findSubsets(n-1, subset);
    }
    public static void main(String[] args) {
        int n = 3;
        ArrayList<Integer> subset = new ArrayList<>();
        findSubsets(n, subset);
    }
}
