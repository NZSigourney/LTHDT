package OOC2new;

import java.util.Date;
import java.util.Scanner;

public class Sinhvien extends Connguoi
{//Khai báo thuộc tính riêng
	
	private static Scanner in = new Scanner(System.in);
	
	private String MaSV;
	private float DiemLT;
	private float DiemTH;
// Xây dựng pthuc set/get 
	public String get_MaSV() {return this.MaSV;}
	public void set_MaSV(String ma) {this.MaSV = ma;}
	
	public float get_DiemLT() {return this.DiemLT;}
	public void set_DiemLT(float lt) {this.DiemLT = lt;}
	
	public float get_DiemTH() {return this.DiemTH;}
	public void set_DiemTH(float th) {this.DiemTH = th;}
//Xây dựng hàm tạo
	public Sinhvien() {super();}
	public Sinhvien(String ht, Date ns,String gt, String cmnd,String masv, float lt, float th) 
	{
		super(ht, ns, gt, cmnd);
		this.MaSV = masv; this.DiemLT = lt; this.DiemTH = th;
	}
	
	/**public float DTB() {
		return (get_DiemLT() + get_DiemTH())/2;
	}*/
	
	public float Trungbinh() 
	{
		return (this.DiemLT+this.DiemTH)/2;
	}
	
	public String xeploai() {
		String x1;
		if(Trungbinh() >= 8) {
			x1 = "Gioi";
		}else if (Trungbinh() >= 7) {
			x1 = "Kha";
		}else if (Trungbinh() >= 5) {
			x1 = "Tr.Binh";
		}else {
			x1 = "Yeu";
		}
		return x1;
	}
	
//viết laik phương thức nhập xuất 
	public void nhap() 
	{
		super.nhap();//của lớp connguoi
		//Scanner in = new Scanner(System.in);
		do {
			System.out.print("Nhap Ma Sinh Vien:\s");
			//this.MaSV = in.nextLine();
			set_MaSV(in.nextLine());
		}while(get_MaSV().length()!=4);
		
		do {
			System.out.print("Nhap Diem Ly Thuyet:\s");
			//.DiemLT = in.nextFloat();
			set_DiemLT(in.nextFloat());
		} while(get_DiemLT()<0||get_DiemLT()>10);
		
		do {
			System.out.print("Nhap Diem Thuc Hanh:\s");
			this.DiemTH = in.nextFloat();
		} while(this.DiemTH<0||this.DiemTH>10);
	}
	
	//viết laik phương thức nhập xuất 
		public void xuat() 
		{
			super.xuat();
			System.out.print("	\s"+this.MaSV+"\t"+this.DiemLT+"	\t");
			System.out.print("	"+this.DiemTH+"	\t"+this.Trungbinh()+"	\t" + this.xeploai() +"\n");
		}
}
