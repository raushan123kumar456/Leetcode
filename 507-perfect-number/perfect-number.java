class Solution {
    public boolean checkPerfectNumber(int num) {
        if(num<6)
        {
            return false;
        }
        
        int sum=1;
        int n=2;
        while(n*n<=num)
        {

            if(num%n==0)
            {
                int fact1=n;
                int fact2=num/n;
                if(fact1!=fact2)
                {
                    sum=sum+fact2+fact1;
                }
                else
                {
                     sum=sum+fact1;
                }
               

            }

            n++;   
            
        }
        return num==sum;
       
    }
}