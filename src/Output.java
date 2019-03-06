import java.util.Scanner;

public class Output {
    public static int start() {
        int difficulty;
        Scanner sc = new Scanner(System.in);
        System.out.println("難易度は？(数字で入力してください)");
        System.out.println("1,初級");
        System.out.println("2,中級");
        System.out.println("3,上級");
        System.out.println("4,カスタム");
        do {
            difficulty = sc.nextInt();
        }
        while (difficulty != 1 && difficulty != 2 && difficulty != 3 && difficulty != 4);
        return difficulty;
    }
    
    //カードの状態を表示
    public static void out(Square[][] card) {
        System.out.print("   　| ");
        for (int i = 0; i < card[0].length; i++) {
            System.out.print(HALFtoFULLNumber(String.valueOf(i + 1)));
        }
        System.out.print("\n");
        System.out.print("___＿__");
        for (int i = 0; i < card[0].length; i++) {
            System.out.print("＿");
        }
        System.out.print("\n");
        for (int i = 0; i < card.length; i++) {
            System.out.printf("%3d", i + 1);
            System.out.print("　| ");
            for (int j = 0; j < card[0].length; j++) {
                if (card[i][j].getFlag() == 2) {
                    System.out.print("？");
                } else if (card[i][j].getFlag() == 3) {
                    System.out.print("⚠");
                } else if (!card[i][j].isOpened()) {
                    System.out.print("□");
                } else if (card[i][j].isOpened()) {
                    System.out.print(HALFtoFULLNumber(String.valueOf(card[i][j].getNumOfMine())));
                }
            }
            System.out.print("\n");
        }
    }

    //生成したカードの中身表示
    public static void Game_Over(Square[][] card) {
        System.out.print("   　| ");
        for (int i = 0; i < card[0].length; i++) {
            System.out.print(HALFtoFULLNumber(String.valueOf(i + 1)));
        }
        System.out.print("\n");
        System.out.print("___＿__");
        for (int i = 0; i < card[0].length; i++) {
            System.out.print("＿");
        }
        System.out.print("\n");
        for (int i = 0; i < card.length; i++) {
            System.out.printf("%3d", i + 1);
            System.out.print("　| ");
            for (int j = 0; j < card[0].length; j++) {
                if (card[i][j].isMine()) {
                    System.out.print("×");
                } else {
                    System.out.print(HALFtoFULLNumber(String.valueOf(card[i][j].getNumOfMine())));
                }
            }
            System.out.print("\n");
        }
    }

    //半角数字を全角数字に変換
    private static String HALFtoFULLNumber(String str) {
        if (str == null) {
            throw new IllegalArgumentException();
        }
        StringBuilder sb = new StringBuilder(str);
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if ('0' <= c && c <= '9') {
                sb.setCharAt(i, (char) (c - '0' + '０'));
            }
        }
        return sb.toString();
    }
}
