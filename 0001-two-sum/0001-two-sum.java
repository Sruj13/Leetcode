class Solution {
    public int[] twoSum(int[] arr, int target) {
        int[]res= new int[2];
        Map<Integer,Integer> map = new HashMap<>();
            for(int i=0;i<arr.length;i++)
        {
                int diff = target - arr[i];
                if(map.containsKey(diff))
                {
                    res[0]=i;
                    res[1]=map.get(diff);
                    return res;
                }
            map.put(arr[i],i);
        }
        
        return res;
    }
    
}