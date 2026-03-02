class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        HashSet<List<Integer>> s=new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                 HashSet<Integer>s1=new HashSet<>();
                 for(int k=j+1;k<nums.length;k++)
                 {
                    long sum=(long)nums[i]+nums[j]+nums[k];
                    long fourth=target-sum;
                    if(fourth >= Integer.MIN_VALUE && fourth <= Integer.MAX_VALUE 
                        &&s1.contains((int)fourth))
                    {
                        List<Integer> r=Arrays.asList(nums[i],nums[j],nums[k],(int)fourth);
                        Collections.sort(r);
                        s.add(r);
                    }
                    s1.add(nums[k]);
                 }
            }
        }
        return new ArrayList<>(s);
    }
}