class Solution {
    public int findTheWinner(int n, int k) {
      return game(n,k)+1;
    }
    int game(int n,int k){
        if(n==1)return 0;
        return (game(n-1,k)+k)%n;
    }
    
    
}