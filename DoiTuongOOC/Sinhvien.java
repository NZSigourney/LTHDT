package DoiTuongOOC;

import java.util.Date;
import java.util.Scanner;

public class Sinhvien extends Connguoi {
// khai bao thuoc tinh rieng
	private String Masv;
	private float Diemlt;
	private float Diemth;
	
	public static Scanner input = new Scanner(System.in);
	
	
	public String get_Masv() {return this.Masv;}
	public void set_Masv(String ma) {this.Masv = ma;}
	public float get_Diemlt() {return this.Diemlt;}
	public void set_Diemlt(float lt) {this.Diemlt = lt;}
	public float get_Diemth() {return this.Diemth;}
	public void set_Diemth(float th) {this.Diemth = th;}
	
	public Sinhvien()
	{
		super();
	}
	
	
	public Sinhvien(String ht, Date ns, String cm, String gt,String ma,float lt, float th )
	{
		super(ht, ns, cm, gt);
		this.Masv = ma; this.Diemlt = lt; this.Diemth = th;
	}
	public float dtb() {return(this.Diemlt+this.Diemth)/2;}
	public void hocluc() {
		if(this.dtb() >= 8) {
			System.out.print("Hoc luc gioi:\t");
		}else if(this.dtb()<8 && this.dtb()>=6.5) {
			System.out.print("Hoc luc kha:\t");
		}
		else if(this.dtb()<6.5 && this.dtb()>=5) {
			System.out.print("Hoc luc TB:\t");
		}
		else{
			System.out.print("Hoc luc yeu:\t");
		}
	}
	/**
	public void nhap() 
	{
		super.Nhap();
		System.out.print("Ma sv:\t");
		this.Masv = input.nextLine(); 
		
		
		do {
			System.out.print("Diem lt:\t");
			this.Diemlt = input.nextFloat();
		
		}while(this.Diemlt <=0|| this.Diemlt>= 10);
	
	do {
		System.out.print("Diem th:\t");
		this.Diemth = input.nextFloat();
	
	}while(this.Diemth <=0|| this.Diemth>= 10);
	}
	
	public void nhap() {
		super.Nhap();
		do {
			System.out.print("Nhap ma sinh vien:\s");
			this.Masv = input.nextLine();
		}while()
	}*/
	
	public void xuat() {
		super.xuat();
		System.out.println("\nMa sv:\t" + this.Masv);
		System.out.println("lt:\t" + this.Diemlt);
		System.out.println("th:\t" + this.Diemth);
		System.out.print("DTB:\t" + this.dtb() + "\n");
		this.hocluc();
	}

}
