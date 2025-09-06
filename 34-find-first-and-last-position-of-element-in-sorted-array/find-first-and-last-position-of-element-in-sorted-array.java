class Solution {
    public int[] searchRange(int[] nums, int target) {
         int first=lowerbound(nums,target);
         if(first==nums.length || nums[first]!=target)
         {
            return new int[]{-1,-1};
         }
         int last=upperbound(nums,target)-1;
         return new int[]{first,last};
    }
    private int lowerbound(int[] nums,int target)
    {
        int l=0,r=nums.length-1;
        int res=nums.length;
        while(l<=r)
        {
            int mid=(l+r)/2;
            if(nums[mid]>=target)
            {
                res=mid;
                r=mid-1;
            }
            else
            {
                l=mid+1;
            }
        }
        return res;
    }
    private int upperbound(int[] nums,int target)
    {
        int l=0,r=nums.length-1;
        int res=nums.length;
        while(l<=r)
        {
            int mid=(l+r)/2;
            if(nums[mid]>target)
            {
                res=mid;
                r=mid-1;
            }
            else
            {
                l=mid+1;
            }
        }
        return res;
    }
}