class Solution {
    public int[] twoSum(int[] nums, int target) {

        int[] result;

        for(int i = 0; i<nums.length; i++){
            int cur = nums[i];

            for(int j = 0; j < nums.length; j++){

                if(j == i){
                
                    j++;
                
                }else{

                    int sum = nums[i] + nums[j];
                    if(sum == target){
                        if(i<j){
                            result = new int[]{i, j};
                        }else{
                            result = new int[]{j, i};
                        }
                        
                        
                        return result;
                    }

                }


            }
        }

        return null;

    }
}


