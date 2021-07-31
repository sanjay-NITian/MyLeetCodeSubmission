public class LC_867_Transpose_Matrix {
    class Solution {
        public int[][] transpose(int[][] matrix) {
            int row = matrix.length,col = matrix[0].length;
            int[][] transpose = new int[matrix[0].length][matrix.length];
            int temp = Math.min(row, col);
            int i=0,j=0;
            for(i=0;i<temp;i++){
                for(j=0;j<temp;j++){
                    transpose[i][j] = matrix[j][i];
                }
            }
            if(row<col){
                for(int r=0;r<row;r++){
                    for(int c=temp;c<col;c++){
                        transpose[c][r] = matrix[r][c];
                    }
                }
            }else{
                for(int r=temp;r<row;r++){
                    for(int c=0;c<col;c++){
                        transpose[c][r] = matrix[r][c];
                    }
                }
            }
            return transpose;
        }

    }
}
