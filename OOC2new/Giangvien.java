package OOC2new;

import java.util.Date;
import java.util.Scanner;
	
public class Giangvien extends Connguoi {
// khai bao thuoc tinh rieng
	private String Magv;
	private float Diemcc;
		
	public static Scanner input = new Scanner(System.in);
		
		
	public String get_Magv() {
		return this.Magv;
	}
		
	public void set_Magv(String ma) {
		this.Magv = ma;
	}
		
	public float get_Diemcc() {
		return this.Diemcc;
	}
		
	public void set_Diemcc(Float diem) {
			this.Diemcc = diem;
	}
		
	public Giangvien()
	{
		super();
	}
		
		
	public Giangvien(String ht, Date ns, String cm, String gt,String ma, float diem )
	{
		super(ht, ns, cm, gt);
		this.Magv = ma;
	}
	
	public String xeploai() {
		String xeploai;
		if(this.Diemcc == 200 || this.Diemcc >= 150) {
			xeploai = "A";
		} else if(this.Diemcc < 150 || this.Diemcc >= 100) {
			xeploai = "B";
		} else if(this.Diemcc < 100 || this.Diemcc >= 50) {
			xeploai = "C";
		}else {
			xeploai = "D";
		}
		return xeploai;
	}
		
	public void nhap() 
	{
		super.nhap();
		do {
			System.out.print("Nhap Ma Giang Vien:\s");
			set_Magv(input.nextLine());
		}while(get_Magv().length() != 4);
		
		do {
			System.out.print("Nhap Diem Cham cong:\s");
			set_Diemcc(input.nextFloat());
		}while(get_Diemcc() < 0 || get_Diemcc() > 200);
	}
	
	
	public void xuat() {
		super.xuat();
		System.out.println("	\s" + this.Magv + "\t" + this.Diemcc + "	\t" + this.xeploai() + "\n");
	}
}
