public class Main {
    public static void main(String[] args) {
        //難易度入力
        difficulty_in.BordDifficulty D = difficulty_in.input_difficulty(out.start());
        //ボード生成
        int[][][] card = new int[D.Row][D.Column][2];
        generate.gen_Card(card, D.NumOfMine);

        out.test(card);

    }
}
