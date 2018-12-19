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
    public static int isBomb(int[][][] matrix, int Row, int Column){
        try{
            if(matrix[Row][Column][0] == -1){
                return 1;
            }
        }
        catch (ArrayIndexOutOfBoundsException e){
        }
        return 0;
    }
    private static boolean isNull(int[][][] matrix, int Row, int Column){
        try{
            if(matrix[Row][Column][0] == 0)
            return false;
        } catch (ArrayIndexOutOfBoundsException e){
        }
        return true;
    }
}
