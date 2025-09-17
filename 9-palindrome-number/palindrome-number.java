class Solution {
    public boolean isPalindrome(int x) {
        int temp=x;
        int pal=0;
        while(x>0)
        {
            int rem=x%10;
            pal=pal*10+rem;
            x/=10;
        }
        return  temp==pal;
        
    }
}