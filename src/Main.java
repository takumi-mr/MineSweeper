public class Main {
    public static void main(String[] args) {
        //難易度入力
        set_Difficulty.BordDifficulty D = set_Difficulty.input(out.start());
        //ボード生成
        coordinate XY = new coordinate();
        Square[][] card = new Square[D.Row][D.Column];
        do{
            generate.generate_Card(card, D.NumOfMine);
        }while(card[XY.Row][XY.Column].getNumOfMine() == -1);
        open.openSquare(card, XY.Row, XY.Column);

        Checker check = new Checker(D.NumOfMine);
        do{
            XY.update();
            open.openSquare(card, XY.Row, XY.Column);
        }while(check.isClear(card));
        out.printout(card);
    }
}