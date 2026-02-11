class Solution {
    public boolean check(int[] nums) {
        int count=0;
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            if(nums[i]>nums[(i+1)%n]) // using of %n is mainly to avoid index outofbounds 
            {
                count++;
            }
        }
        return count<= 1 ? true:false; // if the count is 1 then it is okay to be proceed more than it is not possible to be sorted array 
    }
}