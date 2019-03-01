public class Checker {
    private int NumOfMine;
    //private int NumOfCorrect = 0;
    Checker(int NumOfMine){
        this.NumOfMine = NumOfMine;
    }
    public boolean isClear(Square[][] card){
        int size = card.length * card[0].length;
        if(scan_NumOfCorrect(card) == this.NumOfMine || scan_NumOfOpend(card) == size - this.NumOfMine){
            return true;
        }
        return false;
    }
    /*public void addNumOfCorrect(){
        NumOfCorrect++;
    }*/
    private int scan_NumOfCorrect(Square[][] card){
        int NumOfCorrect = 0;
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
        int NumOfOpend = 0;
        for(int i = 0; i < card.length; i++){
            for(int j = 0; j < card[0].length; j++){
                if(card[i][j].isOpened()){
                    NumOfOpend++;
                }
            }
        }
        return NumOfOpend;
    }
}
