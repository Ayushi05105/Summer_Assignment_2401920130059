package WEEK2.DAY2;

import java.util.Arrays;

public class permutationInString {

    public static boolean checkInclusion(String s1, String s2) {
        int[] freq1 = new int[26];
        int[] freq2 = new int[26];
        int size = s1.length();

        for(char ch: s1.toCharArray()){
            freq1[ch-'a']++;
        }
        for(int i =0;i<s2.length();i++){
            freq2[s2.charAt(i)-'a']++;
            if(i>=size){
                freq2[s2.charAt(i-size)-'a']--;
            }
            if(Arrays.equals(freq1,freq2)){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String s1 = "ab";
        String s2 = "eidbaooo";
        System.out.println(checkInclusion(s1, s2));
    }
    
}
