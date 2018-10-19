public class open {
    public static void open_Tile(int[][][] matrix, int line, int row) {
        if (isOpend(matrix, line, row) == 0) {
            OpenAroundTile(matrix, line, row);
        }
        else{
            System.out.println("すでに開いています");
        }
    }

    private static int isOpend(int[][][] matrix, int line, int row) {
        if (matrix[line][row][1] == 1) {
            return 1;
        } else {
            return 0;
        }
    }

    private static void OpenAroundTile(int[][][] matrix, int line, int row) {
        matrix[line][row][0] = 1;
    }
    private static int check_null(int[][][] matrix, int line, int row){
        try{
            return 1;
        } catch (ArrayIndexOutOfBoundsException e){
            return 0;
        }
    }
}
