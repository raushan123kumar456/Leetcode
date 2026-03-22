class Solution {
    public boolean isValid(String s) {
         String op="([{";
         String clo=")]}";
        Stack<Character>stack=new Stack<>();
        for(char c:s.toCharArray())
        {
            if(op.indexOf(c)>=0)
            {
                stack.push(c);
            }
            else if(clo.indexOf(c)>=0)
            {  
                if(stack.isEmpty())
                {
                    return false;
                }
                if(op.indexOf(stack.pop())!=clo.indexOf(c))
                {
                    return false;
                }
            }
        }
        return stack.isEmpty();

    
    }
}