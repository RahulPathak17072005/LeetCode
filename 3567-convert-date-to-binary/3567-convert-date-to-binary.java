import java.math.BigInteger;
class Solution {
    public String convertDateToBinary(String date) {
        String[] str=date.split("-");
        String A="" ;
        for(int i=0;i<3;i++){
            BigInteger n = new BigInteger(str[i]);
            A=A+n.toString(2);
            if(i!=2) A+="-";
        }
        return A;
    }
}