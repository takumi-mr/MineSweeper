public class Main {
    public static void main(String[] args) {
        //難易度入力
        set_Difficulty.BordDifficulty D = set_Difficulty.input(out.start());
        //ボード生成
        int[][][] card = new int[D.Row][D.Column][2];
        generate.gen_Card(card, D.NumOfMine);


        out.Game_Over(card);
    }
}
