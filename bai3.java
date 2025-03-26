/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bailabtuan5;
abstract class Shape {
protected String color;
protected boolean filled;
public Shape() {
this.color = "red";
this.filled = true;
}
public Shape(String color, boolean filled) {
this.color = color;
this.filled = filled;
}
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean getFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    public abstract double getArea();
     public abstract double getPerimeter(); 
     
 @Override
    public String toString() {
        return "Shape[color=" + color + ", filled=" + filled + "]";
    }
    @Override
public boolean equals(Object obj) {
if (this == obj) return true;
if (obj == null || getClass() != obj.getClass()) return false;
Shape shape = (Shape) obj;
return filled == shape.filled && color.equals(shape.color);
}
}
class Circle extends Shape {
private double radius;
public Circle() {
this.radius=1.0;
public Circle(String color, boolean filled,double radius) {
super(color,filled);
this.radius=radius; 
}
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    @Override
public double getArea() {
  return Math.PI * radius * radius;
}
@Override
public double getPerimeter() {
    return 2 * Math.PI * radius;
}
@Override
public String toString() {
  return "hinh tron [radius=" + radius + ", color=" + color + ", filled=" + filled + "]";
}
}
class Rectangle extends Shape {
    protected double width;
    protected double length;

    public Rectangle() {
        this.width = 1.0;
        this.length = 1.0;
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return width * length;
    }
    @Override
public double getPerimeter() {
     return 2 * (width + length);
}
@Override
public String toString() {
  return "hinh chu nhat [width=" + width + ", length=" + length + ", color=" + color + ", filled=" + filled + "]";
}
}
class Square extends Rectangle {
    public Square() {
        super();
    }

    public Square(double side) {
        super(side,side);
    }
    
    public Square(double side, String color, boolean filled) {
        super(side,side,color,filled);
    }

    public double getSide() {
        return width;
    }

    public void setSide(double side) {
        this.width = side;
        this.length = side;
    }
    
    @Override
    public void setWidth(double width) {
        setSide(width);
    }

    @Override
    public void setLength(double length) {
        setSide(length);
    }
     @Override
    public String toString() {
        return "hinh vuong [side=" + width + ", color=" + color + ", filled=" + filled + "]";
    }
}
public class bai3{
     public static void main(String[] args) {
        Circle cir = new Circle(5, "blue",true);
        System.out.println("Thong tin hinh tron:");
        System.out.println(cir);

        Rectangle rec = new Rectangle(4, 6, "green", false);
        System.out.println("Thong tin hinh chu nhat:");
        System.out.println(rec);

        Square squ = new Square(3,"yellow", true);
        System.out.println("Thong tin hinh vuong:");
        System.out.println(squ);
        
        System.out.println("Kiem tra equals:");
        System.out.println("Circle va Rectangle co bang nhau khong? " + cir.equals(rec));
        System.out.println("Rectangle va Square co bang nhau khong? " + rec.equals(squ));
     }
}
    
    