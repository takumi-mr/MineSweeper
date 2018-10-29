import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //難易度入力
        difficulty_in.diff_Bord D = difficulty_in.input_difficulty();

        //ボード生成
        int[][][] card = new int[D.line][D.row][2];
        out.printout(card);
        System.out.println("どのマスを選びますか？");
        in.coordinate C = in.input_coordinate();
        do {
            generate.gen_Card(card, D.NumOfMine);
        } while (card[C.line][C.row][1] == -1);

        open.open_Tile(card, C.line, C.row);

        //メインループ
        int NumOfOpend = scan.scan_NumOfOpend(card);
        do {
            in.coordinate X = in.input_coordinate();
            open.open_Tile(card, X.line, X.row);
            out.printout(card);
            if (card[X.line][X.row][1] == -1) {
                out.Game_Over(card);
                break;
            }
        } while (NumOfOpend == (D.line * D.row) - D.NumOfMine);
        out.show_Card(card);

    }
}
