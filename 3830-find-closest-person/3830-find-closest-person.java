class Solution {
    public int findClosest(int x, int y, int z) {
       int a=Math.abs(z-x);
       int b=Math.abs(z-y);
       int ans=0;
       if(a>b){
        ans=2;
       }else if(b>a) ans=1;
       else{
        ans=0;
       }
       return ans;

    }
}