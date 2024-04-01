class Solution {
    public int lengthOfLastWord(String s) {

        String[] arr = s.split(" ");
        
        return arr[arr.length-1].length();

    /*    for(int i =arr.length;i>=0;i--){
            if(!arr[i].isEmpty()){
                return arr[i].length();
            }
        }
        
        return 0;*/
    }
}