public class check {
    public static int scan_Opend(Square[][] card){
        int NumOfOpend = 0;
        for(int i = 0; i < card.length; i++){
            for(int j = 0; j < card[0].length; j++){
                if(card[i][j].isOpend()){
                    NumOfOpend++;
                }
            }
        }
        return NumOfOpend;
    }
    public static boolean isGameClear(){

        return false;
    }
}
