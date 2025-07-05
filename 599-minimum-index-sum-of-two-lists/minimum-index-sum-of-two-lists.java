class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        int min=Integer.MAX_VALUE;
        int k=0;
         String[] s = new String[Math.min(list1.length,list2.length)];
        for (int i = 0; i < list1.length; i++) {
            for (int j = 0; j < list2.length; j++) {
                if (list1[i].equals(list2[j])) {
                    int res=i + j;
                    if(res<min)
                    {
                        k = 0;
                        s[k++]=list1[i];
                        min=res;
                    }
                    else if(res==min)
                    {
                        s[k++]=list1[i];
                    }
                }
            }
        }
        return Arrays.copyOf(s,k);

    }
}