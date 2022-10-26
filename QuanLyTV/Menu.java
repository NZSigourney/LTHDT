package QuanLyTV;

import java.util.Scanner;
public class Menu 
{
	
	private static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		//Scanner in=new Scanner(System.in);
		/**while(true) 
		{
			System.out.println("1/ SACH GIAO KHOA");
			System.out.println("2/ SACH THAM KHAO");
			System.out.print("Moi lua chon: \t");
			int luachon = in.nextInt();
			if (luachon == 0) 
			{
				System.exit(0);
			}
			else
			{
				switch(luachon) 
				{
				case 1:
					Scanner in1 = new Scanner(System.in);
					while(true) 
					{
						System.out.println("======== MENU  ========");
						System.out.println("1/ Nhap Thong Tin Sach Giao Khoa");
						System.out.println("2/ Xuat Thong tin Sach Giao Khoa");
						System.out.println("3/ Tim kiem nha xuat ban");
						System.out.println("4/ Sap xep theo ma sach");
						System.out.println("5/ Tinh tong thanh tien va Tinh trung binh cho cac loai sach");
						System.out.print("Moi lua chon: \t");
						int luachon1 = in1.nextInt();
						if (luachon1 == 0) 
						{
							System.exit(0);
						}
						else 
						{
							switch(luachon1) 
							{
							case 1:
								quanliThuvien.nhap_sach_GK();
								break;
							case 2:
								quanliThuvien.xuat_sach_GK();
								break;
							case 3:
								quanliThuvien.timkiem_theoten(null);
								break;
							case 4:
								quanliThuvien.sapxeptheoma();
								break;
							case 5:
								quanliThuvien.tinhtien();
								break;
							default:
								System.out.println("KHONG CO LUA CHON NAO PHU HOP!");
								break;
							}	
						}
					}
				case 2:
					Scanner in2 = new Scanner(System.in);
					while(true) 
					{
						System.out.println("======== MENU  ========");
						System.out.println("1/ Nhap Thong Tin Sach Tham KHao");
						System.out.println("2/ Xuat Thong tin Sach Tham Khao");
						System.out.println("3/ Tim kiem nha xuat ban");
						System.out.println("4/ Sap xep theo ma sach");
						System.out.println("5/ Tinh tong thanh tien va Tinh trung binh cho cac loai sach");
						System.out.print("Moi lua chon: \t");
						int luachon2 = in2.nextInt();
						if (luachon2 == 0) 
						{
							System.exit(0);
						}
						else
						{
							switch(luachon2) 
							{
							case 1:
								quanliThuvien.nhap_sach_TK();
								break;
							case 2:
								quanliThuvien.xuat_sach_TK();
								break;
							case 3:
								quanliThuvien.timkiem_theoten(null);
								break;
							case 4:
								quanliThuvien.sapxeptheoma();
								break;
							case 5:
								quanliThuvien.tinhtien();
								break;
							default:
								System.out.println("KHONG CO LUA CHON NAO PHU HOP!");
								break;
							}
						}
					}
				default:
					System.out.println("KHONG CO LUA CHON NAO PHU HOP!");
					break;
				}
			}
		}*/
		
		menu();
	}
	
	public static void menu() {
		while(true) 
		{
			System.out.println("1/ SACH GIAO KHOA");
			System.out.println("2/ SACH THAM KHAO");
			System.out.print("Moi lua chon: \t");
			int luachon = in.nextInt();
			if (luachon == 0) 
			{
				System.exit(0);
			}
			else
			{
				switch(luachon) 
				{
				case 1:
					Scanner in1 = new Scanner(System.in);
					while(true) 
					{
						System.out.println("======== MENU  ========");
						System.out.println("1/ Nhap Thong Tin Sach Giao Khoa");
						System.out.println("2/ Xuat Thong tin Sach Giao Khoa");
						System.out.println("3/ Tim kiem nha xuat ban");
						System.out.println("4/ Sap xep theo ma sach");
						System.out.println("5/ Tinh tong thanh tien va Tinh trung binh cho cac loai sach");
						System.out.println("6/ Quay lai menu");
						System.out.print("Moi lua chon: \t");
						int luachon1 = in1.nextInt();
						if (luachon1 == 0) 
						{
							System.exit(0);
						}
						else 
						{
							switch(luachon1) 
							{
							case 1:
								quanliThuvien.nhap_sach_GK();
								break;
							case 2:
								quanliThuvien.xuat_sach_GK();
								break;
							case 3:
								quanliThuvien.timkiem_theoten(null);
								break;
							case 4:
								quanliThuvien.sapxeptheoma();
								break;
							case 5:
								quanliThuvien.tinhtien();
								break;
							case 6:
								menu();
								break;
							default:
								System.out.println("KHONG CO LUA CHON NAO PHU HOP!");
								break;
							}	
						}
					}
				case 2:
					Scanner in2 = new Scanner(System.in);
					while(true) 
					{
						System.out.println("======== MENU  ========");
						System.out.println("1/ Nhap Thong Tin Sach Tham KHao");
						System.out.println("2/ Xuat Thong tin Sach Tham Khao");
						System.out.println("3/ Tim kiem nha xuat ban");
						System.out.println("4/ Sap xep theo ma sach");
						System.out.println("5/ Tinh tong thanh tien va Tinh trung binh cho cac loai sach");
						System.out.println("6/ Quay lai menu");
						System.out.print("Moi lua chon: \t");
						int luachon2 = in2.nextInt();
						if (luachon2 == 0) 
						{
							System.exit(0);
						}
						else
						{
							switch(luachon2) 
							{
							case 1:
								quanliThuvien.nhap_sach_TK();
								break;
							case 2:
								quanliThuvien.xuat_sach_TK();
								break;
							case 3:
								quanliThuvien.timkiem_theoten(null);
								break;
							case 4:
								quanliThuvien.sapxeptheoma();
								break;
							case 5:
								quanliThuvien.tinhtien();
								break;
							case 6:
								menu();
								break;
							default:
								System.out.println("KHONG CO LUA CHON NAO PHU HOP!");
								break;
							}
						}
					}
				default:
					System.out.println("KHONG CO LUA CHON NAO PHU HOP!");
					break;
				}
			}
		}   
	}
}


