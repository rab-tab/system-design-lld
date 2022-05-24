package composiiton_over_inheritance.composition;

import composiiton_over_inheritance.Cell;

public class HorizontalMove implements Move {
    @Override
    public boolean canMove(Cell source, Cell destination) {
        return false;
    }
}
