class Solution {
    public boolean isPowerOfThree(int n) {
        if(n<1)
        {
           return false;
        }
        int count=0;
        while(n>0)
        {   
            if(n%3==1)
            {
                count++;
            }
            if(n%3==2)
            {
                return false;
            }
            n=n/3;
        }
        return count==1;
        
        
    }
}