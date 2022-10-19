package DoiTuongOOC;

import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Connguoi {
	
	static Scanner input = new Scanner(System.in);
	
	private String HoTen;
	private Date NgaySinh;
	private String CMND;
	private String Gioitinh;
	
	// get Data String, Date
	public String get_Hoten() {
		return HoTen;
	}
	
	public Date get_Ngaysinh() {
		return NgaySinh;
	}
	
	public String get_CMND() {
		return CMND;
	}
	
	public String get_Gioitinh() {
		return Gioitinh;
	}
	
	// set Data
	public void set_Hoten(String ht) {
		this.HoTen = ht;
	}
	
	public void set_Ngaysinh(Date ns) {
		this.NgaySinh = ns;
	}
	
	
	public void set_cmnd(String cmnd) {
		this.CMND = cmnd;
	}
	
	public void set_gioitinh(String gt) {
		this.Gioitinh = gt;
	}
	
	// Contructor
	
	public Connguoi() {
		
	}
	
	public Connguoi(String ht, Date ns, String cmnd, String gt) {
		this.HoTen = ht;
		this.NgaySinh = ns;
		this.CMND = cmnd;
		this.Gioitinh = gt;
	}
	
	public void Nhap() {
		System.out.print("Ho ten:\s");
		this.HoTen = input.nextLine();
		System.out.print("Gioi tinh:\s");
		this.Gioitinh = input.nextLine();
		System.out.print("CMND:\s");
		this.CMND = input.nextLine();
		
		String ngay;
		Boolean ok;
		do {
			ok = true;
			System.out.print("ngay sinh:\s");
			ngay = input.nextLine();
			try {
				this.NgaySinh = new SimpleDateFormat("dd/MM/yyyy").parse(ngay);
		
			} catch (Exception e) {
				ok = false;
			}
		}while(! ok);
		
	}
	
	public void xuat() 
	{
		@SuppressWarnings("deprecation")
		int ngay = this.NgaySinh.getDate();
		@SuppressWarnings("deprecation")
		int thang = this.NgaySinh.getMonth();
		@SuppressWarnings("deprecation")
		int nam = this.NgaySinh.getYear();
		
		if (nam >=100) {
			nam= 1900 + nam;
		}
		System.out.print("Ho ten:\s"+this.HoTen+";\s");
		System.out.print("gioi tinh:\s"+this.Gioitinh+";\s");
		System.out.print("Ngay sinh:\s"+ ngay+"/"+thang+"/"+ nam + "\n");
		System.out.print("So CMND:\s"+this.CMND+";\s");
	
	}
}
