class Solution {
    public String clearDigits(String s) {

        Stack<Character>stack=new Stack<>();
        for(char c:s.toCharArray())
         {
            if(c>=45 && c<=57)
            {
                stack.pop();
            }
            else
            {
               stack.push(c); 
            }
         }
         StringBuilder stb=new StringBuilder();
         for(char c:stack)
         {
            stb.append(c);
         }

        return stb.toString();
    }
}