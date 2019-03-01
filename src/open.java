public class open {
    public static void Square(Square[][] card, int Row, int Column){
        if(card[Row][Column].isOpened()){
            System.out.println("すでに空いています");
            return;
        }
        else if(card[Row][Column].isMine()){
            System.out.println("地雷");
            System.out.println("GAME OVER");
            out.Game_Over(card);
            return;
        }
        open(card, Row, Column);
        init_check(card);
    }
    private static void open(Square[][] card, int Row, int Column){
        if(isNull(card,Row,Column)){
            return;
        }
        if(card[Row][Column].Checked){
            return;
        }
        if(card[Row][Column].isMine()){
            return;
        }
        else if(!card[Row][Column].isZero()){
            open_and_check(card, Row, Column);
        }
        else if(card[Row][Column].isZero()){
            open_and_check(card, Row, Column);
            open(card, Row - 1, Column -1);
            open(card, Row - 1, Column);
            open(card, Row - 1, Column + 1);
            open(card, Row, Column -1);
            open(card, Row, Column + 1);
            open(card, Row + 1, Column - 1);
            open(card, Row + 1, Column);
            open(card, Row + 1, Column + 1);
        }
    }
    //実際のマスの開封
    private static void open_and_check(Square[][] card, int Row, int Column){
        card[Row][Column].Open();
        card[Row][Column].setChecked();
    }
    //チェックフラグ初期化
    private static void init_check(Square[][] card){
        for(int i = 0; i < card.length; i++){
            for(int j = 0; j < card[0].length; j++){
                card[i][j].Checked = false;
            }
        }
    }
    private static boolean isNull(Square[][] card, int Row, int Column){
        if(Row >= card.length  || Row < 0){
            return true;
        }
        else if(Column >= card[0].length || Column < 0){
            return true;
        }
        return false;
    }
}
