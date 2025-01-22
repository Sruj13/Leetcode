class Solution {
    public int majorityElement(int[] nums) {
        
        int curr = 0;
        int count =0;
        for(int i =0;i<nums.length;i++){
            if(count==0){
                curr = nums[i];
            }
            count+=nums[i]==curr?1:-1;
            
        }
        return curr;
        
    }
}