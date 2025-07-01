class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> s=new HashMap<>();
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            int n=nums[i];
            s.put(n,s.getOrDefault(n,0)+1);
        }
        for(int val:s.keySet())
        {
            arr.add(val);
        }
        Collections.sort(arr,(a,b)->s.get(b)-s.get(a));
        int[] arr1=new int[k];
        for(int i=0;i<k;i++){
            arr1[i]=arr.get(i);
        }
         return arr1;
    }
}