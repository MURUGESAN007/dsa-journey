class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length,n1 = matrix[0].length;
        for(int i=0;i<n;i++){
            int l = 0,r = n1-1;
            if(matrix[i][l] <= target && matrix[i][r] >= target){
                while(l <= r){
                    int mid = l+(r-l)/2;
                    if(matrix[i][mid] == target){
                        return true;
                    }else if(matrix[i][mid] < target){
                        l = mid+1;
                    }else{
                        r = mid-1;
                    }
                }
            }
        }
        return false;
    }
}