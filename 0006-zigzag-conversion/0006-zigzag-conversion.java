class Solution {
    public String convert(String s, int numRows) {
        String ans="";
        if(numRows==1 ||s.length()<=numRows){
          return s;
        }
        StringBuilder[] sb=new StringBuilder[numRows];
        for(int i=0;i<numRows;i++){
            sb[i]=new StringBuilder();
        }
        int curr=0;
        int step=1;
        for(char c:s.toCharArray()){
            sb[curr].append(c); 
             if (curr==0) step = 1;
            else if (curr == numRows - 1) step = -1;

            curr += step;
        }
        StringBuilder ans1 =new StringBuilder();
        for(StringBuilder k:sb)ans1.append(k);
        return ans1.toString();

   }
}