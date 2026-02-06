// GFG POTD - 6 February 2026
// Problem Name: Happiest Triplet
// Problem Link: https://www.geeksforgeeks.org/problems/happiest-triplet2921/1


import java.util.Arrays;

public class Day03_HappiestTriplet {
     int[] smallestDiff(int a[], int b[], int c[]) {
      
        
        // Step 1: Sort all arrays
        Arrays.sort(a);
        Arrays.sort(b);
        Arrays.sort(c);
        
        int i = 0, j = 0, k = 0;
        
        int minDiff = Integer.MAX_VALUE;
        
        int x = 0, y = 0, z = 0;   // to store best triplet
        
        // Step 2: Three pointer traversal
        while (i < a.length && j < b.length && k < c.length) {
            
            int maxVal = Math.max(a[i], Math.max(b[j], c[k]));
            int minVal = Math.min(a[i], Math.min(b[j], c[k]));
            
            int diff = maxVal - minVal;
            
            int sum = a[i] + b[j] + c[k];
            int bestSum = x + y + z;
            
            // Step 3: Update answer
            if (diff < minDiff || (diff == minDiff && sum < bestSum)) {
                minDiff = diff;
                x = a[i];
                y = b[j];
                z = c[k];
            }
            
            // Step 4: Move pointer with smallest value
            if (minVal == a[i]) {
                i++;
            } else if (minVal == b[j]) {
                j++;
            } else {
                k++;
            }
        }
        
        // Step 5: Output in decreasing order
         int[] res = new int[]{x, y, z};
         Arrays.sort(res);

         int temp = res[0];
         res[0] = res[2];
         res[2] = temp;

        return res;

    }
}
