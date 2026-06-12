package WEEK2.DAY5;

public class stringcompression {

    public static int compress(char[] chars) {
        int i = 0;
        int index = 0;

        while (i < chars.length) {
            char curr = chars[i];
            int count = 0;

            while (i < chars.length && chars[i] == curr) {
                count++;
                i++;
            }

            chars[index++] = curr;

            if (count > 1) {
                String cnt = String.valueOf(count);

                for (char c : cnt.toCharArray()) {
                    chars[index++] = c;
                }
            }
        }

        return index;
    }

    public static void main(String[] args) {
        char[] chars ={'a','a','b','b','c','c','c'};
        System.out.println(compress(chars));
    }
    
}
