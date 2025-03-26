/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bailabtuan5;
import java.util.Scanner;
interface Movable {
void moveUp();
void moveDown();
void moveLeft();
void moveRight();
}
class MovablePoint implements Movable {
private int x;
private int y;
private int xSpeed;
private int ySpeed;
 public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
     this.x=x;
     this.y=y;
     this.xSpeed=xSpeed;
     this.ySpeed=ySpeed;
 }
 public void nhap() {
     Scanner scanner=new Scanner(System.in);
     System.out.pritnln("nhap x");
     this.x=scanner.nextInt();
     System.out.pritnln("nhap y");
     this.y=scanner.nextInt();
     System.out.pritnln("nhap xSpeed");
     this.xSpeed=scanner.nextInt();
      System.out.pritnln("nhap ySpeed");
     this.ySpeed=scanner.nextInt();
 }
    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(int xSpeed) {
        this.xSpeed = xSpeed;
    }

    public int getySpeed() {
        return ySpeed;
    }

    public void setySpeed(int ySpeed) {
        this.ySpeed = ySpeed;
    }
 @Override
public String toString() {
 return  "MovablePoint[x=" + x + ", y=" + y + ", xSpeed=" + xSpeed + ", ySpeed=" + ySpeed + "]";
}
@Override
public void moveUp() {
  y += ySpeed;
}
@Override
 public void moveDown() {
 y -= ySpeed;
    }
@Override
public void moveLeft() {
 x -= xSpeed;
}
@Override
public void moveRight() {
 x += xSpeed;
}
}
class MovableCircle implements Movable {
private int radius;
private MovablePoint center;
public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
public void nhap() {
   Scanner scanner=new Scanner(System.in);
     System.out.pritnln("nhap radius");
     this.radius=scanner.nextInt();
     System.out.pritnln("nhap center");
     this.center=scanner.nextMovablePoint();
}
public int getRadius() {
        return radius;
    }
 public void setRadius(int radius) {
        this.radius = radius;
    }
    public MovablePoint getCenter() {
        return center;
    }
    public void setCenter(MovablePoint center) {
        this.center = center;
    }
@Override
public String toString() {
    return "MovableCircle[radius=" + radius + ", center=" + center + "]";
}
  @Override
    public void moveUp() {
        center.moveUp();
    }
    @Override
    public void moveDown() {
        center.moveDown();
    }
    @Override
    public void moveLeft() {
        center.moveLeft();
    }
    @Override
    public void moveRight() {
        center.moveRight();
    }
}
}
   public class bai4{
    public static void main(String[] args) { 
   Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap thong tin hinh tron:");
      MovableCircle circle = new MovableCircle(x, y, xSpeed, ySpeed, radius);
        System.out.println("vi tri ban dau: " + circle);
        circle.moveUp();
        System.out.println("Sau khi di chuyen len: " + circle.toString());
        circle.moveDown();
        System.out.println("Sau khi di chuyen xuong: " + circle.toString());
        circle.moveLeft();
        System.out.println("Sau khi di chuyen qua trai: " + circle.toString());
        circle.moveRight();
        System.out.println("Sau khi di chuyen sang phai: " + circle.toString());
        
    }

}