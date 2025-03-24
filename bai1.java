/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bailabtuan5;
import java.util.ArrayList;
import java.util.Scanner;
abstract class nhanvien {
    protected String manhanvien;
    protected String tennhanvien;
protected String trinhdo;
protected double luongcoban;
public nhanvien(){
    this.manhanvien = "";
this.tennhanvien = "";
this.trinhdo = "";
this.luongcoban = 0.0;
}
public nhanvien(String manhanvien, String tennhanvien, String trinhdo) {
this.manhanvien = manhanvien;
this.tennhanvien = tennhanvien;
this.trinhdo = trinhdo;
this.luongcoban = 0.0;
}
public String getmanhanvien(){
return manhanvien;
}
public String gettennhanvien() {
return tennhanvien;
}
public String gettrinhDo() {
return trinhdo;
}
public double getluongcoban() {
return luongcoban;
}
public void setluongcoban(double luongcoban) {
this.luongcoban = luongcoban;
}
public void nhap(){
    Scanner scanner = new Scanner(System.in);
    System.out.println("nhap ma nhan vien ");
    this.manhanvien=scanner.nextLine();
    System.out.print("Nhap ten nhan vien:");
    this.tennhanvien = scanner.nextLine();
    System.out.print("Nhap trinh do:");
    this.trinhdo = scanner.nextLine();
    System.out.print("Nhap luong co ban:");
    this.luongcoban = scanner.nextDouble();
}
public void xuat() {
 System.out.println("ma nhan vien: " + manhanvien + ", ten nhan vien: " + tennhanvien + ", trinh do: " + trinhdo + ", luong co ban: " + luongcoban);
}
public abstract double tinhluong();
}
class quanly extends nhanvien {
private String chuyenmon;
private double phucapcongviec;
public quanly(){
   this.chuyenmon="";
   this.phucapcongviec=0.0;
}
    public quanly(String manhanvien, String tennhanvien, String trinhdo,String chuyenmon, double phucapcongviec) {
        super(manhanvien,tennhanvien,trinhdo);
        this.chuyenmon = chuyenmon;
        this.phucapcongviec = phucapcongviec;
    }
    public String getChuyenmon() {
        return chuyenmon;
    }
    public double getPhucapcongviec() {
        return phucapcongviec;
    }

    @Override
    public void nhap() {
        super.nhap();
        Scanner scanner=new Scanner(System.in);
        System.out.print("nhap chuyen mon ");
        this.chuyenmon=scanner.nextLine();
        System.out.println("nhap phu cap cong viec");
        this.phucapcongviec=scanner.nextDouble();
    }

    @Override
    public void xuat() {
        super.xuat(); 
        System.out.println("chuyen mon :"+chuyenmon+",phu cap cong viec:"+phucapcongviec);    
    }
  @Override
public double tinhluong() {
     return luongcoban + phucapcongviec;
}
}
class nghiencuu extends nhanvien {
private String chuyenmon;
private double phucapdochai;
public nghiencuu(){
    this.chuyenmon="";
    this.phucapdochai=0.0;
}
    public nghiencuu(String manhanvien, String tennhanvien, String trinhdo,String chuyenmon, double phucapdochai) {
        super(manhanvien,tennhanvien,trinhdo);
        this.chuyenmon = chuyenmon;
        this.phucapdochai = phucapdochai;
    }

    public String getchuyenmon() {
        return chuyenmon;
    }

    public double getphucapdochai() {
        return phucapdochai;
    }
    @Override
public void nhap() {
    super.nhap();
    Scanner scanner=new Scanner(System.in);
    System.out.println("nhap chuyen mon");
    this.chuyenmon=scanner.nextLine();
    System.out.println("nhap phu cap doc hai");
    this.phucapdochai=scanner.nextDouble();
}

    @Override
    public void xuat() {
        super.xuat();
        System.out.println("chuyen mon:"+chuyenmon+",phu cap doc hai:"+phucapdochai);
    }
    @Override
       public double tinhluong() {
        return luongcoban + phucapdochai;
}
}
class phucvu extends nhanvien{
    public phucvu() {
}
    public phucvu(String manhanvien, String tennhanvien, String trinhdo) {
        super(manhanvien,tennhanvien,trinhdo);
    }
@Override
public double tinhluong() {
    return luongcoban;
}
}
public class bai1{
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
           ArrayList<nhanvien> danhsachnhanvien = new ArrayList<>();
        quanly ql=new quanly("QL001","Nguyen Van A","Dai hoc","Quan tri",2000000);
        nghiencuu nc = new nghiencuu("NC001", "Tran Thi B", "Thac si", "Hoa hoc", 1500000);
        phucvu  pv = new phucvu("PV001", "Le Van C", "Trung cap");
        danhsachnhanvien.add(ql);
        danhsachnhanvien.add(nc);
        danhsachnhanvien.add(pv);
  System.out.println("danh sach nhan vien:");
        for (nhanvien nv : danhsachnhanvien) {
            nv.xuat();
            System.out.println("luong: " + nv.tinhluong());
    }
}
}

