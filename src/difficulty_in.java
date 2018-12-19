import java.util.Scanner;

public class difficulty_in {
    public static BordDifficulty input_difficulty(int n){
        Scanner sc = new Scanner(System.in);
        BordDifficulty D = new BordDifficulty();
        int difficulty = n;
        if(difficulty == 1){
            D.Row = 9;
            D.Column = 9;
            D.NumOfMine = 10;
        }
        else if(difficulty == 2){
            D.Row = 16;
            D.Column = 16;
            D.NumOfMine = 40;
        }
        else if(difficulty == 3){
            D.Row = 30;
            D.Column = 16;
            D.NumOfMine = 99;
        }
        else if(difficulty == 4){
            System.out.println("縦のマス数は？");
            D.Row = sc.nextInt();
            System.out.println("横のマス数は？");
            D.Column = sc.nextInt();
            System.out.println("地雷の数は？");
            D.NumOfMine = sc.nextInt();
        }
        return D;
    }
    static class BordDifficulty {
        int Row;
        int Column;
        int NumOfMine;
        private BordDifficulty(){
            Row = 0;
            Column = 0;
            NumOfMine = 0;
        }
    }
}

