import java.util.Scanner;

public class Board {
    difficulty D = new difficulty(Output.start());
    coordinate XY = new coordinate();
    Square[][] CARD = new Square[D.Row][D.Column];

    class difficulty {
        int Row = 0;
        int Column = 0;
        int NumOfMine = 0;

        public difficulty(int difficulty) {
            if (difficulty == 1) {
                this.Row = 9;
                this.Column = 9;
                this.NumOfMine = 10;
            } else if (difficulty == 2) {
                this.Row = 16;
                this.Column = 16;
                this.NumOfMine = 40;
            } else if (difficulty == 3) {
                this.Row = 30;
                this.Column = 16;
                this.NumOfMine = 99;
            } else if (difficulty == 4) {
                Scanner sc = new Scanner(System.in);
                System.out.println("縦のマス数は？");
                this.Row = sc.nextInt();
                System.out.println("横のマス数は？");
                this.Column = sc.nextInt();
                System.out.println("地雷の数は？");
                this.NumOfMine = sc.nextInt();
            }
        }
    }
}
