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
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        System.out.println(idAnagram(s, t));

    }
    
}
