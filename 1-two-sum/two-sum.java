class Solution {
    public int[] twoSum(int[] nums, int target) {
         HashMap<Integer,Integer> s=new HashMap<>();
         for(int i=0;i<nums.length;i++)
         {
            int value=target-nums[i];
            if(s.containsKey(value))
            {
                return new int[]{s.get(value),i};
            }
             s.put(nums[i],i);
         }
         return new int[]{-1,-1};
    }
}