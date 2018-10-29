import java.util.Scanner;

public class difficulty_in {
    public static diff_Bord input_difficulty(){
        Scanner sc = new Scanner(System.in);
        diff_Bord D = new diff_Bord();
        int NumOfMine = 0;
        int difficulty = sc.nextInt();
        if(difficulty == 1){
            D.line = 9;
            D.row = 9;
            NumOfMine = 10;
        }
        else if(difficulty == 2){
            D.line = 16;
            D.row = 16;
            NumOfMine = 40;
        }
        else if(difficulty == 3){
            D.line = 30;
            D.row = 16;
            NumOfMine = 99;
        }
        else if(difficulty == 4){
            System.out.println("縦のマス数は？");
            D.line = sc.nextInt();
            System.out.println("横のマス数は？");
            D.row = sc.nextInt();
            System.out.println("地雷の数は？");
            NumOfMine = sc.nextInt();
        }
        return D;
    }
    static class diff_Bord{
        int line;
        int row;
        int NumOfMine;
        public diff_Bord diff(int x,int y,int z){
            diff_Bord D = new diff_Bord();
            D.line = x;
            D.row = y;
            D.NumOfMine = z;
            return D;
        }
    }
}

