class Solution {
    public int maxArea(int[] height) {
        int low=0;
        int high=height.length-1;
        int max=0;
        while(low<high)
        {
            int min=Math.min(height[low],height[high]);
            int area=min*(high-low);
            if(area>max) max=area;
            if(height[low]>height[high]) high--;
            else low++;
        }
        return max;
    }
}