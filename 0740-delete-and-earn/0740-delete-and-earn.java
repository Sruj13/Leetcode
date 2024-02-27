class Solution {
    public int deleteAndEarn(int[] nums) {
        
           if(nums==null || nums.length==0){
            return 0;
        }
        
        int max = Integer.MIN_VALUE;
        for(int num : nums){
            if(num>max){
                max = num;
            }
        }
        
        int[]dp = new int[max+1];
        
        for(int num:nums){
            dp[num]=dp[num]+num;
        }
        
        int skip = 0;
        int take = dp[0];
        
        for(int i =1;i<max+1;i++){
            int temp = skip;
            skip = Math.max(skip,take);
            take = temp+dp[i];
        }
        
        return Math.max(skip,take);
    }
}