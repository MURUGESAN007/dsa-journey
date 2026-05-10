class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length,n = matrix[0].length;
        int []rowsArr = new int[m];
        int []colsArr = new int[n];
        
        Arrays.fill(rowsArr,1);
        Arrays.fill(colsArr,1);

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j] == 0){
                    rowsArr[i] = 0;
                    colsArr[j] = 0;
                }
            }
        }

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(rowsArr[i] == 0 || colsArr[j] == 0){
                    matrix[i][j] = 0;
                }
            }
        }
    }
}