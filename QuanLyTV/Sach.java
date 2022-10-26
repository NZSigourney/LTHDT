package QuanLyTV;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Sach 
{
	
	private static Scanner in = new Scanner(System.in);
	
	private String masach;
	private Date ngaynhap;
	private float dongia;
	private int soluong;
	private String nhaxuatban;
	
//  GET / SET
	public String get_masach() 				{return masach;}
	public void set_masach(String ms) 		{this.masach = ms;}
	
	public Date get_ngaynhap()				{return ngaynhap;}
	public void set_ngaynhap(Date ngnh) 	{this.ngaynhap = ngnh;}

	public float get_dongia() 				{return dongia;}
	public void set_dongia(float dg) 		{this.dongia = dg;}
	
	public int get_soluong() 				{return soluong;}
	public void set_soluong(int sl) 		{this.soluong = sl;}
	
	public String get_nhaxuatban() 			{return nhaxuatban;}
	public void set_nhaxuatban(String nxb)	{this.nhaxuatban = nxb;}
		
// Hàm dựng constructors
	public Sach() {}
	public Sach(String ms, Date ngnh, float dg, int sl, String nxb)
	{
		this.masach = ms;
		this.ngaynhap = ngnh;
		this.dongia = dg;
		this.soluong = sl;
		this.nhaxuatban = nxb;
	}
	// Hàm nhập
	public void Nhap()
	{		
//nhập và kiểm tra mã sách nhập vào đủ 9 hay chưa 
		do
		 {
			System.out.print("		+ Nhap ma sach: \t");
			this.masach = in.nextLine();
		 }
		 while(this.masach.length() != 9);
	
//nhập và kiểm tra ngày nhập
		 String ngay;
		 Boolean ok;
		 do
		 {
			 ok = true;
			 System.out.print("Nhap ngay nhap sach: \t");
			 ngay = in.nextLine();
			 try
			 {
				 this.ngaynhap = new SimpleDateFormat("dd/MM/yyyy").parse(ngay);
			 }
			 catch(Exception e)		{ok = false;}
		 }
		 while(!ok);
//nhập doanh thu
		while(true)
		{
			try 
			{
				System.out.print("Don Gia: \t");
				dongia = Integer.parseInt(in.nextLine());
				break;
			}
			catch(Exception e) 
			{
				System.out.println("!!!!! Vui long nhap so !!!!!");
			}
		}
		
// nhập số lượng
		System.out.print("Nhap so luong: \t");
		soluong = in.nextInt();
// nhập tên nhà xuất bản
		System.out.print("Nhap ten nha xuat ban: \t");
		nhaxuatban = in.nextLine();
	}
	
// Xuất
	@SuppressWarnings("deprecation")
	public String toString() {
		int ngay= this.ngaynhap.getDate();
		int thang = this.ngaynhap.getMonth()+1;
		int nam = this.ngaynhap.getYear();
		if (nam >= 100)		{nam = 1900 + nam;}
        return "Ma Sach: " + this.masach + ", Ngay Nhap " + ngay + "/" + thang + "/" + nam + ", ten nha xuat ban: " + this.nhaxuatban + ", Don Gia: " +  this.dongia + ", so luong: " + this.soluong;
    }
}
