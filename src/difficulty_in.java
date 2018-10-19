import java.util.Scanner;

public class difficulty_in {
    public static Main.diff_Bord input_difficulty(){
        Scanner sc = new Scanner(System.in);
        Main.diff_Bord D = new Main.diff_Bord();
        int NumOfMine;
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
}
