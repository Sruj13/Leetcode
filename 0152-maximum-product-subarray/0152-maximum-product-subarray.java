class Solution {
    public int maxProduct(int[] nums) {

        int min=nums[0];
        int max=nums[0];
        int t_max=nums[0];
        for(int i =1;i<nums.length;i++){
            int prevmin=min;
            int prevmax=max;
           if(nums[i]<0){
               min = Math.min(prevmax*nums[i],nums[i]);
               max=Math.max(prevmin*nums[i],nums[i]);
           }
           else{
               min=Math.min(prevmin*nums[i],nums[i]);
               max=Math.max(prevmax*nums[i],nums[i]);
           }
           //System.out.println(max+" "+min);
           t_max=Math.max(max,t_max);
        }

        return t_max;

        
    }
}