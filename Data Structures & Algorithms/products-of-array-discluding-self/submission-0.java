class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int[] result = new int[nums.length];

        for(int i = 0; i < result.length; i++){   //0
            
            int product = 1; 

            //[1, 2, 4, 6]
            // ^  2. 8, 48

            for(int j = 0; j < result.length; j++){ //product  
                
                if(i == j){
                    continue;
                }

                product = product * nums[j];


            }

            result[i] = product;





        }

        return result;



    }
}  
