class Solution {
    public int findKthPositive(int[] arr, int k) {
        int max=Arrays.stream(arr).max().getAsInt();
        ArrayList<Integer> s=new ArrayList<>();
        int current=1;
        int i=0;
        while(s.size()<k)
        {
            if(i<arr.length && arr[i]==current)
            {
                i++;
            }
            else
            {
                s.add(current);
            }
            current++;
        }
        return s.get(k-1);
    }
}