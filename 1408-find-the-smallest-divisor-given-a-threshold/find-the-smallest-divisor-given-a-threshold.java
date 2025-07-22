class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int min=1;
        int max=Arrays.stream(nums).max().getAsInt();
        while(min<max)
        {
            int mid=(min+max)/2;
            int s=0;
            for(int num:nums)
            {
                s+=(num+mid-1)/mid;
            }
            if(s>threshold)
            {
                min=mid+1;
            }
            else
            {
                max=mid;
            }
        }
        return min;
    }
}