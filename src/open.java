public class open {
    public static void open_Tile(int[][][] matrix, input.coordinate C) {
        if (isOpend(matrix, C.Row, C.Column)) {
            System.out.println("すでに開いています");
        }
        else{
            OpenAroundTile(matrix, C.Row, C.Column);
        }
    }

    private static boolean isOpend(int[][][] matrix, int line, int row) {
        if (matrix[line][row][1] == 1) {
            return true;
        } else {
            return false;
        }
    }


    private static void OpenAroundTile(int[][][] matrix, int line, int row) {
        matrix[line][row][0] = 1;
    }

}
