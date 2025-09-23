package chess;

import java.util.ArrayList;
import java.util.Collection;

public interface PieceMovesCalculatore {

    Collection<ChessMove> pieceMoves(ChessBoard board, ChessPosition myPosition);

    default Collection<ChessMove> loop(ChessBoard board, ChessPosition myPosition, int[][] ways){

        Collection<ChessMove> bonus = new ArrayList<>();
        ChessPiece myPiece = board.getPiece(new ChessPosition(myPosition.getRow(), myPosition.getColumn()));

        for(int[] path: ways){

            int changeXaxis = myPosition.getRow() + path[0];
            int changeYaxis = myPosition.getColumn() + path[1];

            while(changeYaxis <= 8 && changeYaxis >= 1 && changeXaxis <= 8 && changeXaxis >= 1){
                ChessPiece otherPiece = board.getPiece(new ChessPosition(changeXaxis, changeYaxis));

                if(otherPiece != null){
                    if(otherPiece.getTeamColor() == myPiece.getTeamColor()){
                        break;
                    }
                    else{
                        bonus.add(new ChessMove(new ChessPosition(myPosition.getRow(), myPosition.getColumn()), new ChessPosition(changeXaxis, changeYaxis), null));
                        break;
                    }
                }else{
                    bonus.add(new ChessMove(new ChessPosition(myPosition.getRow(), myPosition.getColumn()), new ChessPosition(changeXaxis, changeYaxis), null));

                    changeXaxis += path[0];
                    changeYaxis += path[1];
                }
            }

        }

        return bonus;

    }
}
