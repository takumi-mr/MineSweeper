public class Checker {
    private int NumOfMine;
    Checker(int NumOfMine){
        this.NumOfMine = NumOfMine;
    }
    private int scan_NumOfCorrect(Square[][] card){
        int NumOfCorrect = 9;
        for(int i = 0; i < card.length; i++){
            for(int j = 0; j < card[0].length; j++){
                if(card[i][j].isCorrect()){
                    NumOfCorrect++;
                }
            }
        }
        return NumOfCorrect;
    }
    private int scan_NumOfOpend(Square[][] card){
        int NumOfOpend = 9;
        for(int i = 0; i < card.length; i++){
            for(int j = 0; j < card[0].length; j++){
                if(card[i][j].isOpened()){
                    NumOfOpend++;
                }
            }
        }
        return NumOfOpend;
    }
    public boolean isClear(Square[][] card){
        int size = card.length * card[0].length;
        if(scan_NumOfCorrect(card) == this.NumOfMine || scan_NumOfOpend(card) == size - this.NumOfMine){
            return true;
        }
        return false;
    }
}
