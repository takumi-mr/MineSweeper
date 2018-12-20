import java.util.Scanner;
class coordinate{
    int Row = 0;
    int Column = 0;

    public coordinate(){
        Scanner sc = new Scanner(System.in);
        System.out.println("座標を入力してください( 例;(x,y) → \"x y\" )");
        String str = sc.nextLine();
        String[] S = str.split(" ");
        this.Row = Integer.parseInt(S[0]) - 1;
        this.Column = Integer.parseInt(S[1]) - 1;
    }
}
