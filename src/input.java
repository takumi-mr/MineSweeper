import java.util.Scanner;
public class input {
    static class coordinate{
        int Row;
        int Column;
        private coordinate (){
            Row = 0;
            Column = 0;
        }
    }
    public static coordinate coordinate(){
        Scanner sc = new Scanner(System.in);
        System.out.println("座標を入力してください( 例;(x,y) → \"x y\" )");
        String str = sc.nextLine();
        String[] S = str.split(" ");
        coordinate C = new coordinate();
        C.Row = Integer.parseInt(S[0]);
        C.Column = Integer.parseInt(S[1]);
        return C;
    }

}
