class Solution {
    public int removeElement(int[] arr, int val) {
        
       /* int j =0;
        int c=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=val)
            {
                arr[j]=arr[i];
                j++;
            }
        }
        return j;*/
        
        int i = 0;
        int n = arr.length;
        while(i<n){
            if(arr[i]==val){
                arr[i]=arr[n-1];
                n--;
            }
            else{
                i++;
            }
        }
        return n;
        
    }
}