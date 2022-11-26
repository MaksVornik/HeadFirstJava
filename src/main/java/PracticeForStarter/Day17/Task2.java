package PracticeForStarter.Day17;

public class Task2 {
    public static void main(String[] args) {
        ChessPiece[][] pieces =
                {{ChessPiece.ROOK_BLACK,ChessPiece.EMPTY,ChessPiece.EMPTY,ChessPiece.EMPTY,ChessPiece.EMPTY,ChessPiece.ROOK_BLACK,ChessPiece.KING_BLACK, ChessPiece.EMPTY},
                {ChessPiece.EMPTY,ChessPiece.ROOK_WHITE,ChessPiece.EMPTY,ChessPiece.EMPTY,ChessPiece.PAWN_BLACK,ChessPiece.PAWN_BLACK,ChessPiece.EMPTY,ChessPiece.PAWN_BLACK},
                {ChessPiece.PAWN_BLACK,ChessPiece.EMPTY,ChessPiece.KNIGHT_BLACK,ChessPiece.EMPTY,ChessPiece.EMPTY,ChessPiece.EMPTY,ChessPiece.PAWN_BLACK,ChessPiece.EMPTY},
                {ChessPiece.QUEEN_BLACK,ChessPiece.EMPTY,ChessPiece.EMPTY,ChessPiece.BISHOP_WHITE,ChessPiece.EMPTY,ChessPiece.EMPTY,ChessPiece.EMPTY,ChessPiece.EMPTY},
                {ChessPiece.EMPTY,ChessPiece.EMPTY,ChessPiece.EMPTY,ChessPiece.BISHOP_BLACK,ChessPiece.PAWN_WHITE,ChessPiece.EMPTY,ChessPiece.EMPTY,ChessPiece.EMPTY},
                {ChessPiece.EMPTY,ChessPiece.EMPTY,ChessPiece.EMPTY,ChessPiece.EMPTY,ChessPiece.BISHOP_WHITE,ChessPiece.PAWN_WHITE,ChessPiece.EMPTY,ChessPiece.EMPTY},
                {ChessPiece.PAWN_WHITE,ChessPiece.EMPTY,ChessPiece.EMPTY,ChessPiece.QUEEN_WHITE,ChessPiece.EMPTY,ChessPiece.PAWN_WHITE,ChessPiece.EMPTY,ChessPiece.PAWN_WHITE},
                {ChessPiece.EMPTY,ChessPiece.EMPTY,ChessPiece.EMPTY,ChessPiece.EMPTY,ChessPiece.EMPTY,ChessPiece.ROOK_WHITE,ChessPiece.KING_WHITE,ChessPiece.EMPTY}};

        ChessBoard chessBoard = new ChessBoard(pieces);
        chessBoard.print(pieces);
    }
}
//    KING_WHITE(100, " ♔"), KING_BLACK(100,"♚"), QUEEN_WHITE(9,"♕"), QUEEN_BLACK(9,"♛"),
//        ROOK_WHITE(5,"♖"), ROOK_BLACK(5,"♜"), BISHOP_WHITE(3.5,"♗"), BISHOP_BLACK(3.5, "♝"),
//        KNIGHT_WHITE(3,"♘"), KNIGHT_BLACK(3,"♞"), PAWN_WHITE(1, "♙"), PAWN_BLACK(1,"♟"),
//        EMPTY(-1, "_");



//    Всего существует 6 различных шахматных фигур: король (англ. king), ферзь (англ.
//        queen), ладья (англ. rook), слон (англ. bishop), конь (англ. knight) и пешка (англ. pawn).
//        В нашей программе, у каждой шахматной фигуры есть следующие характеристики: