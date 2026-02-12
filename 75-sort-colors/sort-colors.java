class Solution {
    public void sortColors(int[] nums) {
        int[] count=new int[3];
        for(int num:nums)
        {
            count[num]++; //this array represents the count of 1,2,3 here how mnay times did they occur here
        }
        int index=0;
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<count[i];j++) //after these values are going to store here
            {
                nums[index++]=i;
            }
        }
    }
}