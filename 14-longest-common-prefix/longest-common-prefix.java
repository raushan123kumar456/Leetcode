import java.util.Arrays;
class Solution {
    public String longestCommonPrefix(String[] strs) {
       Arrays.sort(strs);

        String first = strs[0];
        String last = strs[strs.length - 1];

        String temp = "";

        int i = 0;

        while (i < first.length() && i < last.length()) {

            if (first.charAt(i) == last.charAt(i)) {
                temp += first.charAt(i);
            } else {
                break;
            }

            i++;
           
        } 
        return temp;
       
      
        
    }
}