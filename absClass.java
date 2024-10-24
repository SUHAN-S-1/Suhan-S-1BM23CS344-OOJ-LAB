abstract class Shape {
    double dim1;
    double dim2;
    
    Shape(double dim1, double dim2) {
        this.dim1 = dim1;
        this.dim2 = dim2;
    }
    
    abstract void printArea();
}

class Rectangle extends Shape {
    Rectangle(double l, double b) {
        super(l,b);
    }
    
    void printArea() {
        double area = dim1*dim2;
        System.out.println("Area of Rectangle = "+area);
    }
}

class Triangle extends Shape {
    Triangle(double h, double b) {
        super(h,b);
    }
    
    void printArea() {
        double area = 0.5*dim1*dim2;
        System.out.println("Area of Triangle = "+area);
    }
}

class Circle extends Shape {
    Circle(double r) {
        super(r,0);
    }
    
    void printArea() {
        double area = 3.14*dim1*dim2;
        System.out.println("Area of Circle ="+area);
    }
}

public class absClass {
    public static void main(String args[]) {
        Shape rec = new Rectangle(4,3);
        Shape tri = new Triangle(4,3);
        Shape cir = new Circle(4);
        
        rec.printArea();
        tri.printArea();
        cir.printArea();
    }
}