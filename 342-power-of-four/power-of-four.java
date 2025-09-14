class Solution {
    public boolean isPowerOfFour(int n) {
        /*if(n<1)
        {
            return false;
        }
        while(n%4==0)
        {
            n/=4;
        }
        return n==1;
        */
         if(n<1)
        {
           return false;
        }
        int count=0;
        while(n>0)
        {   
            if(n%4==1)
            {
                count++;
            }
            if(n%4==2||n%4==3)
            {
                return false;
            }
            n=n/4;
        }
        return count==1;
        
        
    }
}