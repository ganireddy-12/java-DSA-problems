class Solution {
    public int singleNumber(int[] nums) {
         HashMap<Integer,Integer> s=new HashMap<>();
         int res=0;
         for(int i=0;i<nums.length;i++)
         {
            int n=nums[i];
            s.put(n,s.getOrDefault(n,0)+1);
         }
         for(int c:s.keySet())
         {
            if(s.get(c)==1)
            {
                res=c;
            }
         }
         return res;
    }
}