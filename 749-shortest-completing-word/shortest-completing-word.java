class Solution {
    public String shortestCompletingWord(String licensePlate, String[] words) {
        int[] target=new int[26];
        for(char c:licensePlate.toLowerCase().toCharArray())
        {
            if(Character.isLetter(c))
            {
                target[c - 'a']++;
            }
        }
        String str=null;
        for(String word:words)
        {
            if(matches(word,target))
            {
                if(str==null || word.length()<str.length())
                {
                    str=word;
                }
            }
        }
        return str;
    }
    private static boolean matches(String word,int[] target)
    {
        int[] res=new int[26];
        for(char c:word.toLowerCase().toCharArray())
        {
            res[c - 'a']++;
        }
        for(int i=0;i<26;i++)
        {
            if(res[i]<target[i])
            {
                return false;
            }
        }
        return true;
    }
}