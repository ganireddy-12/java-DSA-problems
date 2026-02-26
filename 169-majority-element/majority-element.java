class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer>s =new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            int n=nums[i];
            s.put(n,s.getOrDefault(n,0)+1);
        }
        int res=0;
        for(int c:s.keySet())
        {
            if(s.get(c)>nums.length/2)
            {
                res=c;
            }
        }
        return res;
    }
}