class Solution {
    public int minEatingSpeed(int[] piles, int h) {
          int min=1;
          int max=Arrays.stream(piles).max().getAsInt();
          int ans=max;
          while(min<=max)
          {
            int k=min+(max-min)/2;
            long c=0;
            for(int pile:piles)
            {
                 c+=(pile+k-1)/k;
            }
            if(c<=h)
            {
                ans=k;
                max=k-1;
            }
            else
            {
                min=k+1;
            }
          }
          return ans;
        
    }
}