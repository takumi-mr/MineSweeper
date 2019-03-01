import java.util.Scanner;
class coordinate{
    int Row = 0;
    int Column = 0;
    Scanner sc = new Scanner(System.in);
    String str = "";
    private void setRow(int N){
        this.Row = N;

    }
    private void setColumn(int N){
        this.Column = N;

    }
    coordinate(){
        System.out.println("座標を入力してください( 例;(x,y) → \"x y\" )");
        str = sc.nextLine();
        String[] S = str.split(" ");
        setRow(Integer.parseInt(S[0]) - 1);
        setColumn(Integer.parseInt(S[1]) - 1);
    }
    public void update(){
        System.out.println("座標を入力してください( 例;(x,y) → \"x y\" )");
        str = sc.nextLine();
        String[] S = str.split(" ");
        setRow(Integer.parseInt(S[0]) - 1);
        setColumn(Integer.parseInt(S[1]) - 1);
    }
}
