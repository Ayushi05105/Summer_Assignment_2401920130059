package WEEK2.DAY1;
import java.util.HashMap;

public class validAnagram {

    public static boolean idAnagram(String s, String t){
        HashMap<Character,Integer> mpp1 = new HashMap<>();
        HashMap<Character,Integer> mpp2 = new HashMap<>();

        if(s.length() != t.length()) return false;
        for(char c : s.toCharArray()){
            mpp1.put(c,mpp1.getOrDefault(c, 0)+1);
        }
        for(char c: t.toCharArray()){
            mpp2.put(c,mpp2.getOrDefault(c,0)+1);
        }
        return mpp1.equals(mpp2);
    }

    public static boolean isAnagram2(String s, String t){
        int[] freq = new int[26];
        if(s.length()!=t.length()) return false;

        for(int i =0;i<s.length();i++){
            freq[s.charAt(i)-'a']++;
            freq[t.charAt(i)-'a']--;
        }
        for(int f:freq){
            if(f!=0) return false;
     }
     return true;
    }
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        System.out.println(idAnagram(s, t));
        System.out.println(isAnagram2(s, t));

    }
    
}
