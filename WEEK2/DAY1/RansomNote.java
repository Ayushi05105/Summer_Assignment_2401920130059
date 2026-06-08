package WEEK2.DAY1;

public class RansomNote {
    public static boolean canConstruct(String ransomNote, String magazine) {
        int[] freq = new int[26];
        if(ransomNote.length()>magazine.length()) return false;
        for(int i =0;i<magazine.length();i++){
            freq[magazine.charAt(i)-'a']++;
            
        }
        for(int i =0;i<ransomNote.length();i++){
            freq[ransomNote.charAt(i)-'a']--;

            if(freq[ransomNote.charAt(i)-'a']<0){
            return false;
        }
            
        }
        
        
    return true;
    }
    public static void main(String[] args) {
        String ransomNote ="a";
        String magzine = "b";
        System.out.println(canConstruct(ransomNote, magzine));

    }
    
}
