package AiSD.task_1;

public class Triangle {
    private Point x1y1;
    private Point x2y2;
    private Point x3y3;

    public Triangle(Point x1y1, Point x3y3, Point x2y2) {
        this.x1y1 = x1y1;
        this.x2y2 = x2y2;
        this.x3y3 = x3y3;


    }

    public double getPerimeter() {
        double x1 = x1y1.getX();
        double y1 = x1y1.getY();
        double x2 = x2y2.getX();
        double y2 = x2y2.getY();
        double x3 = x3y3.getX();
        double y3 = x3y3.getY();
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)) +
                Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2)) +
                Math.sqrt(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2));
    }

    public double getArea() {
        double x1 = x1y1.getX();
        double y1 = x1y1.getY();
        double x2 = x2y2.getX();
        double y2 = x2y2.getY();
        double x3 = x3y3.getX();
        double y3 = x3y3.getY();
        double a = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        double b = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));
        double c = Math.sqrt(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2));
        double p = this.getPerimeter() * 0.5;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public boolean isPointIn(Point mypoint) {
        double x1 = this.x1y1.getX();
        double y1 = this.x1y1.getY();
        double x2 = this.x2y2.getX();
        double y2 = this.x2y2.getY();
        double x3 = this.x3y3.getX();
        double y3 = this.x3y3.getY();
        double x0 = mypoint.getX();
        double y0 = mypoint.getY();
        double first = (x1 - x0) * (y2 - y1) - (x2 - x1) * (y1 - y0);
        double second = (x2 - x0) * (y3 - y2) - (x3 - x2) * (y2 - y0);
        double third = (x3 - x0) * (y1 - y3) - (x1 - x3) * (y3 - y0);
        return (first>0 && second>0 && third>0) || (first<0 && second<0 && third<0);

    }

    public Point getX1y1() {
        return x1y1;
    }

    public Point getX2y2() {
        return x2y2;
    }

    public Point getX3y3() {
        return x3y3;
    }


    public static void main(String[] args) {
        Point first = new Point(0, 0);
        Point second = new Point(0, 3);
        Point third = new Point(3, 0);
        Triangle mytriangle = new Triangle(first, second, third);
        Point testPoint = new Point(1, 1);

        System.out.println(mytriangle.getArea());
        System.out.println(mytriangle.isPointIn(testPoint));
        System.out.println(mytriangle.getPerimeter());
        assert (mytriangle.isPointIn(testPoint));


    }


}
