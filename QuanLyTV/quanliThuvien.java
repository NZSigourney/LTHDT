package QuanLyTV;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
import java.util.Comparator;

public class quanliThuvien 
{
	
	private static Scanner in = new Scanner(System.in);
	
//nhập thông tin sách giáo khoa
	static ArrayList<sachgiaokhoa> sachgiaokhoa = new ArrayList<>();
	
	public static void nhap_sach_GK() 
	{
		//
		int sosach_gk;
		System.out.print("Nhap so sach Giao khoa \t");
		sosach_gk = Integer.parseInt(in.nextLine());
		System.out.println("* Nhap thong tin sach giao khoa ");
		for(int i = 0; i < sosach_gk; i++) 
		{
			System.out.println("Nhap sach thu " + (i+1) + ":");
			sachgiaokhoa GK = new sachgiaokhoa();
			GK.nhapSach();
			sachgiaokhoa.add(GK);
		}
	}
	
//xuất thông tin sách giáo khoa	
	public static void xuat_sach_GK() 
	{
		System.out.println("Xuat cac sach giao khoa trong thu vien: ");
		for(int i = 0; i < sachgiaokhoa.size(); i++) 
		{
			System.out.print("Ma Sach \t||\t Ngay Nhap \t||\t Don Gia \t||\t So Luong \t||\t Nha Xuat Ban \t||\t Tinh Trang |");
			System.out.println(sachgiaokhoa.get(i).toString());
		}
	}
	
//nhập thông tin sách tham khảo
	static ArrayList<sachthamkhao> sachthamkhao = new ArrayList<>();
	public static void nhap_sach_TK() 
	{
		
		int sosach_tk;
		System.out.print("Nhap So Sach Tham Khao: \t");
		sosach_tk = Integer.parseInt(in.nextLine());
		System.out.println("* Nhap thong tin sach tham khao ");
		for(int i = 0; i < sosach_tk; i++) 
		{
			System.out.println("Nhap sach thu " + (i+1) + ":");
			sachthamkhao TK = new sachthamkhao();
			TK.nhapSach();
			sachthamkhao.add(TK);
		}
	}
	
//xuất thông tin sách tham khảo
	public static void xuat_sach_TK() 
	{
		System.out.println("Xuat cac sach tham khao trong thu vien:: ");
		for(int i = 0; i < sachthamkhao.size(); i++) 
		{
			System.out.print("Ma Sach \t||\t Ngay Nhap \t||\t Don Gia \t||\t So Luong \t||\t Nha Xuat Ban \t||\t Thue |");
			System.out.println(sachthamkhao.get(i).toString());
		}
	}
//sắp xếp theo mã sách	
	public static void sapxeptheoma() 
	{
		
	// sách giáo khoa
		Collections.sort(sachgiaokhoa, new Comparator<sachgiaokhoa>() 
		{	
			public int compare(sachgiaokhoa o1, sachgiaokhoa o2) 
			{
				// TODO Auto-generated method stub
				return o1.get_masach().compareTo(o2.get_masach());
			}	
		});
		System.out.println("Sau khi sap xep: \n");
		for(sachgiaokhoa o: sachgiaokhoa) 
		{
			System.out.println(o.toString());
		}
		
	// sách tham khảo
		Collections.sort(sachthamkhao, new Comparator<sachthamkhao>() 
		{	
			public int compare(sachthamkhao o1, sachthamkhao o2) 
			{
				// TODO Auto-generated method stub
				return o1.get_masach().compareTo(o2.get_masach());
			}	
		});
		System.out.println("Sau khi sap xep: \n");
		for(sachthamkhao o: sachthamkhao) 
		{
			System.out.println(o.toString());
		}
	}
// tổng thành tiền cho các loại sách
	static ArrayList<sachgiaokhoa> arrsachgiaokhoa = new ArrayList<>();
    static ArrayList<sachthamkhao> arrsachthamkhao = new ArrayList<>();
    

	@SuppressWarnings("unused")
	public static void tinhtien() 
    {
	    int soSachGiaoKhoa, soSachThamKhao;
	    double tongTienSachGiaoKhoa = 0, tongTienSachThamKhao = 0, tongDonGiaSachThamKhao = 0, trungBinhCongDonGia = 0, tb = 0;
	// Tổng tiền và tổng trung bình sách giáo khoa
		for (int i1 = 0; i1 < arrsachgiaokhoa.size(); i1++) 
		{
	        if (arrsachgiaokhoa.get(i1).getNumber() == 0) 
	        {
	            tongTienSachGiaoKhoa += arrsachgiaokhoa.get(i1).get_soluong() * arrsachgiaokhoa.get(i1).get_dongia() * 50 / 100;
	        } 
	        else if (arrsachgiaokhoa.get(i1).getNumber() == 1) 
	        {
	            tongTienSachGiaoKhoa += arrsachgiaokhoa.get(i1).get_soluong() * arrsachgiaokhoa.get(i1).get_dongia();
	        }
	    }
		tb = tongTienSachGiaoKhoa/sachgiaokhoa.size();
	    System.out.print("Tong trung binh sach giao khoa la: " + tb);
	    System.out.println("\nTong Tien sach giao khoa = " + tongTienSachGiaoKhoa);
	// Tổng tiền và tổng trung bình sách tham khảo
	    for (int i = 0; i < arrsachthamkhao.size(); i++) 
	    {
	        tongTienSachThamKhao += arrsachthamkhao.get(i).get_soluong() * arrsachthamkhao.get(i).get_dongia() + arrsachthamkhao.get(i).getThue();
	    }
	    System.out.println("Tong tien sach tham khao = " + tongTienSachThamKhao);
	    tb = tongTienSachThamKhao/sachthamkhao.size();
	    System.out.print("\nTong trung binh sach tham khao la: " + tb);
	}
    
//tìm kiếm theo tên nhà xuất bản	
  	public static void timkiem_theoten(String nhaxuatban) 
  	{
  		System.out.print("Nhap ten nha xuat ban can tim: \t");
  		String ten = in.nextLine();
  	// sách giáo khoa
  		sachgiaokhoa Found = null ;
  		for (sachgiaokhoa o : sachgiaokhoa) 
  		{
  			if (o.get_nhaxuatban().equalsIgnoreCase(ten)) 
  			{
  				Found = o;
  				break;
  			}
  		}
  		if(Found != null) 
  		{
  			System.out.print("Ten nha xuat ban can tim kiem: \t" + Found.toString());
  		}
  		else 
  		{
  			System.err.println("!!!!! Khong tim thay ten nha xuat ban !!!!!");
  		}
  		
  	// sách tham khảo		
  		sachthamkhao Found1 = null ;
  		for (sachthamkhao o : sachthamkhao) 
  		{
  			if (o.get_nhaxuatban().equalsIgnoreCase(ten)) 
  			{
  				Found1 = o;
  				break;
  			}
  		}
  		if(Found1 != null) 
  		{
  			System.out.print("Ten nha xuat ban can tim kiem: \t" + Found1.toString());
  		}
  		else 
  		{
  			System.out.println("!!!!! Khong tim thay ten nha xuat ban !!!!!");
  		}
  	}
}