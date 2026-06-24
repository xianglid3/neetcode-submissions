class Solution {
    public int maxArea(int[] heights) {
        
        int left = 0;
        int right = heights.length - 1;
        int maxArea = 0;

        while(left < right){
            int width = right - left;
            int height;
            
            if(heights[left] <= heights[right]){
                height = heights[left];
            }else{
                height = heights[right];
            }
            
            int area = width * height;

            if(area > maxArea){
                maxArea = area;
            }

            
            if(heights[left] < heights[right]){
                left++;
            }else{
                right--;
            }
            



            
        }

        return maxArea;
    }
}
