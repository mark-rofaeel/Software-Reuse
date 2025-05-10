package figures;

import java.awt.Graphics;
import java.awt.Polygon;

public class HexagonFigure extends Figure {
    private int[] xPoints;
    private int[] yPoints;

    public HexagonFigure(int x, int y, int size) {
        super(x, y, size, size);
        calculatePoints();
    }

    private void calculatePoints() {
        int halfSize = size / 2;
        xPoints = new int[] {
            x + halfSize / 2, x + 3 * halfSize / 2, x + size, x + 3 * halfSize / 2, x + halfSize / 2, x
        };
        yPoints = new int[] {
            y, y, y + halfSize, y + size, y + size, y + halfSize
        };
    }

    @Override
    public void draw(Graphics g) {
        g.drawPolygon(new Polygon(xPoints, yPoints, 6));
    }
}
