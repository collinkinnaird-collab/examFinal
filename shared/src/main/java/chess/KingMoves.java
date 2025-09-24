package chess;

import java.util.ArrayList;
import java.util.Collection;

public class KingMoves implements PieceMovesCalculatore{

    public Collection<ChessMove> pieceMoves(ChessBoard board, ChessPosition myPosition){
        Collection<ChessMove> kingMove = new ArrayList<>();

        int [][] kingPossibleMoves = {{1,1}, {-1,1}, {-1,-1}, {1,-1}, {0,1}, {0,-1}, {1,0}, {-1,0}};

        kingMove = oneMove(board, myPosition, kingPossibleMoves);

        return kingMove;
    }
}

