package QuanLyTV;

import java.util.Date;
import java.util.Scanner; 

public class sachgiaokhoa extends Sach
{
	
	private static Scanner in = new Scanner(System.in);
	
	private String tinhtrang;
	private int number;
	private double thanhtien;
// GET / SET
	public String get_tinhtrang()					{return tinhtrang;}
	public void set_tinhtrang(String titr) 			{this.tinhtrang = titr;}
	
	public int getNumber() 							{return number;}
    public void setNumber(int number) 				{this.number = number;}
    
    public double getThanhTien() {
    	return thanhtien;
    }
    
    public void setThanhTien(double ttien) {
    	this.thanhtien = ttien;
    }

// Constructors
	public sachgiaokhoa() { super();}
	public sachgiaokhoa(String ms, Date ngnh, float dg, int sl, String nxb, String titr, int number)
	{
		super();
		this.tinhtrang = titr;
		this.number = number;
	}
//hàm nhập tình trạng sách
	public String tinhtrang(int x) 
	{
        switch (number) {
            case 0:
                tinhtrang = "cu";
                break;
            case 1:
                tinhtrang = "moi";
                break;
            default:
                break;
        }
        return tinhtrang;
    }
	public void nhapSach() 
	{
        super.Nhap();
        System.out.print("Nhap tinh trang sach (0 - cu/ 1 - moi): ");
        number = in.nextInt();
    }
	public String toString() {
        return super.toString() + ", tinh trang sach: " + this.tinhtrang(number);
    }
}
