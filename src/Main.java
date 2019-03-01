public class Main {
    public static void main(String[] args) {
        //難易度入力
        set_Difficulty.BordDifficulty D = set_Difficulty.input(out.start());
        //ボード生成
        coordinate XY = new coordinate();
        Square[][] card = new Square[D.Row][D.Column];
        do{
            generate.generate_Card(card, D.NumOfMine);
        }while(card[XY.Row][XY.Column].getNumOfMine() != 0);
        open.Square(card, XY.Row, XY.Column);

        Checker check = new Checker(D.NumOfMine);
        do{
            out.out(card);
            out.debug(card);
            XY.update();
            open.Square(card, XY.Row, XY.Column);
        }while(!check.isClear(card));
        out.Game_Over(card);
    }
}