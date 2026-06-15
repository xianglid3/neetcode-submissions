class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        //3 sum is just doing 2 sum on a fixed number,
        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(nums);

        //[-4, -1, -1, 0, 1, 2]
        
        for(int i = 0; i < nums.length; i++){

            if(i > 0 && nums[i] == nums[i-1]){
                continue;
            }

            int left = i+1;
            int right = nums.length - 1;

            while(left < right){

                int sum = nums[left] + nums[right] + nums[i];

                if(sum == 0){
                    
                    result.add(Arrays.asList(nums[left], nums[right], nums[i]));
                    left++;
                    right--;
                    
                    while(left < right && nums[left] == nums[left - 1]){
                        left++;
                    }
                   
                    while(left < right && nums[right] == nums[right + 1]){
                        right--;
                    }                    

                }else if(sum < 0){
                    left++;
                }else{
                    right--;
                }
            }

        }


        return result;



    }
}
