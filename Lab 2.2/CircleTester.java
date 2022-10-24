public class CircleTester {
    public static void main(String[] args) {
        Circle s = new Circle();
        Circle b = new Circle(100);

        System.out.println(s.getArea());
        System.out.println(s.getRadius());
        System.out.println(b.getArea());
        System.out.println(b.getRadius());

        Circle a = new Circle(10, "blue");
        System.out.println(a.getColor());
        System.out.println(Circle.getNumCircles());
        System.out.println(a);
    }
}