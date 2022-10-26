package QuanLyTV;

import java.util.Scanner;

public class sachthamkhao extends Sach 
{
	private static Scanner in = new Scanner(System.in);
	
    private double thue, thanhTien;
    
    public double getThue() 			{return thue;}
    public void setThue(double thue) 	{this.thue = thue;}
    
    public double getThanhTien() {
    	return thanhTien;
    }
    
    public void setThanhTien(double ttien) {
    	this.thanhTien = ttien;
    }
    
    public sachthamkhao() 
    {
        super();
    }
    public sachthamkhao(double thue) 
    {
        super();
        this.thue = thue;
    }
// Nhập
    public void nhapSach() {
        super.Nhap();
        System.out.print("Nhap thue: ");
        thue = in.nextDouble();
    }
     
// Xuất
    public String toString() 
    {
        return super.toString() + ", Thue: " + this.thue;
    }
    
    
	public static int size() {
		// TODO Auto-generated method stub
		return 0;
	}
	public static Object get(int i) {
		// TODO Auto-generated method stub
		return null;
	}
}
