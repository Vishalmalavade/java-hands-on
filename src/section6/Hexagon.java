package section6;

public class Hexagon extends Shape {
    int hexagonSide;

    protected double calculateArea() {

        return 0.0;
    }

    public Hexagon(int hexagonSide) {
        super();
        this.hexagonSide = hexagonSide;

    }

    public int gethexagonSide() {
        return hexagonSide;
    }

    public void sethexagonSide(int hexagonSide) {
        this.hexagonSide = hexagonSide;
    }
}
