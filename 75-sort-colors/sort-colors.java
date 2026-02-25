class Solution {
    public void sortColors(int[] nums) {
         int[] arr=new int[3];
         for(int n:nums)
         {
            arr[n]++; // there indeces are going to increment here staring array is in the form of 0000 
         }
         int k=0;
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<arr[i];j++)  //iterating up to how many 0's ,1's and 2's are there 
            {
                nums[k++]=i;  // adding in that array
            }
        }
    }
}