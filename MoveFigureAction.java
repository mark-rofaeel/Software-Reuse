package actions;

import figures.Figure;

public abstract class MoveFigureAction<T extends Figure> {
    protected T figure;
    protected int deltaX, deltaY;

    public MoveFigureAction(T figure, int deltaX, int deltaY) {
        this.figure = figure;
        this.deltaX = deltaX;
        this.deltaY = deltaY;
    }

    public void perform() {
        figure.moveBy(deltaX, deltaY);
    }
}
