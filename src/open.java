public class open {
    public static void open_Tile(int[][][] matrix, int line, int row) {
        if (isOpend(matrix, line, row) == 0) {
            OpenAroundTile(matrix, line, row);
        }

    }

    private static int isOpend(int[][][] matrix, int line, int row) {
        if (matrix[line][row][1] == 1) {
            return 0;
        } else {
            return 1;
        }
    }

    private static void OpenAroundTile(int[][][] matrix, int line, int row) {

    }
    private static int check_null(int[][][] matrix, int line, int row){
        try{
            return 1;
        } catch (ArrayIndexOutOfBoundsException e){
            return 0;
        }
    }
}
