import java.util.Scanner;

public class Checker {
    private int NumOfMine;
    private int NumOfCorrect = 0;
    private int NumOfOpened = 0;

    Checker(int NumOfMine) {
        this.NumOfMine = NumOfMine;
    }

    public boolean isClear(Square[][] card) {
        int size = card.length * card[0].length;
        scan(card);
        return NumOfCorrect == this.NumOfMine || NumOfOpened == size - this.NumOfMine;
    }

    private void scan(Square[][] card) {
        NumOfCorrect = 0;
        NumOfOpened = 0;
        for (int i = 0; i < card.length; i++) {
            for (int j = 0; j < card[0].length; j++) {
                if (card[i][j].isCorrect()) {
                    NumOfCorrect++;
                } else if (card[i][j].isOpened()) {
                    NumOfOpened++;
                }
            }
        }
    }

    public static int mode() {
        int mode;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("何をしますか？");
            System.out.println("1,マス開放");
            System.out.println("2,？マーク");
            System.out.println("3,地雷マーク");
            mode = sc.nextInt();
        } while (mode != 1 && mode != 2 && mode != 3);
        return mode;
    }
}
