public class Main {
    public static void main(String[] args) {
        Board board = new Board();
        do{
            Generator.generate_Card(board.CARD, board.D.NumOfMine);
        }while(board.CARD[board.XY.Row][board.XY.Column].getNumOfMine() != 0);
        Opener.Square(board.CARD, board.XY.Row, board.XY.Column);

        Checker check = new Checker(board.D.NumOfMine);

        int GAME_STATE = 0;

        while(!check.isClear(board.CARD) && GAME_STATE != 1){
            Output.out(board.CARD);
            board.XY.update();
            GAME_STATE = Opener.Square(board.CARD, board.XY.Row, board.XY.Column);
        }
        if(GAME_STATE == 1){
            System.out.println("地雷");
            System.out.println("GAME OVER");
            Output.Game_Over(board.CARD);
        }
        else{
            System.out.println("GAME CLEAR");
            Output.Game_Over(board.CARD);
        }
    }
}