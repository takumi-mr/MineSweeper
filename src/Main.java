public class Main {
    public static void main(String[] args) {
        //難易度入力
        set_Difficulty.BordDifficulty D = set_Difficulty.input(out.start());
        //ボード生成
        Square[][] card = new Square[D.Row][D.Column];
        generate.gen_Card(card, D.NumOfMine);
        out.Game_Over(card);
    }
}