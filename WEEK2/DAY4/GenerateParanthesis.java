package WEEK2.DAY4;

import java.util.ArrayList;
import java.util.List;

public class GenerateParanthesis {

    public static void helper(List<String> ans,String current,int open ,int close,int n){
        if(current.length() == 2*n){
            ans.add(current);
            return ;
        }
        if(open <n){
            helper(ans,current+"(",open+1,close,n);
        }
        if(close<open){
            helper(ans,current+")",open,close+1,n);
        }
    }
    public  static List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        helper(ans,"",0,0,n);
        return ans;
        
    }
    public static void main(String[] args) {
        int n =3;
        System.out.println(generateParenthesis(n));
    }
    
}
