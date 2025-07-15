class Solution {
    public int maxArea(int[] height) {
        int s=0,end=height.length-1;
        int maxarea=0;
        while(s<end)
        {
            int ca=Math.min(height[s],height[end])*(end-s);
            maxarea=Math.max(maxarea,ca);
            if(height[s]<height[end])
            {
                s++;
            }
            else
            {
                end--;
            }
        }
        return maxarea;
    }
}