import java.util.Arrays;
class Solution {
    public int majorityElement(int[] nums) {
        /*int max=Integer.MIN_VALUE;
        int min=nums[0];
        //int temp=0;
        for(int x:nums)
        {
            if(x>max)
            {
                max=x;
            }
            else if(x<min)
            {
                min=x;
            }
        }
         
        int[] freq=new int[max-min+1];
        for(int x:nums)
        {
            freq[x-min]++;
        }
        for(int i=0;i<freq.length;i++)
        {
            if(freq[i]>nums.length/2)
            {
                return i+min;
            }
        }
        return -1;*/
        Arrays.sort(nums);
        int st=0;
        int end=nums.length-1;

        int mid=st+(end-st)/2;

        return nums[mid];

        
    }
    
}