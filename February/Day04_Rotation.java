// GFG POTD - 9 February 2026
// Problem Name: Find Kth Rotation
// Problem Link: https://www.geeksforgeeks.org/problems/rotation4723/1

public class Day04_Rotation {
        public int findKRotation(int arr[]) {
        
        int n = arr.length;
        
        int result = -1;
        
        int left = 0;
        int right = n - 1;
        
        while(left < right){
            int mid = left + (right - left)/2;
            
            if(arr[mid] < arr[right]){
                right = mid;
            } else{
                left = mid + 1;
            }
        }
        
        return right;
    }
}