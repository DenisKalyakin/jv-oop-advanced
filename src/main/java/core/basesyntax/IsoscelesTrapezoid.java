package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    double upperBase;
    double bottomBase;
    double height;
    public IsoscelesTrapezoid(int upperBase, int bottomBase, int height) {
        this.upperBase = upperBase;
        this.bottomBase = bottomBase;
        this.height = height;
    }
    @Override
    public double getArea() {
        return (upperBase + bottomBase) / 2 * height;
    }
    @Override
    void drawFigure() {
        System.out.println("Figure: isoscelesTrapezoid, area: " + getArea() + " sq.units, " +
                "bottomBase: " + bottomBase + " units, upperBase: " + upperBase + " units, height: " +
                height + " units, color: " + new ColorSupplier().getRandomColor().toLowerCase());
    }
}
