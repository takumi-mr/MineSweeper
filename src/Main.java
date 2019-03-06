public class Main {
    public static void main(String[] args) {
        Board board = new Board();
        do {
            Generator.generate_Card(board.CARD, board.D.NumOfMine);
        } while (board.CARD[board.XY.Row][board.XY.Column].getNumOfMine() != 0);
        Open.Square(board.CARD, board.XY.Row, board.XY.Column);

        Checker check = new Checker(board.D.NumOfMine);

        int GAME_STATE = 0;
        int MODE;

        while (!check.isClear(board.CARD) && GAME_STATE != 1) {
            Output.out(board.CARD);
            MODE = Checker.mode();
            board.XY.update();
            if (MODE == 1) {
                GAME_STATE = Open.Square(board.CARD, board.XY.Row, board.XY.Column);
            } else {
                if (board.CARD[board.XY.Row][board.XY.Column].isOpened()) {
                    System.out.println("すでに空いています");
                } else if (MODE == 2) {
                    board.CARD[board.XY.Row][board.XY.Column].setQ();
                } else if (MODE == 3) {
                    board.CARD[board.XY.Row][board.XY.Column].setMark();
                }
            }
        }
        if (GAME_STATE == 1) {
            System.out.println("地雷");
            System.out.println("GAME OVER");
            Output.Game_Over(board.CARD);
        } else {
            System.out.println("GAME CLEAR");
            Output.Game_Over(board.CARD);
        }
    }
}