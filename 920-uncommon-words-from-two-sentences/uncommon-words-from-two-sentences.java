class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        String[] ch=s1.split(" ");
        String[] ch1=s2.split(" ");
        HashMap<String,Integer> s=new HashMap<>();
        for(int i=0;i<ch.length;i++)
        {
            String cha=ch[i];
            s.put(cha,s.getOrDefault(cha,0)+1);
        }
        for(int i=0;i<ch1.length;i++)
        {
            String ch3=ch1[i];
            s.put(ch3,s.getOrDefault(ch3,0)+1);
        }
        ArrayList<String> arr=new ArrayList<>();
        for(String word:s.keySet())
        {
            if(s.get(word)==1)
            {
                 arr.add(word);
            }
        }

        return  arr.toArray(new String[0]);

    }
}