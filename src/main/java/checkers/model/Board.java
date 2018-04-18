package checkers.model;

public class Board {

    private String[][] boardArray = new String[8][8];

    public Board() {
        fillBlackWhite();
    }

    public String[][] getBoardArray() {
        return boardArray;
    }

    public void setBoardArray(String[][] boardArray) {
        this.boardArray = boardArray;
    }

    private void fillBlackWhite() {
        for (int i = 0; i < boardArray.length; i++) {
            for (int j = 0; j < boardArray.length - 1; j += 2) {
                if (i < 3) {
                    if (i % 2 == 0) {
                        boardArray[j + 1][i] = "B";
                    } else {
                        boardArray[j][i] = "B";
                    }
                } else if (i > 4) {
                    if (i % 2 == 0) {
                        boardArray[1 + j][i] = "C";
                    } else {
                        boardArray[j][i] = "C";
                    }
                } else {
                    if (i % 2 == 0) {
                        boardArray[1 + j][i] = " ";
                    } else {
                        boardArray[j][i] = " ";
                    }
                }
            }
        }
    }


}
