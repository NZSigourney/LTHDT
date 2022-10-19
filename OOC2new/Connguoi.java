package OOC2new;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.*;

public class Connguoi
{//khai báo thuộc tính
	
	private static Scanner in = new Scanner(System.in);
	
	private String hoten;
	private Date ngaysinh;
	private String gioitinh;
	private String CMND;
//Xây dựng pthuc set/get	
	public String get_hoten() {return hoten;}
	public void set_hoten(String ht){this.hoten = ht;}
	
	public Date get_ngaysinh() {return ngaysinh;}
	public void set_ngaysinh(Date ns) {this.ngaysinh = ns;}
	
	public String get_gioitinh() {return gioitinh;}
	public void set_gioitinh(String gt){this.gioitinh = gt;}
	
	public String get_CMND() {return CMND;}
	public void set_CMND(String cmnd){this.CMND = cmnd;}
//xây dựng hàm dựng, hàm tạo( contructor)
	public Connguoi() {}
	public Connguoi(String ht, Date ns,String gt, String cmnd)
	{
		this.hoten = ht; this.ngaysinh = ns; 
		this.gioitinh = gt; this.CMND = cmnd;
	}
// xây  dựng phương thức nhập xuất
	public void nhap() 
	{
		System.out.print("Ho ten:\s");
		this.hoten = in.nextLine();
		
		System.out.print("Gioi tinh:\s");
		this.gioitinh = in.nextLine();
		
		do {
		System.out.print("CMND:\s");
		this.CMND = in.nextLine();
		}while(this.CMND.length()!=11);
		
		String ngay;
		boolean ok;
		do {
			ok =true;
			System.out.print("Ngay sinh:\s");
			ngay = in.nextLine();
		try {
		this.ngaysinh = new SimpleDateFormat("dd/MM/yyyy").parse(ngay);
		} catch(Exception e){ok = false;};
		}while (!ok);
		in.nextLine();
	}
	
// xây  dựng phương thức xuất	

	@SuppressWarnings("deprecation")
	public void xuat() 
	{
		int ngay = this.ngaysinh.getDate();
		int thang = this.ngaysinh.getMonth() +1;
		int nam = this.ngaysinh.getYear();
		if(nam == 100)	
		{
			nam = 2000;
		}
		
		System.out.print("\s" + this.hoten+" \t");
		System.out.print("	\s"+ ngay+"/"+thang+"/"+ nam+" ");
		System.out.print("	\s"+this.gioitinh+"	");		
		System.out.print("	\s"+this.CMND+" \s");
 
	}
	}

