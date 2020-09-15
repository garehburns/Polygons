package polygons;

public class Triangle {
    
    private double base;
    
    private double height;
    
    private Point p;
    
    private int layer;
    
    public Triangle(double b, double h, Point p, int l) {
        
        base = b;
        
        height = h;
        
        this.p = p;
        
        layer = l;
        
    }
    
    public double getBase() {
        
        return base;
        
    }
    
    public double getHeight() {
        
        return height;
        
    }
    
    public double area() {
        
        return 0.5 * base * height;
    }
    
    public String toString() {
        
        return ("/ " + area() + " " + "\\");
    }

    public Point getP() {
        return p;
    }

    public int getLayer() {
        return layer;
    }
    
    
}
