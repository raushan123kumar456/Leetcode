class Solution {
    public int numberOfSteps(int num) {
        int count=0;
        int obtain;
        
        while(num>0)
        {
        
            if(num%2==0)
            {
                obtain=num/2;
            }
            else
            {
              obtain=num-1;
            }
            num=obtain;
            count++;
            
        }
        return count;
        
    }
}