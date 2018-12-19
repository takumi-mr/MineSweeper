import java.util.Scanner;

public class out {
    //カードの中身を表示
    public static void show_Card(int[][][] matrix){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if (matrix[i][j][1] != -1){
                    System.out.print("□");
                }
                else{
                    System.out.print("×");
                }
            }
            System.out.printf("\n");
        }
    }
    //更新ごとにカードを表示
    public static void printout(int[][][] matrix){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if (matrix[i][j][0] == 0){
                    System.out.print("□");
                }
                else if(matrix[i][j][0] == 1){
                    if(matrix[i][j][1] == 0){
                        System.out.print("0");
                    }
                    else {
                        System.out.print(matrix[i][j][1]);
                    }
                }
            }
            System.out.printf("\n");
        }
    }
    public static int start(){
        Scanner sc = new Scanner(System.in);
        System.out.println("難易度は？(数字で入力してください)");
        System.out.println("1,初級");
        System.out.println("2,中級");
        System.out.println("3,上級");
        System.out.println("4,カスタム");
        int difficulty = sc.nextInt();
        return difficulty;
    }
    //ゲームオーバーのときのカードを表示
    public static void Game_Over(int[][][] matrix){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j][0] == -1){
                    System.out.print("×");
                }
                else{
                    System.out.print(matrix[i][j][0]);
                }
            }
            System.out.printf("\n");
        }
    }
    public static void check(int[][][] matrix){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if (matrix[i][j][0] == 0){
                    System.out.print("□");
                }
                else if(matrix[i][j][0] == 1){
                    if(matrix[i][j][1] == 0){
                        System.out.print("0");
                    }
                    else {
                        System.out.print(matrix[i][j][1]);
                    }
                }
            }
            System.out.printf("\n");
        }
    }
    public static void test(int[][][] matrix){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j][0] == -1){
                    System.out.print("x ");
                }
                else{
                        System.out.print(matrix[i][j][0]+" ");
                }
            }
            System.out.printf("\n");
        }
    }
}
