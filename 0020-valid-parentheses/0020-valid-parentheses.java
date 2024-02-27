class Solution {
    public boolean isValid(String str) {
        
        Stack<Character> s = new Stack<>();
        
        Map<Character,Character> map = new HashMap<>();
        map.put('(',')');
        map.put('{','}');
        map.put('[',']');
        
        for(int i =0;i<str.length();i++)
        {
            if(map.containsKey(str.charAt(i)))
            {
                s.push(str.charAt(i));
            }
            else if(!s.isEmpty()&& map.containsKey(s.peek()) &&map.get(s.peek())==str.charAt(i))
            {
                
                s.pop();
            }
            else
            {
                s.push(str.charAt(i));
            }
                
            
        }
        if(s.isEmpty())
        {
            return true;
        }
        
        return false;
    }
}