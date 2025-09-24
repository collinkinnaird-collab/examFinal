package chess;

import java.util.ArrayList;
import java.util.Collection;

public class QueenMoves implements PieceMovesCalculatore{

    public Collection<ChessMove> pieceMoves(ChessBoard board, ChessPosition myPosition){
        Collection<ChessMove> queenMove = new ArrayList<>();

        int [][] queenPossibleMoves = {{1,1}, {-1,1}, {-1,-1}, {1,-1}, {0,1}, {0,-1}, {1,0}, {-1,0}};

        queenMove = loop(board, myPosition, queenPossibleMoves);

        return queenMove;
    }
}
