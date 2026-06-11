package WEEK2.DAY4;

import java.util.Stack;

public class DecodeString {
    public static String decodeString(String s) {
        Stack<Integer> countStack = new Stack<>();
        Stack<StringBuilder> stringStack = new Stack<>();
        StringBuilder curr = new StringBuilder();
        int k =0;
        for(char c:s.toCharArray()){
            if(Character.isDigit(c)){
                k = k*10+(c-'0');
            }
            else if(c=='['){
                countStack.push(k);
                stringStack.push(curr);
                k =0;
                curr = new StringBuilder();
            }
            else if(c==']'){
                int repeat = countStack.pop();
                StringBuilder prev = stringStack.pop();
                for(int i =0;i<repeat;i++){
                    prev.append(curr);
                }
                curr = prev;
            }
            else{
                curr.append(c);
            }
        }
        return curr.toString();
    }
    public static void main(String[] args) {
        String s = "3[a]2[bc]";
        System.out.println(decodeString(s));
    }
    
}
