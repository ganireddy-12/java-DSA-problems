class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashMap<Integer,Integer> s=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            int n=nums[i];
            s.put(n,s.getOrDefault(n,0)+1);
        }
        List<Integer> s1=new ArrayList<>();
        for(int val:s.keySet())
        {
            if(s.get(val)==2)
            {
                s1.add(val);
            }
        }
         return s1;
    }
}