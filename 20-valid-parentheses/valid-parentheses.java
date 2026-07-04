class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack=new Stack<>();
        /*String op="({[";
        String cl=")}]";

        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(op.indexOf(ch)>=0)
            {
                stack.push(ch);
            }
            else if(cl.indexOf(ch)>=0)
            {
                if(stack.isEmpty())
                {
                    return false;
                }
                else if(op.indexOf(stack.pop())!=cl.indexOf(ch))
                {
                    return false;
                }
            }
            
        }
        return stack.isEmpty();*/



     for(char ch :s.toCharArray())
     {
        if(ch=='('||ch=='{'||ch=='[')
        {
            stack.push(ch);
        }else
        {
            if(stack.isEmpty())
            {
                return false;
            }else
            {
                char pop=stack.pop();
                if(ch==')'&& pop!='('||ch=='}'&& pop!='{'||ch==']'&&pop!='[')
                {
                    return false;
                }
            }
        }
        
     }
       return stack.isEmpty();
        
    }
}

