package chess;

import java.util.ArrayList;
import java.util.Collection;

public class PawnMoves implements PieceMovesCalculatore{

    public Collection<ChessMove> pieceMoves(ChessBoard board, ChessPosition myPosition){
        Collection<ChessMove> pawnMove = new ArrayList<>();

        int [][] pawnPossibleMoves = {{1,1}, {-1,-1}, {-1,1}, {1,-1}, {2,0}, {-2,0}, {1,0}, {-1,0}};

        pawnMove = pawnMove(board, myPosition, pawnPossibleMoves);

        return pawnMove;
    }
}