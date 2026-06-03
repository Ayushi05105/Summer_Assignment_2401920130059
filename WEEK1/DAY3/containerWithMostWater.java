package WEEK1.DAY3;

public class containerWithMostWater {

    public static int maxArea(int[] height) {
        int left =0;
        int right = height.length-1;
        int max =0;
        while(left < right){
            int h = Math.min(height[left],height[right]);
            int width = right - left;
            int area = h * width;
            max = Math.max(area,max);
            if(height[right]>height[left]){
                left++;
            }
            else{
                right--;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] height ={1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height));
    }
    
}
