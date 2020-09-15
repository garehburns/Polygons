package polygons;

public class Main {

    public static void main(String[] args) {
        
        Point p1 = new Point(1, 1);
        
        Point p2 = new Point(2,2);
        
        Point p3 = new Point(3, 3);
        
        Point p4 = new Point(4,4);
        
        Point p5 = new Point(5, 5);
        
        Point p6 = new Point(6, 6);
        
        Circle circle1 = new Circle(p1, 1, 2.0);
        
        Circle circle2 = new Circle(p2, 2, 4.0);
        
        Rectangle rectangle1 = new Rectangle(3.0, 5.0, p3, 3);
        
        Rectangle rectangle2 = new Rectangle(6.0, 1.0, p4, 4);
        
        Triangle triangle1 = new Triangle(4.0, 3.0, p5, 5);
        
        Triangle triangle2 = new Triangle(2.0, 5.0, p6, 6);
        
        System.out.println("Area of first circle: " + circle1.area());
        System.out.println("Location: (" + p1.getxCoordinate() + ", " + p1.getyCoordinate() + ")");
        System.out.println(circle1.toString() + "\n");
        
        System.out.println("Area of second circle: " + circle2.area());
        System.out.println("Location: (" + p2.getxCoordinate() + ", " + p2.getyCoordinate() + ")");
        System.out.println(circle2.toString() + "\n");
        
        System.out.println("Area of first rectangle: " + rectangle1.area());
        System.out.println("Location: (" + p3.getxCoordinate() + ", " + p3.getyCoordinate() + ")");
        System.out.println(rectangle1.toString() + "\n");
        
        System.out.println("Area of second rectangle: " + rectangle2.area());
        System.out.println("Location: (" + p4.getxCoordinate() + ", " + p4.getyCoordinate() + ")");
        System.out.println(rectangle2.toString() + "\n");
        
        System.out.println("Area of first triangle: " + triangle1.area());
        System.out.println("Location: (" + p5.getxCoordinate() + ", " + p5.getyCoordinate() + ")");
        System.out.println(triangle1.toString() + "\n");
        
        System.out.println("Area of second triangle: " + triangle2.area());
        System.out.println("Location: (" + p6.getxCoordinate() + ", " + p6.getyCoordinate() + ")");
        System.out.println(triangle2.toString());
        
    }
    
}
