package WEEK1.DAY4;
public class reshapeMatrix {

    public static int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length;
        int n = mat[0].length;
        if(m *n != r*c){
            return mat;
        }
        int[][] ans = new int[r][c];
        int row = 0;
        int col =0;
        for(int i=0;i<m;i++){
            for(int j =0;j<n;j++){
                ans[row][col] = mat[i][j];
                col++;
                if(col ==c){
                col=0;
                row++;
                }
                
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[][] mat ={{1,2},{3,4}};
        System.out.println(matrixReshape(mat, 1, 4));
    }
    
}
