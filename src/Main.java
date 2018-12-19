import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //難易度入力
        difficulty_in.diff_Bord D = difficulty_in.input_difficulty(out.start());

        //ボード生成
        int[][][] card = new int[D.line][D.row][2];
        generate.gen_Card(card, D.NumOfMine);

        out.test(card);

    }
}
