package WEEK2.DAY1;

import java.util.HashMap;

public class FirstuniqueCharacter {

    public static int firstUniqChar(String s) {
        HashMap<Character,Integer> mpp = new HashMap<>();
        for(char c :s.toCharArray()){
            mpp.put(c,mpp.getOrDefault(c,0)+1);
        }
        for(int i =0;i<s.length();i++){
            if(mpp.get(s.charAt(i))==1){
                return i;
            }
        }
        return -1;
    }

    public static int firstUniqChar2(String s) {
        int[] freq = new int[26];
        for(int i =0;i<s.length();i++){
            freq[s.charAt(i)-'a']++;
        }
        for(int i =0;i<s.length();i++){
            if(freq[s.charAt(i)-'a']==1){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        String s = "leetcode";
        System.out.println(firstUniqChar(s));
        System.out.println(firstUniqChar2(s));
    }
    
}
