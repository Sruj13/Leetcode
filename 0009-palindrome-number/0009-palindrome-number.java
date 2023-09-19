class Solution {
    public boolean isPalindrome(int x) {

        int n = x;
         int sum =0;
        while(x>0){
          int a = x%10;
          sum=sum*10+a;
          x=x/10;
        }
        if(sum==n){
            return true;
        }
        return false;
        
    }
}