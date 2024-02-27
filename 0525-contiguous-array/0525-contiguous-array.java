class Solution {
    public int findMaxLength(int[] nums) {
         HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);
        int max=0;
        int rsum = 0;
        for(int i =0;i<nums.length;i++){
            if(nums[i]==0){
            rsum-=1;
            }
            else{
                rsum+=1;
            }
             if(!map.containsKey(rsum)){
                map.put(rsum,i);
            }
            else{
                int sum = i-map.get(rsum);
                if(sum>max){
                max=sum;
                }
            }
        }
        
        return max;
        
    }
}