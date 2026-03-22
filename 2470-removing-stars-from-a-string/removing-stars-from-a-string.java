class Solution {
    public String removeStars(String s) {
        Stack<Character>stack=new Stack<>();
        for(char c:s.toCharArray())
        {
              if(c!='*')
              {
                stack.push(c);
              }else
              {
                stack.pop();
              }
        }
        StringBuilder srb=new StringBuilder();
        for(char c:stack)
        {
            srb.append(c);
        }
        return srb.toString();
    }
}