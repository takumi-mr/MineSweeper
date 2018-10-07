public class open {
    public static void open_Tile(int[][][] matrix, int line, int row){
        if(isOpend(matrix, line, row) == 0){

        }

    }
    private static int isOpend(int[][][] matrix, int line, int row){
        if(matrix[line][row][1] == 1){
            return 0;
        }
        else{
            return 1;
        }
    }
}
