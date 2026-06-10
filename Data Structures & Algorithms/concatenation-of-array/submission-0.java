class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        
        if(n==0){return nums;}
        
        int[] answer = new int[2*n];

        for(int i = 0; i<n; i++){
            answer[i] = nums[i];
            answer[i+n] = nums[i];
        }

        return answer;


    }
}