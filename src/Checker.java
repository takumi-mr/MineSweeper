import java.util.Scanner;

public class Checker {
    private int NumOfMine;
    //private int NumOfCorrect = 0;
    Checker(int NumOfMine){
        this.NumOfMine = NumOfMine;
    }
    public boolean isClear(Square[][] card){
        System.out.println(scan_NumOfCorrect(card));
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
    public static int mode(){
        int mode;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("何をしますか？");
            System.out.println("1,マス開放");
            System.out.println("2,？マーク");
            System.out.println("3,地雷マーク");
            mode = sc.nextInt();
        }while(mode != 1 && mode != 2 && mode != 3);
        return mode;
    }
}
