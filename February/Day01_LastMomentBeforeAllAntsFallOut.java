// GFG POTD - 4 February 2026
// Problem Name: Last Moment Before All Ants Fall Out
// Problem Link: https://www.geeksforgeeks.org/problems/last-moment-before-all-ants-fall-out-of-a-plank/1


public class Day01_LastMomentBeforeAllAntsFallOut {

     public int getLastMoment(int n, int left[], int right[]){
        int result = 0;
        
        
        // left Move ------>
        for(int x : left){
            result = Math.max(x, result);
        }
        
        
        // right Move <---------
        for(int x : right){
            result = Math.max(result, n-x);
        }
        
        return result;
     }
    public static void main(String[] args) {
        int n = 4;
        int left[] = {4, 3};
        int right[] = {0, 1};

        Day01_LastMomentBeforeAllAntsFallOut obj = new Day01_LastMomentBeforeAllAntsFallOut();
        int result = obj.getLastMoment(n, left, right);
        System.out.println("Last moment before all ants fall out: " + result);
 
    }
}