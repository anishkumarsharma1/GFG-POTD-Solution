// GFG POTD - 5 February 2026
// Problem Name: Maximize Ones (Flip at most K zeros)
// Problem Link: https://www.geeksforgeeks.org/problems/maximize-number-of-1s0905/1


class Day02_MaximizeOnes {

    // Function to return maximum number of 1s
    public int maxOnes(int[] arr, int k) {

        int zeroCount = 0;   // count of zeros in current window
        int start = 0;       // left pointer of sliding window
        int maxOnes = 0;     // result

        // Sliding window approach
        for (int end = 0; end < arr.length; end++) {

            // If current element is zero, increase zero count
            if (arr[end] == 0) {
                zeroCount++;
            }

            // If zero count exceeds k, shrink window from left
            while (zeroCount > k) {
                if (arr[start] == 0) {
                    zeroCount--;
                }
                start++;
            }

            // Update maximum window size
            maxOnes = Math.max(maxOnes, end - start + 1);
        }

        return maxOnes;
    }
}
