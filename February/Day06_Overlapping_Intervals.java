// GFG POTD - 17 February 2026
// Problem Name: Maximum number of overlapping Intervals

// Problem Link: https://www.geeksforgeeks.org/problems/intersecting-intervals/1


import java.util.Arrays;

public class Day06_Overlapping_Intervals {
        public static int overlapInt(int[][] arr) {
        int n = arr.length;
        int start[] = new int[n];
        int end[] = new int[n];
        
        for(int i=0; i<n; i++){
            start[i] = arr[i][0];
            end[i] = arr[i][1];
        }
            Arrays.sort(start);
            Arrays.sort(end);
         
         int i=0, j=0;
         int overlap = 0;
         int max = 0;
         while(i<n && j<n){
             if(start[i] <= end[j]){
                 overlap++;
                 max = Math.max(max,overlap);
                 i++;
             } else{
                 overlap--;
                 j++;
             }
         }
         return max;
    }
}
