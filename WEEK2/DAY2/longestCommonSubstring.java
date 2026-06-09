package WEEK2.DAY2;

import java.util.Arrays;

public class longestCommonSubstring {
    public static int lengthOfLongestSubstring(String s) {
        int[] hash = new int[256];
        Arrays.fill(hash,-1);
        int n = s.length();
        int l =0,r=0,Maxlen =0;
        while(r<n){
            if(hash[s.charAt(r)]!=-1){
                if(hash[s.charAt(r)] >=l){
                    l = hash[s.charAt(r)]+1;
                }
            }
        int len = r-l+1;
        Maxlen = Math.max(len,Maxlen);
        hash[s.charAt(r)] = r;
        r++;
        }
        return Maxlen;
    }
    public static void main(String[] args) {
        String s ="abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));
    }
}
