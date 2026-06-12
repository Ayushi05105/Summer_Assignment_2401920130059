package WEEK2.DAY5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class groupAnagram {

     public static List<List<String>> groupanagrams(String[] strs) {
        Map<String, List<String>> mpp = new HashMap<>();
        for (String s:strs) {
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            String ans = new String(arr);
            mpp.putIfAbsent(ans, new ArrayList<>());
            mpp.get(ans).add(s);
        }

        return new ArrayList<>(mpp.values());
    }
    public static void main(String[] args) {
        String[] strs ={"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupanagrams(strs));
    }
}
