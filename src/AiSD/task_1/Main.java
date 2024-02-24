package AiSD.task_1;

public class Main {
    public static void main(String[] args) {
        Point first = new Point(1, 1);
        Point second = new Point(0, 3);
        Point third = new Point(3, 1);
        Triangle mytriangle = new Triangle(first, second, third);
        Point testPoint = new Point(0, 1);

        System.out.println(mytriangle.getArea());
        System.out.println(mytriangle.isPointIn(testPoint));
        System.out.println(mytriangle.getPerimeter());
    }
}
