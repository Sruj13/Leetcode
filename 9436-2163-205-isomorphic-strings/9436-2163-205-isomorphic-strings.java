class Solution {
    public boolean isIsomorphic(String s, String t) {
        /*if(s.length()!=t.length())
        return false;
        
        HashMap<Character,Character> smap = new HashMap<>();
        HashSet<Character> tset = new HashSet<>();
        
        for(int i =0;i<s.length();i++){
            char schar = s.charAt(i);
            char tchar = t.charAt(i);
            
            if(smap.containsKey(schar)){
                if(smap.get(schar)!=tchar)
                return false;
            }
            else{
                smap.put(schar,tchar);
               /* if(tset.contains(tchar)){
                    return false;
                }
                tset.add(tchar);*/
           // }
        
       // }
        //return true;*/

if(s.length()!=t.length())
        return false;
        
        HashMap<Character,Character> smap = new HashMap<>();
        HashSet<Character> tset = new HashSet<>();
        
        for(int i =0;i<s.length();i++){
            char schar = s.charAt(i);
            char tchar = t.charAt(i);
            
            if(smap.containsKey(schar)){
                if(smap.get(schar)!=tchar)
                return false;
            }
            else{
                smap.put(schar,tchar);
                if(tset.contains(tchar)){
                    return false;
                }
                tset.add(tchar);
            }
        
        }
        return true;
    }
}