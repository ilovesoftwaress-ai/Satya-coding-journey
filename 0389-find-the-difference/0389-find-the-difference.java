class Solution {
    public char findTheDifference(String s, String t) {
        //  int xor=0;
        // for(int i=0;i<s.length();i++){
        //     xor^=(int)s.charAt(i);
        // }

        // for(int i=0;i<t.length();i++){
        //     xor^=(int)t.charAt(i);
        // }


        //   return (char)xor;

          char ans = 0;

        for (char c : s.toCharArray()) ans ^= c;
        for (char c : t.toCharArray()) ans ^= c;

        return ans;
 
    }
}