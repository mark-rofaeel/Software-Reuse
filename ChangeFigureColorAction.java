package actions;

import figures.Figure;
import java.awt.Color;

public abstract class ChangeFigureColorAction<T extends Figure> {
    protected T figure;
    protected Color newColor;

    public ChangeFigureColorAction(T figure, Color newColor) {
        this.figure = figure;
        this.newColor = newColor;
    }

    public void perform() {
        figure.setColor(newColor);
    }
}
