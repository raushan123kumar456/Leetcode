class Solution {
    public void moveZeroes(int[] nums) {
        /*int n=nums.length;
        int i=0;
        int j=0;
        while(i<n)
        {
            if(nums[i]!=0)
            {
              
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                i++;
                j++;
            
            }
            else
            {
                i++;
            }
           
        }*/
        int index=0;
        for(int i=0;i<nums.length;i++)
        {   //move all zero number 
            if(nums[i]!=0)
            {
                nums[index]=nums[i];
                index++;
            }
        }
        //fill all remaining element
        while(index<nums.length)
        {
            nums[index]=0;
            index++;
            
        }
        
    }
}