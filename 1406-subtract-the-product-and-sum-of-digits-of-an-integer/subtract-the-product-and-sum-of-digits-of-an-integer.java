class Solution {
    public int subtractProductAndSum(int n) {
        int diff;
        int sum=0;
        int multi=1;
        while(n>0)
        { 
            int rem=n%10;
            multi=multi*rem;
            sum=sum+rem;
            n/=10;
        }
        return multi-sum;
        
    }
}