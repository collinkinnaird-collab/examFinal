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

    default Collection<ChessMove> oneMove(ChessBoard board, ChessPosition myPosition, int[][] ways){

        Collection<ChessMove> bonus = new ArrayList<>();
        ChessPiece myPiece = board.getPiece(new ChessPosition(myPosition.getRow(), myPosition.getColumn()));

        for(int[] path: ways){

            int changeXaxis = myPosition.getRow() + path[0];
            int changeYaxis = myPosition.getColumn() + path[1];

            if(changeYaxis <= 8 && changeYaxis >= 1 && changeXaxis <= 8 && changeXaxis >= 1){
                ChessPiece otherPiece = board.getPiece(new ChessPosition(changeXaxis, changeYaxis));

                if(otherPiece != null){
                    if(otherPiece.getTeamColor() != myPiece.getTeamColor()){
                        bonus.add(new ChessMove(new ChessPosition(myPosition.getRow(), myPosition.getColumn()), new ChessPosition(changeXaxis, changeYaxis), null));
                    }
                }else{
                    bonus.add(new ChessMove(new ChessPosition(myPosition.getRow(), myPosition.getColumn()), new ChessPosition(changeXaxis, changeYaxis), null));

                }
            }

        }

        return bonus;

    }

    default Collection<ChessMove> pawnMove(ChessBoard board, ChessPosition myPosition, int[][] ways){

        Collection<ChessMove> bonus = new ArrayList<>();
        ChessPiece myPiece = board.getPiece(new ChessPosition(myPosition.getRow(), myPosition.getColumn()));
        boolean firstMove = false;

        for(int[] path: ways){

            int changeXaxis = myPosition.getRow() + path[0];
            int changeYaxis = myPosition.getColumn() + path[1];
            if(myPiece.getTeamColor() == ChessGame.TeamColor.WHITE && path[0] < 0)
            {
                continue;
            }
            if(myPiece.getTeamColor() == ChessGame.TeamColor.BLACK && path[0] > 0)
            {
                continue;
            }

            if(myPosition.getRow() == 7 || myPosition.getRow() == 2)
            {
                firstMove = true;
            }
            if(!firstMove && (path[0] == 2 || path[0] == -2))
            {
                continue;
            }
            if(firstMove)
            {
                int helper = 0;

                if(myPiece.getTeamColor() == ChessGame.TeamColor.WHITE)
                {
                    helper = 1;
                }
                else{
                    helper = -1;
                }

                ChessPiece sillyPiece = board.getPiece(new ChessPosition(myPosition.getRow() + helper, myPosition.getColumn() ));
                if(sillyPiece != null && path[1] == 0)
                {
                    continue;
                }
            }


            if(changeYaxis <= 8 && changeYaxis >= 1 && changeXaxis <= 8 && changeXaxis >= 1){
                ChessPiece otherPiece = board.getPiece(new ChessPosition(changeXaxis, changeYaxis));

                if(otherPiece != null){
                    if(otherPiece.getTeamColor() != myPiece.getTeamColor() && path[1] != 0){
                        if(changeXaxis == 8 || changeXaxis == 1){
                            bonus.add(new ChessMove(new ChessPosition(myPosition.getRow(), myPosition.getColumn()), new ChessPosition(changeXaxis, changeYaxis), ChessPiece.PieceType.QUEEN));
                            bonus.add(new ChessMove(new ChessPosition(myPosition.getRow(), myPosition.getColumn()), new ChessPosition(changeXaxis, changeYaxis), ChessPiece.PieceType.ROOK));
                            bonus.add(new ChessMove(new ChessPosition(myPosition.getRow(), myPosition.getColumn()), new ChessPosition(changeXaxis, changeYaxis), ChessPiece.PieceType.KNIGHT));
                            bonus.add(new ChessMove(new ChessPosition(myPosition.getRow(), myPosition.getColumn()), new ChessPosition(changeXaxis, changeYaxis), ChessPiece.PieceType.BISHOP));

                        }else {
                            bonus.add(new ChessMove(new ChessPosition(myPosition.getRow(), myPosition.getColumn()), new ChessPosition(changeXaxis, changeYaxis), null));
                        }
                    }
                }else if((changeXaxis == 8 || changeXaxis == 1) && path[1] == 0){
                    bonus.add(new ChessMove(new ChessPosition(myPosition.getRow(), myPosition.getColumn()), new ChessPosition(changeXaxis, changeYaxis), ChessPiece.PieceType.QUEEN));
                    bonus.add(new ChessMove(new ChessPosition(myPosition.getRow(), myPosition.getColumn()), new ChessPosition(changeXaxis, changeYaxis), ChessPiece.PieceType.ROOK));
                    bonus.add(new ChessMove(new ChessPosition(myPosition.getRow(), myPosition.getColumn()), new ChessPosition(changeXaxis, changeYaxis), ChessPiece.PieceType.KNIGHT));
                    bonus.add(new ChessMove(new ChessPosition(myPosition.getRow(), myPosition.getColumn()), new ChessPosition(changeXaxis, changeYaxis), ChessPiece.PieceType.BISHOP));

                }else if (path[1] == 0) {
                    bonus.add(new ChessMove(new ChessPosition(myPosition.getRow(), myPosition.getColumn()), new ChessPosition(changeXaxis, changeYaxis), null));
                }
            }

        }

        return bonus;

    }
}
