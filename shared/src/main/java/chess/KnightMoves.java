package chess;

import java.util.ArrayList;
import java.util.Collection;

public class KnightMoves implements PieceMovesCalculatore{

    public Collection<ChessMove> pieceMoves(ChessBoard board, ChessPosition myPosition){
        Collection<ChessMove> knightMove = new ArrayList<>();

        int [][] knightPossibleMoves = {{1,2}, {-1,2}, {-1,-2}, {1,-2}, {2,1}, {2,-1}, {-2,1}, {-2,-1}};

        knightMove = oneMove(board, myPosition, knightPossibleMoves);

        return knightMove;
    }
}

