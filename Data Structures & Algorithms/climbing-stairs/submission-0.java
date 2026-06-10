class Solution {
    public int climbStairs(int n) {
        int one = 1; // at n - 2
        int two = 1; // at n - 1

        
        // [ 5 3 2 1 1]

        for(int i = 2; i <= n; i++){
            int temp = one;
            one = one + two;  // 2
            two = temp;
        }

        return one;


    }
}
