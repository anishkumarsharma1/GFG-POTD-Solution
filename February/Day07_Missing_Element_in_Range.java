// GFG POTD - 19 February 2026
// Problem Name: Missing Element in Range
// Problem Link: https://www.geeksforgeeks.org/problems/missing-element-in-range/1

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Day07_Missing_Element_in_Range {

       public ArrayList<Integer> missingRange(int[] arr, int low, int high) {
        // code here
        ArrayList<Integer>  ans = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        
        //Insert all element into Set
        for(int i=0; i<arr.length; i++){
            set.add(arr[i]);
        }
        
        //Check for missing number in range
        for(int i = low; i <= high; i++){
            if(!set.contains(i)){
                ans.add(i);
            }
        }
        return ans;
    }
}
