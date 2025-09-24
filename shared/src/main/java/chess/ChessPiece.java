package chess;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;

/**
 * Represents a single chess piece
 * <p>
 * Note: You can add to this class, but you may not alter
 * signature of the existing methods.
 */
public class ChessPiece {

    private final ChessGame.TeamColor pieceColor;
    private final PieceType type;

    public ChessPiece(ChessGame.TeamColor pieceColor, ChessPiece.PieceType type) {
        this.pieceColor = pieceColor;
        this.type = type;
    }

    /**
     * The various different chess piece options
     */
    public enum PieceType {
        KING,
        QUEEN,
        BISHOP,
        KNIGHT,
        ROOK,
        PAWN
    }

    /**
     * @return Which team this chess piece belongs to
     */
    public ChessGame.TeamColor getTeamColor() {

        return pieceColor;
    }

    /**
     * @return which type of chess piece this piece is
     */
    public PieceType getPieceType() {

        return  type;
    }

    /**
     * Calculates all the positions a chess piece can move to
     * Does not take into account moves that are illegal due to leaving the king in
     * danger
     *
     * @return Collection of valid moves
     */
    public Collection<ChessMove> pieceMoves(ChessBoard board, ChessPosition myPosition) {
        Collection<ChessMove> myMoves = new ArrayList<>();
        ChessPiece thePiece = board.getPiece(new ChessPosition(myPosition.getRow(), myPosition.getColumn()));

        PieceMovesCalculatore calc;

        if(thePiece.getPieceType() == PieceType.BISHOP)
        {
            calc = new BishopMoves();
        }
        else if(thePiece.getPieceType() == PieceType.ROOK)
        {
            calc = new RookMoves();
        }
        else if(thePiece.getPieceType() == PieceType.QUEEN)
        {
            calc = new QueenMoves();
        }
        else if(thePiece.getPieceType() == PieceType.KING)
        {
            calc = new KingMoves();
        }
        else if(thePiece.getPieceType() == PieceType.KNIGHT)
        {
            calc = new KnightMoves();
        }
        else if(thePiece.getPieceType() == PieceType.PAWN)
        {
            calc = new PawnMoves();
        }
        else{
            return null;
        }

        return calc.pieceMoves(board, myPosition);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ChessPiece that = (ChessPiece) o;
        return pieceColor == that.pieceColor && type == that.type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(pieceColor, type);
    }
}
