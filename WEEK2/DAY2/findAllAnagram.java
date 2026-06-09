package WEEK2.DAY2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class findAllAnagram {
    public static List<Integer> findAnagrams(String s, String p) {
        int[] freq1 = new int[26];
        int[] freq2 = new int[26];
        List<Integer> res = new ArrayList<>();
        if(p.length() > s.length()) return res;

        for(char c: p.toCharArray()){
            freq1[c-'a']++;
        }
        int size = p.length();

        for(int i =0;i<s.length();i++){
            freq2[s.charAt(i)-'a']++;
            if(i>=size){
                freq2[s.charAt(i-size)-'a']--;
            }
            if(i >=size-1 && Arrays.equals(freq1,freq2)){
                res.add(i-size+1);
            }
    
        }
        return res;
    }
    public static void main(String[] args) {
        String s = "cbaebabacd";
        String p = "abc";
        System.out.println(findAnagrams(s, p));
    }
    
}
