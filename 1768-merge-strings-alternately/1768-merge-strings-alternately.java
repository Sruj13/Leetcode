class Solution {
    public String mergeAlternately(String word1, String word2) {
        
        int max = word1.length()>word2.length() ? word1.length() : word2.length();
        String res="";
        
        for(int i=0;i<max;i++){
            if(i<word1.length() && Character.isAlphabetic(word1.charAt(i))){
                res+=word1.charAt(i);
            }
            if(i<word2.length() && Character.isAlphabetic(word2.charAt(i))){
                res+=word2.charAt(i);
            }
        }
        
        return res;
        
    }
}