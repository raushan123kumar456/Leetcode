class Solution {
    public boolean isThree(int n) {
        if(n<2)
        {
            return false;
        }
        int count=2;
        int i=2;
        while(i<=n/2)
        {
            if(n%i==0)
            {
             count++;
            }
            i++;
        }
        if(count==3)
        {
            return true;
        }
        else
        {
            return false;
        }
        
    }
}