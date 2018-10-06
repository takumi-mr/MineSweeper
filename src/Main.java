import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int difficulty = out.start();
        int NumOfMine = 0;
        diff_Bord D = new diff_Bord();
        Scanner sc = new Scanner(System.in);
        if(difficulty == 1){
            D.line = 9;
            D.row = 9;
            NumOfMine = 10;
        }
        else if(difficulty == 2){
            D.line = 16;
            D.row = 16;
            NumOfMine = 40;
        }
        else if(difficulty == 3){
            D.line = 30;
            D.row = 16;
            NumOfMine = 99;
        }
        else if(difficulty == 4){
            System.out.println("縦のマス数は？");
            D.line = sc.nextInt();
            System.out.println("横のマス数は？");
            D.row = sc.nextInt();
            System.out.println("地雷の数は？");
            NumOfMine = sc.nextInt();
        }
        int[][][] card = new int[D.line][D.row][2];
        out.start_show(card);
        generate.gen_Card(card, NumOfMine);

        out.show_Card(card);

    }
    static class diff_Bord{
        int line;
        int row;
        public diff_Bord diff(int x,int y){
            diff_Bord D = new diff_Bord();
            D.line = x;
            D.row = y;
            return D;
        }
    }
}