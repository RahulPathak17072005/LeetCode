class Solution {
    public boolean doesAliceWin(String s) {
    //    for(char c:s.toCharArray()){
    //     if(c=='a' ||c=='e' || c=='i' || c=='o' || c=='u'){
    //         return true;
    //     }
    //    } 
    //    return false;

    String vowel="aeiou";
    for(int i=0;i<s.length();i++){
        if(vowel.indexOf(s.charAt(i))!=-1){
            return true;
        }
    }
    return false;
    }
}