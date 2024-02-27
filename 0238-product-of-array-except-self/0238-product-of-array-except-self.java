class Solution {
    public int[] productExceptSelf(int[] nums) {

        /*int[]left=new int[nums.length];
        int[]right = new int[nums.length];

        
        left[0]=1;
        int rp=nums[0];
        for(int i =1;i<left.length;i++){
            left[i]=rp;
            rp=rp*nums[i];
        }

        right[right.length-1]=1;
        rp =nums[right.length-1];

        for(int i =right.length-2;i>=0;i--){
            right[i]=rp;
            rp=rp*nums[i];
        }

        int[]res=new int[nums.length];
        for(int i =0;i<nums.length;i++){
            res[i]=left[i]*right[i];
        }
        /*for(int i =0;i<left.length;i++){
            System.out.print(left[i]+" ");
        }
        System.out.println();
        for(int i =0;i<left.length;i++){
            System.out.print(right[i]+" ");
        }*/

        int[]res=new int[nums.length];
        res[0]=1;
        int rp=nums[0];
        for(int i =1;i<nums.length;i++){
            res[i]=rp;
            rp=rp*nums[i];
        }
        /*for(int i =0;i<res.length;i++){
            System.out.print(res[i]);
        }*/
        rp=nums[nums.length-1];
        for(int i = nums.length-2;i>=0;i--){
            res[i]=rp*res[i];
            rp=rp*nums[i];
        }
        return res;
        
    }
}