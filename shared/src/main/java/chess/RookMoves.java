package chess;

import java.util.ArrayList;
import java.util.Collection;

public class RookMoves implements PieceMovesCalculatore{

    public Collection<ChessMove> pieceMoves(ChessBoard board, ChessPosition myPosition){
        Collection<ChessMove> rookMove = new ArrayList<>();

        int [][] rookPossibleMoves = {{0,1}, {0,-1}, {1,0}, {-1,0}};

        rookMove = loop(board, myPosition, rookPossibleMoves);

        return rookMove;
    }
}