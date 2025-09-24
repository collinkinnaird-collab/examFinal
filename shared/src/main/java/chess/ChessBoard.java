package chess;

import java.util.Arrays;
import java.util.Objects;

/**
 * A chessboard that can hold and rearrange chess pieces.
 * <p>
 * Note: You can add to this class, but you may not alter
 * signature of the existing methods.
 */
public class ChessBoard {

    ChessPiece [][]squares = new ChessPiece[8][8];
    public ChessBoard() {
        
    }

    /**
     * Adds a chess piece to the chessboard
     *
     * @param position where to add the piece to
     * @param piece    the piece to add
     */
    public void addPiece(ChessPosition position, ChessPiece piece) {

        squares [position.getRow() - 1][position.getColumn() - 1] = piece;
    }

    /**
     * Gets a chess piece on the chessboard
     *
     * @param position The position to get the piece from
     * @return Either the piece at the position, or null if no piece is at that
     * position
     */
    public ChessPiece getPiece(ChessPosition position) {

        return squares [position.getRow() - 1][position.getColumn() - 1];
    }

    /**
     * Sets the board to the default starting board
     * (How the game of chess normally starts)
     */
    public void resetBoard() {

        ChessPiece rook = new ChessPiece(ChessGame.TeamColor.WHITE, ChessPiece.PieceType.ROOK);
        ChessPiece knight = new ChessPiece(ChessGame.TeamColor.WHITE, ChessPiece.PieceType.KNIGHT);
        ChessPiece bishop = new ChessPiece(ChessGame.TeamColor.WHITE, ChessPiece.PieceType.BISHOP);
        ChessPiece queen = new ChessPiece(ChessGame.TeamColor.WHITE, ChessPiece.PieceType.QUEEN);
        ChessPiece king = new ChessPiece(ChessGame.TeamColor.WHITE, ChessPiece.PieceType.KING);
        ChessPiece bishop2 = new ChessPiece(ChessGame.TeamColor.WHITE, ChessPiece.PieceType.BISHOP);
        ChessPiece knight2 = new ChessPiece(ChessGame.TeamColor.WHITE, ChessPiece.PieceType.KNIGHT);
        ChessPiece rook2 = new ChessPiece(ChessGame.TeamColor.WHITE, ChessPiece.PieceType.ROOK);

        ChessPiece pawn = new ChessPiece(ChessGame.TeamColor.WHITE, ChessPiece.PieceType.PAWN);
        ChessPiece pawn2 = new ChessPiece(ChessGame.TeamColor.WHITE, ChessPiece.PieceType.PAWN);
        ChessPiece pawn3 = new ChessPiece(ChessGame.TeamColor.WHITE, ChessPiece.PieceType.PAWN);
        ChessPiece pawn4 = new ChessPiece(ChessGame.TeamColor.WHITE, ChessPiece.PieceType.PAWN);
        ChessPiece pawn5 = new ChessPiece(ChessGame.TeamColor.WHITE, ChessPiece.PieceType.PAWN);
        ChessPiece pawn6 = new ChessPiece(ChessGame.TeamColor.WHITE, ChessPiece.PieceType.PAWN);
        ChessPiece pawn7 = new ChessPiece(ChessGame.TeamColor.WHITE, ChessPiece.PieceType.PAWN);
        ChessPiece pawn8 = new ChessPiece(ChessGame.TeamColor.WHITE, ChessPiece.PieceType.PAWN);

        ChessPiece brook = new ChessPiece(ChessGame.TeamColor.BLACK, ChessPiece.PieceType.ROOK);
        ChessPiece bknight = new ChessPiece(ChessGame.TeamColor.BLACK, ChessPiece.PieceType.KNIGHT);
        ChessPiece bbishop = new ChessPiece(ChessGame.TeamColor.BLACK, ChessPiece.PieceType.BISHOP);
        ChessPiece bqueen = new ChessPiece(ChessGame.TeamColor.BLACK, ChessPiece.PieceType.QUEEN);
        ChessPiece bking = new ChessPiece(ChessGame.TeamColor.BLACK, ChessPiece.PieceType.KING);
        ChessPiece bbishop2 = new ChessPiece(ChessGame.TeamColor.BLACK, ChessPiece.PieceType.BISHOP);
        ChessPiece bknight2 = new ChessPiece(ChessGame.TeamColor.BLACK, ChessPiece.PieceType.KNIGHT);
        ChessPiece brook2 = new ChessPiece(ChessGame.TeamColor.BLACK, ChessPiece.PieceType.ROOK);

        ChessPiece bpawn = new ChessPiece(ChessGame.TeamColor.BLACK, ChessPiece.PieceType.PAWN);
        ChessPiece bpawn2 = new ChessPiece(ChessGame.TeamColor.BLACK, ChessPiece.PieceType.PAWN);
        ChessPiece bpawn3 = new ChessPiece(ChessGame.TeamColor.BLACK, ChessPiece.PieceType.PAWN);
        ChessPiece bpawn4 = new ChessPiece(ChessGame.TeamColor.BLACK, ChessPiece.PieceType.PAWN);
        ChessPiece bpawn5 = new ChessPiece(ChessGame.TeamColor.BLACK, ChessPiece.PieceType.PAWN);
        ChessPiece bpawn6 = new ChessPiece(ChessGame.TeamColor.BLACK, ChessPiece.PieceType.PAWN);
        ChessPiece bpawn7 = new ChessPiece(ChessGame.TeamColor.BLACK, ChessPiece.PieceType.PAWN);
        ChessPiece bpawn8 = new ChessPiece(ChessGame.TeamColor.BLACK, ChessPiece.PieceType.PAWN);




        ChessPosition rookpos = new ChessPosition(1,1);
            addPiece(rookpos,rook);
        ChessPosition knightpos = new ChessPosition(1,2);
        addPiece(knightpos,knight);
        ChessPosition bishoppos = new ChessPosition(1,3);
            addPiece(bishoppos,bishop);
        ChessPosition queenpos = new ChessPosition(1,4);
            addPiece(queenpos, queen);
        ChessPosition kingpos = new ChessPosition(1,5);
            addPiece(kingpos, king);
        ChessPosition Lbishoppos = new ChessPosition(1,6);
            addPiece(Lbishoppos,bishop2);
        ChessPosition Lknightpos = new ChessPosition(1,7);
            addPiece(Lknightpos,knight2);
        ChessPosition Lrookpos = new ChessPosition(1,8);
            addPiece(Lrookpos,rook2);

        ChessPosition pawnpos1 = new ChessPosition(2,1);
            addPiece(pawnpos1, pawn);
        ChessPosition pawnpos2 = new ChessPosition(2,2);
            addPiece(pawnpos2, pawn2);
        ChessPosition pawnpos3 = new ChessPosition(2,3);
            addPiece(pawnpos3, pawn3);
        ChessPosition pawnpos4 = new ChessPosition(2,4);
            addPiece(pawnpos4, pawn4);
        ChessPosition pawnpos5 = new ChessPosition(2,5);
            addPiece(pawnpos5, pawn5);
        ChessPosition pawnpos6 = new ChessPosition(2,6);
            addPiece(pawnpos6, pawn6);
        ChessPosition pawnpos7 = new ChessPosition(2,7);
            addPiece(pawnpos7, pawn7);
        ChessPosition pawnpos8 = new ChessPosition(2,8);
            addPiece(pawnpos8, pawn8);

        ChessPosition brookpos = new ChessPosition(8,1);
            addPiece(brookpos, brook);
        ChessPosition bknightpos = new ChessPosition(8,2);
            addPiece(bknightpos, bknight);
        ChessPosition bbishoppos = new ChessPosition(8,3);
            addPiece(bbishoppos, bbishop);
        ChessPosition bqueenpos = new ChessPosition(8,4);
            addPiece(bqueenpos, bqueen);
        ChessPosition bkingpos = new ChessPosition(8,5);
            addPiece(bkingpos, bking);
        ChessPosition bLbishoppos = new ChessPosition(8,6);
            addPiece(bLbishoppos, bbishop2);
        ChessPosition bLknightpos = new ChessPosition(8,7);
            addPiece(bLknightpos, bknight2);
        ChessPosition bLrookpos = new ChessPosition(8,8);
            addPiece(bLrookpos, brook2);

        ChessPosition bpawnpos1 = new ChessPosition(7,1);
            addPiece(bpawnpos1, bpawn);
        ChessPosition bpawnpos2 = new ChessPosition(7,2);
            addPiece(bpawnpos2, bpawn2);
        ChessPosition bpawnpos3 = new ChessPosition(7,3);
            addPiece(bpawnpos3, bpawn3);
        ChessPosition bpawnpos4 = new ChessPosition(7,4);
            addPiece(bpawnpos4, bpawn4);
        ChessPosition bpawnpos5 = new ChessPosition(7,5);
            addPiece(bpawnpos5, bpawn5);
        ChessPosition bpawnpos6 = new ChessPosition(7,6);
            addPiece(bpawnpos6, bpawn6);
        ChessPosition bpawnpos7 = new ChessPosition(7,7);
            addPiece(bpawnpos7, bpawn7);
        ChessPosition bpawnpos8 = new ChessPosition(7,8);
            addPiece(bpawnpos8, bpawn8);



    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ChessBoard that = (ChessBoard) o;
        return Objects.deepEquals(squares, that.squares);
    }

    @Override
    public int hashCode() {
        return Arrays.deepHashCode(squares);
    }
}
