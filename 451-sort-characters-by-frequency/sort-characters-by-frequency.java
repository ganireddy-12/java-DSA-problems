class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> s1=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            char n=s.charAt(i);
            s1.put(n,s1.getOrDefault(n,0)+1);
        }
       List<Character> map=new ArrayList<>(s1.keySet());
       map.sort((a,b)->s1.get(b)-s1.get(a));
       StringBuilder b = new StringBuilder();
       for(char c:map)
       {
            b.append(String.valueOf(c).repeat(s1.get(c)));
       }
       return b.toString();
    }
}