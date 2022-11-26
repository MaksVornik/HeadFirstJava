package PracticeForStarter.Day17;

public class ChessBoard {
    private ChessPiece[][] pieces;
    ChessBoard (ChessPiece[][] pieces) {
        this.pieces  = pieces;
    }

    public ChessPiece[][] getPieces() {
        return pieces;
    }
    public void print(ChessPiece[][] pieces) {
        for (int i = 0; i < pieces.length; i++) {
            for (int j = 0; j < pieces[i].length; j++) {
                System.out.print(pieces[i][j].getRepresentation());
            }
            System.out.println();
        }
    }
}
