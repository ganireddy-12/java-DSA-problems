class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int min=Arrays.stream(weights).max().getAsInt();
        int max=Arrays.stream(weights).sum();
        int res=max;
        while(min<=max)
        {
            int mid=(min+max)/2;
            if(checkingfun(weights,days,mid))
            {
                res=mid;
                max=mid-1;
            }
            else
            {
                min=mid+1;
            }
        }
        return res;
    }
    public static boolean checkingfun(int[] weights,int days,int cap)
    {
        int dayscount=1;
        int load=0;
        for(int weight:weights)
        {
            if(load+weight>cap)
            {
                dayscount++;
                load=0;
            }
            load+=weight;
        }
        return dayscount<=days;
    }
} 