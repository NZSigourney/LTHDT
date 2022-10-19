package OOC2new;

import java.util.Scanner;

public class CT_Chinh {
	
	private static QuanLy_TruongHoc ql = new QuanLy_TruongHoc();
	private static Scanner input = new Scanner(System.in);
	
	//private static Sinhvien sv = new Sinhvien();

	public static void main(String[] args) 
	{
	//	Connguoi cn = new Connguoi();
	//	cn.nhap();
	//	cn.xuat();
	//	GiangVien[] gv = null;
	//	ql.nhapthongtin_sv();
	//	ql.xuat_sv();
	//	ql.nhapthongtin_gv();
	//	ql.xuat_gv();
		Menu();
	}
	
	public static void Menu() 
	{
		boolean count = true;
		do {
			System.out.println("=========================================================");
			System.out.println("1. Nhap thong tin Sinh vien\n2. Xuat thong tin Sinh Vien\n3. Nhap thong tin Giang vien\n4. Xuat Thong tin Giao vien\n5. Exit");
			System.out.println("=========================================================");
			System.out.print("Nhap So:\s");
			int choose = input.nextInt();
			switch(choose) 
			{
			case 1:
				ql.nhapthongtin_sv();
				break;
			case 2:
				ql.xuat_sv();
				break;
			case 3:
				ql.nhapthongtin_gv();
				break;
			case 4:
				ql.xuat_gv();
				break;
			case 5:
				System.exit(choose);
				break;
			}
		} while(count);
	}

}
