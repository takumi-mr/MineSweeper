public class Open {
    public static int Square(Square[][] card, int Row, int Column) {
        if (card[Row][Column].isOpened()) {
            System.out.println("すでに空いています");
            return 0;
        } else if (card[Row][Column].getFlag() == 3) {
            System.out.println("地雷にマーク済みのマスです");
            System.out.println("別のマスを選択してください");
            return 0;
        } else if (card[Row][Column].isMine()) {
            open_and_check(card, Row, Column);
            return 1;
        }
        open(card, Row, Column);
        init_check(card);
        return 0;
    }

    private static void open(Square[][] card, int Row, int Column) {
        if (isNull(card, Row, Column)) {
            return;
        } else if (card[Row][Column].Checked) {
            return;
        } else if (card[Row][Column].isMine()) {
            return;
        } else if (card[Row][Column].getFlag() == 1 || card[Row][Column].getFlag() == 2) {
            return;
        } else if (!card[Row][Column].isZero()) {
            open_and_check(card, Row, Column);
        } else if (card[Row][Column].isZero()) {
            open_and_check(card, Row, Column);
            open(card, Row - 1, Column - 1);
            open(card, Row - 1, Column);
            open(card, Row - 1, Column + 1);
            open(card, Row, Column - 1);
            open(card, Row, Column + 1);
            open(card, Row + 1, Column - 1);
            open(card, Row + 1, Column);
            open(card, Row + 1, Column + 1);
        }
    }

    //実際のマスの開封
    private static void open_and_check(Square[][] card, int Row, int Column) {
        card[Row][Column].Open();
        card[Row][Column].setChecked();
        card[Row][Column].flagReset();
    }

    //チェックフラグ初期化
    private static void init_check(Square[][] card) {
        for (Square[] i : card) {
            for (Square j : i) {
                j.Checked = false;
            }
        }
    }

    private static boolean isNull(Square[][] card, int Row, int Column) {
        if (Row >= card.length || Row < 0) {
            return true;
        } else return Column >= card[0].length || Column < 0;
    }
}
