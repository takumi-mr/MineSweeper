import java.util.Random;

public class generate {
    public static void gen_Card(Square[][] card, int NumOfMine){
        init(card);
        generate_Bomb(card, NumOfMine);
        generate_Num(card);
    }
    private static void init(Square[][] card){
        for(int i=0; i < card.length; i++){
            for(int j=0; j < card[0].length; j++){
                card[i][j] = new Square();
            }
        }
    }
    private static void generate_Bomb(Square[][] card, int NumOfMine){
        Random rnd = new Random();
        int All = (card.length) * (card[0].length);
        int[] flag = new int [All];
        int number;
        for(int i=0; i < NumOfMine; i++){
            do{
                number = rnd.nextInt(All)+1;
            }while(flag[number-1] == 1);
            flag[number-1] = 1;
            setMine(card, number, card[0].length);
        }
    }
    private static void generate_Num(Square[][] card){
        for(int i=0; i < card.length; i++){
            for(int j=0; j < card[0].length; j++){
                if(card[i][j].isMine()){
                    Around_Search(card, i, j);
                }
            }
        }
    }

    private static void Around_Search(Square[][] card, int Row, int Column){
        Around_add(card,Row-1,Column-1);
        Around_add(card,Row-1,Column);
        Around_add(card,Row-1,Column+1);
        Around_add(card,Row,Column-1);
        Around_add(card,Row,Column+1);
        Around_add(card,Row+1,Column-1);
        Around_add(card,Row+1,Column);
        Around_add(card,Row+1,Column+1);
    }

    private static void Around_add(Square[][] card, int Row, int Column){
        try{
            card[Row][Column].addNumOfMine();
        }
        catch(ArrayIndexOutOfBoundsException e){}
    }

    private static void setMine(Square[][] card, int number, int NumOfLine){
        int nline = number / NumOfLine + 1;
        int nrow = number - (NumOfLine * (nline-1));
        if(nrow == 0 ) {
            nline--;
            nrow = card[0].length;
        }
        card[nline-1][nrow-1].setMine();
    }
}
