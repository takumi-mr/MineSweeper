import java.util.Random;

public class generate {
    public static void gen_Card(int[][][] matrix, int NumOfMine){
        generate_Bomb(matrix, NumOfMine);
        generate_Num(matrix);
    }
    private static void generate_Bomb(int[][][] matrix, int NumOfMine){
        Random rnd = new Random();
        int All = (matrix.length) * (matrix[0].length);
        int[] flag = new int [All];
        int number;
        for(int i=0; i < NumOfMine; i++){
            do{
                number = rnd.nextInt(All)+1;
            }while(flag[number-1] == 1);
            flag[number-1] = 1;
            set_Bomb(matrix, number, matrix[0].length);
        }

    }
    private static void generate_Num(int[][][] matrix){
        for(int i=0; i < matrix.length; i++){
            for(int j=0; j < matrix[0].length; j++){
                if(matrix[i][j][0] != -1){
                    matrix[i][j][0] = Around_Search(matrix, i, j);
                }
            }
        }
    }

    private static int Around_Search(int[][][] matrix, int Row, int Column){
        int n = 0;
        n += check.isBomb(matrix,Row-1,Column-1);
        n += check.isBomb(matrix,Row-1,Column);
        n += check.isBomb(matrix,Row-1,Column+1);
        n += check.isBomb(matrix,Row,Column-1);
        n += check.isBomb(matrix,Row,Column+1);
        n += check.isBomb(matrix,Row+1,Column-1);
        n += check.isBomb(matrix,Row+1,Column);
        n += check.isBomb(matrix,Row+1,Column+1);
        return n;
    }

    private static void set_Bomb(int[][][] martix, int number, int NumOfLine){
        int nline = number / NumOfLine + 1;
        int nrow = number - (NumOfLine * (nline-1));
        if(nrow == 0 ) {
            nline--;
            nrow = martix[0].length;
        }
        martix[nline-1][nrow-1][0] = -1;
    }
}
