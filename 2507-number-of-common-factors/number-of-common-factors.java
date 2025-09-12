class Solution {
    public int commonFactors(int a, int b) {
        int i=2;
        int count=1;
        if(a>=b)
        {
            
            while(i<=a)
            {
                if(a%i==0&&b%i==0)
                {
                        count++;
                }
                i++;
            }
            return count;
        }
        else
        {
            while(i<=b)
            {
                if(a%i==0&&b%i==0)
                {
                        count++;
                }
                i++;
            }
            return count;
        }
        
    }
}