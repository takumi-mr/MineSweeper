import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        diff_Bord D = new diff_Bord();
        //難易度設定
        int NumOfMine = 0;
        int difficulty = out.start();

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

        //ボード生成
        int[][][] card = new int[D.line][D.row][2];
        out.start_show(card);
        in.coordinate C = in.input_coordinate();
        do{
            generate.gen_Card(card, NumOfMine);
        }while(card[C.line][C.row][1] == -1);

        open.open_Tile(card, C.line, C.row);

        //メインループ
        int NumOfOpend = scan.scan_NumOfOpend(card);
        do{
            in.coordinate X = in.input_coordinate();
            open.open_Tile(card, X.line, X.row);
            out.printout(card);
            if(card[X.line][X.row][1] == -1){
                System.out.println("GAME OVER");
                break;
            }
        }while( NumOfOpend == (D.line * D.row) - NumOfMine );
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