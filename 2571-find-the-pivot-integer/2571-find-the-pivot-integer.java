class Solution {
    public int pivotInteger(int n) {
       StringBuilder sb=new StringBuilder();
       int suffix=0;
       int prefix=0;
       int total=0;
       int org=n;
       while(n!=0){
        sb.append(n).append(" ");
        n--;
       }
     String[] arr = sb.toString().trim().split(" ");
       for(int i=0;i<org;i++){
       total += Integer.parseInt(arr[i]);
       }
       for(int i=0;i<org;i++){
         int num = Integer.parseInt(arr[i]);
            suffix = total - prefix; 
            if (prefix + num == suffix) return num;
            prefix += num;

       }
       return -1;
    }
}