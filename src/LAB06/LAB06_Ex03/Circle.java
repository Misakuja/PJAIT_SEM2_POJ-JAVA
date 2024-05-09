package LAB06.LAB06_Ex03;
class Circle {
    CirclePoint middlePoint;
    double radius;

    public Circle(CirclePoint middle, double radius) {
        this.middlePoint = middle;
        this.radius = radius;
    }

    public boolean isPointInside(CirclePoint p) {
        double distance = Math.sqrt(Math.pow(p.getX() - middlePoint.getX(), 2) + Math.pow(p.getY() - middlePoint.getY(),2));
        return distance <= radius;
    }
}
