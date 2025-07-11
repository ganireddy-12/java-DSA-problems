class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> s3=new HashSet<>();
        int left=0;int right=0;int maxlength=0;
        while(right<s.length())
        {
            if(!s3.contains(s.charAt(right)))
            {
                s3.add(s.charAt(right));
                maxlength=Math.max( maxlength,right-left+1);
                right++;
            }
            else
            {
                s3.remove(s.charAt(left));
                left++;
            }
        }
        return maxlength; 
    }
}