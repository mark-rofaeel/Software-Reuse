package actions;

import figures.HexagonFigure;
import java.awt.Color;

public class ChangeHexagonColorAction extends ChangeFigureColorAction<HexagonFigure> {
    public ChangeHexagonColorAction(HexagonFigure figure, Color newColor) {
        super(figure, newColor);
    }
}
