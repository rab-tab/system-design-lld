package composiiton_over_inheritance.composition;

import composiiton_over_inheritance.Cell;

import java.util.List;

public class Piece {
    List<Move> allowedMoves;

    public Piece(List<Move> allowedMoves) {

        this.allowedMoves=allowedMoves;
    }

    ;


    boolean canMove(Cell source, Cell destination) {

        for (Move allowedMove : allowedMoves) {
            if (allowedMove.canMove(source, destination)) return true;
        }
        return false;
    }
}
