public class Main {
    public static void main(String[] args) {
        //難易度入力
        set_Difficulty.BordDifficulty D = set_Difficulty.input(out.start());
        coordinate XY = new coordinate();
        Square[][] card = new Square[D.Row][D.Column];
        //ボード生成
        do{
            generate.generate_Card(card, D.NumOfMine);
        }while(card[XY.Row][XY.Column].isMine());
        out.Game_Over(card);
    }
}