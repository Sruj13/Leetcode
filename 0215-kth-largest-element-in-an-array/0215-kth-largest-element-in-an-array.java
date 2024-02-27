class Solution {
    public int findKthLargest(int[] nums, int k) {
        
       /* if(nums.length==0 || nums==null){
            return -1;
        }         //min heap
//         PriorityQueue<Integer> pq = new PriorityQueue<>();
//         for(int num:nums){
//             pq.add(num);
//             if(pq.size()>k){
//                 pq.poll();
//             }
//         }
        
//         return pq.poll();
        k=nums.length-k;
        return getPos(nums,0,nums.length-1,k);
    }
        
        private int getPos(int[]nums,int left, int right, int k){
            int pos = left;
            int pivot=nums[right];
            for(int i=left;i<right;i++){
                if(nums[i]<=pivot){
                    int temp=nums[pos];
                    nums[pos]=nums[i];
                    nums[i]=temp;
                    pos++;
                }
            }
            int temp=nums[right];
            nums[right]=nums[pos];
            nums[pos]=temp;
            //System.out.println(pos);
            if(pos>k){
                return getPos(nums,left,pos-1,k);
            }
            else if(pos<k){
                return getPos(nums,pos+1,right,k);
            }
            else{
                return nums[pos];
            }
            */
        
        if(nums.length==0 || nums==null){
            return -1;
        }
        
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int num:nums){
            pq.add(num);
            if(pq.size()>k){
                pq.poll();
            }
        }
        
        return pq.poll();
        }
        
}