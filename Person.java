import java.util.Scanner;

class Person
{
	String ten;
	String gioiTinh;
	String ngaySinh;
	String diaChi;
	
	public String getTen()
	{
		return ten;
	}
	
	public void setTen(String ten)
	{
		this.ten = ten;
	}
	
	public String getGioiTinh()
	{
		return gioiTinh;
	}
	
	public void setGioiTinh(String gioiTinh)
	{
		this.gioiTinh = gioiTinh;
	}
	
	public String getNgaySinh()
	{
		return ngaySinh;
	}
	
	public void setNgaySinh(String ngaySinh)
	{
		this.ngaySinh = ngaySinh;
	}
	
	public String getDiaChi()
	{
		return diaChi;
	}
	
	public void setDiaChi(String diaChi)
	{
		this.diaChi = diaChi;
	}
	
	public Person(){};
	
	public Person(String ten, String gioiTinh, String ngaySinh, String diaChi)
	{
		this.ten = ten;
		this.gioiTinh = gioiTinh;
		this.ngaySinh = ngaySinh;
		this.diaChi = diaChi;
	}
	
	public void inputInfo()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap ten: ");
		ten = sc.nextLine();
		System.out.print("Nhap gioi tinh: ");
		gioiTinh = sc.nextLine();
		System.out.print("Nhap ngay sinh: ");
		ngaySinh = sc.nextLine();
		System.out.print("Nhap dia chi: ");
		diaChi = sc.nextLine();
	}
	
	public void showInfo()
	{
		System.out.print(ten+" - "+gioiTinh+" - "+ngaySinh+" - "+diaChi);
	}
}