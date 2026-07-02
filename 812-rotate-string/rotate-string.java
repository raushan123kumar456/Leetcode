class Solution {
    public boolean rotateString(String s, String goal) {
        int size=s.length();
        if(size!=goal.length())
        {
            return false;
        }
       
        
            goal=goal+goal;
        
        for(int i=0;i<goal.length()-size;i++)
        {
            if(goal.substring(i,i+size).equals(s))
            {
                return true;
            }
        }
        return false;
        
    }
}