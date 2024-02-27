class Solution {
    public int longestCommonSubsequence(String a, String b) {
        
        int[][]arr = new int[a.length()+1][b.length()+1];
		char[][]find = new char[a.length()+1][b.length()+1]; 
		
		for(int i=0;i<1;i++)
		{
			for(int j=0;j<1;j++)
			{
				arr[i][j]=0;
			}
		}
		for(int i=1;i<arr.length;i++)
		{
			for(int j=1;j<arr[0].length;j++)
			{
				if(a.charAt(i-1)==b.charAt(j-1))
				{
					arr[i][j]=arr[i-1][j-1]+1;
					find[i][j]='d';
					
				}
				else {
					if(arr[i-1][j]>arr[i][j-1]) {
						arr[i][j]=arr[i-1][j];
						find[i][j]='u';
					}
					else {
						arr[i][j]=arr[i][j-1];
						find[i][j]='l';
					}
				}
			}
		}
		int i = arr.length-1;
		int j=arr[0].length-1;
		String res = "";
		
		while(find[i][j]!='\u0000') {
			
			if(find[i][j]=='d')
			{
				res=res+a.charAt(i-1);
				i=i-1;
				j=j-1;
			}
			else if(find[i][j]=='l')
			{
				j=j-1;
			}
			else if(find[i][j]=='u')
			{
				i=i-1;
			}
			
		}
		StringBuilder sb = new StringBuilder();
		sb.append(res);
		System.out.println(arr[a.length()][b.length()]);
		System.out.println(sb.reverse());
        return arr[a.length()][b.length()];
        
    }
}