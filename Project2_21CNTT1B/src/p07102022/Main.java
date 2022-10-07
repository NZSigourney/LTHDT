package p07102022;

import java.util.Scanner;

public class Main {
	
	private String hoten;
	private int namsinh;
	private String CMND;
	
	public String get_HoTen() {
		return hoten;
	}
	
	public void set_HoTen(String ht) {
		this.hoten = ht;
	}
	
	public int get_NamSinh() {
		return namsinh;
	}
	
	public void set_NamSinh(int ns) {
		this.namsinh = ns;
	}
	
	public String get_CMND() {
		return CMND;
	}
	
	public void set_NamSinh(String cm) {
		this.CMND = cm;
	}
	
	public Main() {}
	
	public Main(String ht, int ns, String cm) {
		this.hoten = ht;
		this.namsinh = ns;
		this.CMND = cm;
	}
	
	public void nhap()
	{
		Scanner in = new Scanner(System.in);
		System.out.print("nhap ho ten:\s");
		this.hoten = in.nextLine();
		System.out.print("nhap nam sinh:\s");
		this.namsinh = in.nextInt();
		System.out.print("nhap Cmnd:\s");
		this.CMND = in.nextLine();
		in.nextLine();
		in.close();
	}
	
	//xay dung phuong thuc thong tin cho baitap
	public void xuat()
	{
		System.out.print("Ho Ten\s:" + this.hoten + ";\n" + "Nam sinh:\s" + this.namsinh + ";\n" + "CMND:\s" + this.CMND + ";");
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connguoi bt = new Connguoi("\sThai Duy vu", 2003, "123456789");
		bt.xuat();
		
		Main giatri = new Main();
		giatri.nhap();
		giatri.xuat();
	}

}
