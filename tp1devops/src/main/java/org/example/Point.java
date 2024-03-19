package org.example;

//import static java.lang.Double.compare;

public class Point {
    private double x;
    private double y;

    public Point (double x, double y) {
        super();
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public Point translater (double dx, double dy) {
        return new Point (this.getX() + dx, this.getY() + dy);
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Point){
            Point O = (Point) o;
            return Double.compare(this.getX(), O.getX() ) == 0 &&
                    Double.compare(this.getY(), O.getY()) == 0;
        }
        return false;
    }
}
