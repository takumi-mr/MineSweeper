import java.util.Scanner;

public class difficulty_in {
    public static diff_Bord input_difficulty(int n){
        Scanner sc = new Scanner(System.in);
        diff_Bord D = new diff_Bord();
        int difficulty = n;
        if(difficulty == 1){
            D.line = 9;
            D.row = 9;
            D.NumOfMine = 10;
        }
        else if(difficulty == 2){
            D.line = 16;
            D.row = 16;
            D.NumOfMine = 40;
        }
        else if(difficulty == 3){
            D.line = 30;
            D.row = 16;
            D.NumOfMine = 99;
        }
        else if(difficulty == 4){
            System.out.println("縦のマス数は？");
            D.line = sc.nextInt();
            System.out.println("横のマス数は？");
            D.row = sc.nextInt();
            System.out.println("地雷の数は？");
            D.NumOfMine = sc.nextInt();
        }
        return D;
    }
    static class diff_Bord{
        int line;
        int row;
        int NumOfMine;
        private diff_Bord(){
            line = 0;
            row = 0;
            NumOfMine = 0;
        }
        private diff_Bord(int x,int y, int z){
            line = x;
            row = y;
            NumOfMine = z;
        }
    }
}

