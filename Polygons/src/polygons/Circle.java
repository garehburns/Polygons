package polygons;

public class Circle {
    
    private double radius;
    
    private Point p;
    
    private int layer;
    
    public Circle(Point p, int l, double r) {
        
        radius = r;
        this.p = p;
        layer = l;
        
    }
    
    public double getRadius() {
        
        return radius;
        
    }
    
    public double area() {
        
        return (Math.PI * Math.pow(radius, 2.0));
        
    }
    
    public String toString() {
        
        return ("( " + area() + " )");
        
    }

    public Point getP() {
        return p;
    }

    public int getLayer() {
        return layer;
    }
    
    
    
    
}
