class Solution {
    public int diagonalSum(int[][] mat) {
        int row= mat.length,res=0;
        int col=mat[0].length;
        for(int i=0;i<row;i++){
            if((col-1-i)!=i){
            res=res+mat[i][col-1-i]+mat[i][i];}
            else{
                 res=res+mat[i][i];
            }
            
        return res;
    }
}