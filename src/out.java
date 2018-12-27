import java.util.Scanner;

public class out {
    public static int start(){
        Scanner sc = new Scanner(System.in);
        System.out.println("難易度は？(数字で入力してください)");
        System.out.println("1,初級");
        System.out.println("2,中級");
        System.out.println("3,上級");
        System.out.println("4,カスタム");
        int difficulty = sc.nextInt();
        return difficulty;
    }
    //カードの状態を表示
    public static void printout(Square[][] card){
        for(int i = 0; i < card.length; i++){
            for(int j = 0; j < card[0].length; j++){
                if (!card[i][j].isOpened()){
                    System.out.print("□");
                }
                else if (card[i][j].isOpened()){
                    System.out.print(card[i][j].getNumOfMine());
                }
            }
            System.out.printf("\n");
        }
    }
    //生成したカードの中身表示
    public static void Game_Over(Square[][] card){
        for(int i = 0; i < card.length; i++){
            for(int j = 0;j < card[0].length; j++){
                if(card[i][j].isMine()){
                    System.out.print("×");
                }
                else{
                    System.out.print(HALFtoFULLNumber(String.valueOf(card[i][j].getNumOfMine())));
                }
            }
            System.out.printf("\n");
        }
    }
    //半角数字を全角数字に変換
    private static String HALFtoFULLNumber(String str) {
        if (str == null){
            throw new IllegalArgumentException();
        }
        StringBuffer sb = new StringBuffer(str);
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if ('0' <= c && c <= '9') {
                sb.setCharAt(i, (char) (c - '0' + '０'));
            }
        }
        return sb.toString();
    }
}
