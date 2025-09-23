package chess;

import java.util.ArrayList;
import java.util.Collection;

public class BishopMoves implements PieceMovesCalculatore{

    public Collection<ChessMove> pieceMoves(ChessBoard board, ChessPosition myPosition){
        Collection<ChessMove> bishopMove = new ArrayList<>();

        int [][] bishopPossibleMoves = {{1,1}, {-1,1}, {-1,-1}, {1,-1}};

        bishopMove = loop(board, myPosition, bishopPossibleMoves);

        return bishopMove;
    }
}
