import java.util.Random;

import static javafx.scene.input.KeyCode.R;

public class generate_Card {
    public static void generate(int[][][] matrix,int n){
        generate_Bomb(matrix, n);
        generate_Flag(matrix);
    }
    private static void generate_Bomb(int[][][] matrix,int n){
        Random rnd = new Random();
        int All = (matrix.length)*(matrix[0].length);
        int[] flag = new int [All];
        int number;
        for(int i=0;i<n;i++){
            do{
                number = rnd.nextInt(All)+1;
            }while(flag[number-1]==1);
            flag[number-1]=1;
            search_coordinate(matrix,number,matrix[0].length);
        }

    }
    private static void generate_Flag(int[][][] matrix){
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(matrix[i][j][1] != -1){

                }
            }
        }
    }

    private static int search_Around_Bomb(int[][][] matrix, int x, int y) {
        return 0;
    }

    private static void search_coordinate(int[][][] martix, int number, int n){
        int nline = number / n + 1;
        int nrow = number - (n*(nline-1));
        if(nrow == 0 ) {
            nline--;
            nrow = martix[0].length;
        }
        martix[nline-1][nrow-1][1]=-1;
    }
}
