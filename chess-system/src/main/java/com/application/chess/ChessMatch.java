package com.application.chess;

import com.application.boardgame.Board;
import com.application.boardgame.Position;
import com.application.chess.pieces.Rook;

public class ChessMatch {
    private Board board;
    public ChessMatch() { //ver
        board = new Board(8, 8);
        initialSetup();
    }

    public ChessPiece[][] getPieces() {
        ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
        for (int i = 0; i < board.getRows(); i++) {
            for (int j = 0; j < board.getColumns(); j++) {
                mat[i][j] = (ChessPiece) board.piece(i, j);
            }
        }
        return mat;
    }

    private void initialSetup() {

        board.placePiece(new Rook(board, Color.WHITE), new Position(2, 1));
        board.placePiece(new Rook(board, Color.BLACK), new Position(0, 1));
        board.placePiece(new Rook(board, Color.WHITE), new Position(7, 4));


    }
}
