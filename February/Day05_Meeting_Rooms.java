// GFG POTD - 16 February 2026
// Problem Name: Meeting Rooms
// Problem Link: https://www.geeksforgeeks.org/problems/attend-all-meetings/0

import java.util.Arrays;

public class Day05_Meeting_Rooms {

       static boolean canAttend(int[][] arr) {
        
         Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));
        for(int i=1; i<arr.length; i++){
            if(arr[i][0] < arr[i-1][1])
                return false;
        }
        return true;
    }
}
