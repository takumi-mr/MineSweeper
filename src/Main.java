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
        do{
            out.printout(card);
            if(check.scan_Opend(card) == D.NumOfMine){
                out.Game_Over(card);
                System.out.println("GAME CLEAR");
            }
        }while(!check.isGameClear());
        out.Game_Over(card);
    }
}