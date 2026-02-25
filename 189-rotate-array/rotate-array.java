 class Solution {
    public void rotate(int[] nums, int k) {
         int n=nums.length;
         k=k%n;
         reverse(nums,0,n-1); // full array sorted
         reverse(nums,0,k-1); // upto k elements sorted
         reverse(nums,k,n-1); // upto k to n-1 elements sorted
    }
    private void reverse(int[] nums,int l,int r)
    {
        while(l<r)
        {
            int temp=nums[l];
            nums[l]=nums[r];
            nums[r]=temp;
            l++;
            r--;
        }
    }
    }