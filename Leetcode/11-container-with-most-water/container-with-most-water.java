class Solution {
    public int maxArea(int[] height) {
        int maxWater = 0;
        int i=0, j=height.length - 1;

        while(i<j) {
            int minHt = Math.min (height[i], height[j]);

            int area = minHt * (j - i);
            maxWater = Math.max(maxWater, area);

            if(height[i] < height[j]){
                i++;
            } else {j--;}
        } 
        return maxWater;
        } 
}