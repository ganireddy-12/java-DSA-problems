class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> s=new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
            s.add(nums[i]);
        }
        int res=0;
        for(int k:s)
        {
            int c=1;
            if(!s.contains(k-1))
            {
                int j=1;
                while(s.contains(k+j))
                {
                    c++;
                    j++;
                }
                res=Math.max(res,c);
            }
            
        }
        return res;
    }
}