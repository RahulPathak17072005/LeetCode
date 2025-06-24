class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int[] ans=new int[queries.length];
        int k=0;
        for(int i=0;i<queries.length;i++){
            int s=queries[i][0],e=queries[i][1];
            int curr=0;
            while(s<=e){
                curr ^=arr[s++];
                
            }
            ans[k++]=curr;
         }
         return ans;
    }
}