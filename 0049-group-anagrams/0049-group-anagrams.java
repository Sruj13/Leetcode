class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        if(strs==null || strs.length==0){
            return new ArrayList<>();
        }
        
        HashMap<Double,List<String>> map = new HashMap<>();
        int[] primes = {2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,67,71,73,79,83,89,97,101,103};
        
        for(int i =0;i<strs.length;i++){
            
            String str = strs[i];
            double val = 1;
            
            for(int j =0;j<str.length();j++){
                val = val*primes[str.charAt(j)-97];
            }
            
            if(!map.containsKey(val)){
                map.put(val,new ArrayList<>());
            }
            map.get(val).add(str);
        }
        
        return new ArrayList<>(map.values());
        
    }
}