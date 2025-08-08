class Solution {
    public int[] twoSum(int[] nums, int target) {
         HashMap<Integer,Integer> s=new HashMap<>();
         for(int i=0;i<nums.length;i++)
         {
             int need=target-nums[i];
             if(s.containsKey(need))
             {
                return new int[]{i,s.get(need)};
             }
             s.put(nums[i],i);
         }
         return new int[]{-1,-1};
    }
}