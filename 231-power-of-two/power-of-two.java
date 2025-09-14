class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n<1)
        {
            return false;
        }
        while(n%2==0)
        {
            n/=2;
        }
        return n==1;
        
        /*if(n<1)
        {
           return false;
        }
        int count=0;
        while(n>0)
        {
            if(n%2==1)
            {
                count++;
            }
            n=n/2;
        }
        return count==1;*/
        
    }
}