class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> s=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            int n=nums[i];
            s.put(n,s.getOrDefault(n,0)+1);
        }
        int res=0;
        for(int a:s.keySet())
        {
            if(s.get(a)==1)
            {
                res=a;
            }
        }
        return res;
    }
}