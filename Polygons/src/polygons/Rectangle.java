package polygons;

public class Rectangle {
    
    private double length;
    
    private double width;
    
    private Point p;
    
    private int layer;
    
    public Rectangle(double l, double w, Point p, int layer) {
    
       length = l;
       
       width = w;
       
       this.p = p;
       
       this.layer = layer;
       
    }
    
    public double getLength() {
        
        return length;
        
    }
    
    public double getWidth() {
        
        return width;
        
    }
    
    public double area() {
        
        return length * width;
        
    }
    
    public String toString() {
        
        return "[ " + area() + " ]";
    }

    public Point getP() {
        return p;
    }

    public int getLayer() {
        return layer;
    }
    
    
    
}
