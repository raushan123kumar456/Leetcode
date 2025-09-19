class Solution {
    public boolean hasAlternatingBits(int n) {
    int rem=n%2;
    n/=2;
    while(n>0)
    {
        int prev=n%2;
        if(rem==prev)
        {
            return false;
        }
        rem=prev;
        n/=2;
        
    }
        return true;
    }
}