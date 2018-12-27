public class open {
    public static void openSquare(Square[][] card, int Row, int Column){
        if(card[Row][Column].isOpened()){
            return;
        }
        openAround(card, Row, Column);
        init_check(card);
    }
    private static void openAround(Square[][] card, int Row, int Column){
        if(card[Row][Column].Checked){
            return;
        }
        else if(card[Row][Column].isZero()){
            open_and_check(card, Row, Column);
            openAround(card, Row - 1, Column -1);
            openAround(card, Row - 1, Column);
            openAround(card, Row - 1, Column + 1);
            openAround(card, Row, Column -1);
            openAround(card, Row, Column + 1);
            openAround(card, Row + 1, Column - 1);
            openAround(card, Row + 1, Column);
            openAround(card, Row + 1, Column + 1);
        }
    }
    private static void open_and_check(Square[][] card, int Row, int Column){
        if(!isNull(card, Row, Column)){
            card[Row][Column].Open();
            card[Row][Column].setChecked();
        }
    }
    private static boolean isNull(Square[][] card, int Row, int Column){
        try{
            if(!card[Row][Column].isOpened()){
                return false;
            }
        }
        catch(ArrayIndexOutOfBoundsException e){}
        return true;
    }
    private static void init_check(Square[][] card){
        for(int i = 0; i < card.length; i++){
            for(int j = 0; j < card[0].length; j++){
                card[i][j].Checked = false;
            }
        }
    }
}
