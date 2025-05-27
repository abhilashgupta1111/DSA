class Solution {
    public int lengthOfLongestSubstring(String s)
    {
        if(s.equals(" ") || s.length()==1)
        return 1;
        HashSet<Character> hs = new HashSet<>();
        int strln= s.length();
        int length = 0;
        for(int j=0;j < strln; j++)
        {for(int i=j;i < strln; i++)
        {
            if(hs.contains(s.charAt(i)))
            {
                if(length<hs.size())
                length=hs.size();
                hs.clear();
                break;
            }
            else
            {
                hs.add(s.charAt(i));
                
            }

        }
        
        }
return length;
    }
}