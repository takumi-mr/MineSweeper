public class check {
    public static int scan_NumOfOpend(int[][][] matrix){
        int NumOfOpend = 9;
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                if(matrix[i][j][0] == 1){
                    NumOfOpend++;
                }
            }
        }
        return NumOfOpend;
    }
}
