class Solution {
    public String reverseWords(String s) {
        String word="";
        String temp="";
        for(int i=0;i<s.length();i++)
        { 
            char ch=s.charAt(i);
            if(ch!=' ')
            {
                temp=ch+temp;
            }
            if(ch==' '||i==s.length()-1)
            {
                word=word +" "+ temp;
                temp="";
            }
        }
        return word.trim();
        
    }
}