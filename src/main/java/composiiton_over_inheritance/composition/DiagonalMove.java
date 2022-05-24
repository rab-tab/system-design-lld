package composiiton_over_inheritance.composition;

import composiiton_over_inheritance.Cell;

public class DiagonalMove implements Move{
    @Override
    public boolean canMove(Cell source, Cell destination) {
        return false;
    }
}
