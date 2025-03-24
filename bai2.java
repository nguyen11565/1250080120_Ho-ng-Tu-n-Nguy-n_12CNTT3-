/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bailabtuan5;
import java.util.Scanner;
interface Hinh {
  float pi = 3.14f;
void nhap();
void xuat(); 
float dienTich();
}
class hinhvuong implements Hinh{
private float canh;   
public hinhvuong(float canh) {
    this.canh=canh;
}
@Override
public void nhap() {
    Scanner scanner=new Scanner(System.in);
    System.out.println("nhap canh");
    this.canh = scanner.nextFloat();
}
 @Override
   public void xuat() {
        System.out.println("hinh vuong canh: " + canh + ", dien tich: " + dientich());
    }
 @Override
public float dientich() {
    return canh * canh;
}
}
class hinhchunhat implements Hinh{
    private float dai;
    private float rong;
    public hinhchunhat(float dai, float rong) {
        this.dai = dai;
        this.rong = rong;
    }
    @Override
     public void nhap() {
     Scanner scanner=new Scanner(System.in);
     System.out.println("nhap dai");
    this.dai=scanner.nextFloat();
     System.out.println("nhap rong");
    this.rong=scanner.nextFloat();
    }
   @Override
    public void xuat() {
        System.out.println("hcn dai: " + dai + ", rong: " + rong + ",dien tich: " + dientich());
    }
     @Override
     public float dientich() {
        return dai * rong;
    }
}
class hinhtron implements Hinh {
private float bankinh;
public hinhtron(float bankinh) {
    this.bankinh=bankinh;
}
@Override
public void nhap() {
      Scanner scanner=new Scanner(System.in);
    System.out.println("nhap ban kinh");
    this.bankinh=scanner.nextFloat();
}
@Override
    public void xuat(){
 System.out.println("Hinh tron ban kinh: " + bankinh + ", dien tich: " + dientich());
}
    @Override
     public float dientich() {
        return pi * bankinh * bankinh;
    }
}
    public class bai2{
    public static void main(String[] args) {
   Scanner scanner = new Scanner(System.in);
   System.out.print("Nhap so luong hinh: ");
   int n = scanner.nextInt();
    scanner.nextLine();
     Hinh ds[] = new Hinh[n];   
     for (int i = 0; i < n; i++) {
    System.out.println("chon hai hinh de nhap: ");
    System.out.println("1: hinh vuong");
    System.out.println("2: hinh chu nhat");
    System.out.println("3: hinh tron");
     int chon =scanner.nextInt();;
       switch (chon) {
         case 1:
        ds[i] = new hinhvuong();
        ds[i].nhap();
        break;
       case 2:
      ds[i] = new hinhchunhat();
      ds[i].nhap();
       break;
       case 3:
      ds[i] = new hinhtron();
      ds[i].nhap();
       break;
      default:
     System.out.println("Ban phai chon 1 trong 3 loai tren");
       }
     }
       Hinh hinhdientichlonnhat = ds[0];
for (Hinh hinh : ds) {
 if (hinh.dientich() > hinhdientichlonnhat.dientich()) {
hinhdientichlonnhat = hinh;
}
}
System.out.println("Hinh co dien tich lon nhat:");
hinhdientichlonnhat.xuat();
    }
    }