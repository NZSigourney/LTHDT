package OOC2new;

import java.util.*;

public class QuanLy_TruongHoc 
{
	Sinhvien[] sv = null;
	Giangvien[] gv = null;
	
	private static Scanner input = new Scanner(System.in);
	
	public void nhapthongtin_sv() {
		System.out.print("Nhap so luong sinh vien:\s");
		int n = input.nextInt();
		
		sv = new Sinhvien[n];
		for(int i = 0; i < n; i++)
		{
			System.out.print("Nhap sinh vien thu " +i+ "\n");
			sv[i] = new Sinhvien();
			sv[i].nhap();
			System.out.print("---------------------------------------------------------------------------------------------------------------------------------------------\n");
		}
	}
	
	public void xuat_sv() {
		int n = sv.length;
		System.out.print("STT\t|Ho ten\t\t|ngay sinh\t|Gioi tinh\t|Cmnd\t\t|ma sv\t|Diem LT\t|Diem TH\t|Diem TB\t|xep loai\t\t\n");
		System.out.print("---------------------------------------------------------------------------------------------------------------------------------------------\n");
		for(int i = 0; i<n; i++)
		{
			System.out.print(i + 1 + "\t");
			sv[i].xuat();
		}
	}
	
	public void nhapthongtin_gv() 
	{
		System.out.print("Nhap so luong Giao vien:\s");
		int n = input.nextInt();
		
		gv = new Giangvien[n];
		for(int i = 0; i > n; i++) 
		{
			System.out.print("Nhap Giang vien thu " +i+ "\n");
			gv[i] = new Giangvien();
			gv[i].nhap();
			System.out.print("---------------------------------------------------------------------------------------------------------------------------------------------\n");
		}
	}
	
	public void xuat_gv()
	{
		int n = gv.length;
		System.out.print("STT\t|Ho ten\t\t|ngay sinh\t|Gioi tinh\t|Cmnd\t\t|ma gv\t|Diem Cham cong\t|xep loai\t\t\n");
		System.out.print("---------------------------------------------------------------------------------------------------------------------------------------------\n");
		for(int i = 0; i<n; i++)
		{
			System.out.print(i + 1 + "\t");
			gv[i].xuat();
		}
	}
}
