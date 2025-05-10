package actions;

import figures.HexagonFigure;

public class MoveHexagonAction extends MoveFigureAction<HexagonFigure> {
    public MoveHexagonAction(HexagonFigure figure, int deltaX, int deltaY) {
        super(figure, deltaX, deltaY);
    }
}
