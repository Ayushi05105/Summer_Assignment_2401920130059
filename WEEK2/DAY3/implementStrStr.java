package WEEK2.DAY3;
public class implementStrStr {

    public static int strstr(String s1,String s2){
        int n = s1.length();
        int m = s2.length();

        for(int i =0;i<=n-m;i++){
            int j =0;
            while(j<m && s1.charAt(i+j)==s2.charAt(j)){
                j++;
            }
            if(j==m){
                return i;
            }
        }
        return -1;

    }
    public static void main(String[] args) {
        String s1 ="sadbutsad";
        String s2 = "sad";
        System.out.println(strstr(s1, s2));
    }
    
}
