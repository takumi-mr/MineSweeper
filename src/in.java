import java.util.Scanner;
public class in {
    coordinate XY = new coordinate();
    public static coordinate input_coordinate(){
        Scanner sc = new Scanner(System.in);
        System.out.println("座標を入力してください( 例;(x,y) → \"x y\" )");
        String str = sc.nextLine();
        String[] S = str.split(" ");
        coordinate C = new coordinate();
        C.line = Integer.parseInt(S[0]);
        C.row = Integer.parseInt(S[1]);
        return C;
    }
    static class coordinate{
        int line;
        int row;
        public coordinate (){
            line = 0;
            row = 0;
        }
        public coordinate (int x,int y){
            line = x;
            row = y;
        }
    }
}
