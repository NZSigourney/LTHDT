package DoiTuongOOC;
	
import java.util.Date;
import java.util.Scanner;
	
public class GiangVien extends Connguoi {
// khai bao thuoc tinh rieng
	private String Magv;
	private float Diemcc;
		
	public static Scanner input = new Scanner(System.in);
		
		
	public String get_Magv() {
		return this.Magv;
	}
		
	public void set_Magv(String ma) {
		this.Magv = ma;
	}
		
	public float get_Diemcc() {
		return this.Diemcc;
	}
		
	public void set_Diemcc(Float diem) {
			this.Diemcc = diem;
	}
		
	public GiangVien()
	{
		super();
	}
		
		
	public GiangVien(String ht, Date ns, String cm, String gt,String ma, float diem )
	{
		super(ht, ns, cm, gt);
		this.Magv = ma;
	}
		
	public void nhap() 
	{
		super.Nhap();
		System.out.print("Ma gv:\t");
		this.Magv = input.nextLine(); 
		System.out.print("Diem Cham cong:\t");
		this.Diemcc = input.nextFloat();
	}
	
	
	public void xuat() {
		super.xuat();
		System.out.println("\nMa gv:\t" + this.Magv);
		System.out.println("Diem Cham Cong:\t" + this.Diemcc);
	}
}