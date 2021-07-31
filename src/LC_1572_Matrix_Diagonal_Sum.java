public class LC_1572_Matrix_Diagonal_Sum {
    class Solution {
        public int diagonalSum(int[][] mat) {
            int total =0;
            for(int i=0;i<mat.length;i++){
                total += mat[i][i];
            }
            for(int row = mat.length-1,col=0;row>=0;row--,col++){
                if(row == col) continue;
                total += mat[row][col];
            }
            return total;
        }
    }
}
