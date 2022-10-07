package p07102022;

import java.util.Scanner;

public class Connguoi {
	private String hoten;
	private int namsinh;
	private String CMND;
	private static Scanner input = new Scanner(System.in);
	
	public String get_Hoten() {
		return hoten;
	}
	
	public void set_Hoten(String ht) {
		this.hoten = ht;
	}
	
	public int get_Namsinh() {
		return namsinh;
	}
	
	public void set_Namsinh(int ns) {
		this.namsinh = ns;
	}
	
	public String get_CMND() {
		return CMND;
	}
	
	public void set_CMND(String cm) {
		this.CMND = cm;
	}
	
	public Connguoi() {}
	
	public Connguoi(String ht, int ns, String cm) {
		this.hoten = ht;
		this.namsinh = ns;
		this.CMND = cm;
	}
	
	public void nhap() {
		System.out.print("Nhap ho ten:\t");
		this.hoten = input.nextLine();
		System.out.print("Nhap Nam Sinh:\t:");
		this.namsinh = input.nextInt();
		System.out.print("Nhap CMND:\t:");
		this.CMND = input.nextLine();
		input.nextLine();
		input.close();
	}
	
	public void xuat() {
		System.out.print("Ho Ten\t:" + this.hoten + ";\n" + "Nam sinh:\t" + this.namsinh + ";\n" + "CMND:\t" + this.CMND + ";\n");
		System.out.println();
	}
	
}