import java.util.Scanner;

class Student extends Person
{
	String maSV;
	float diemTB;
	String email;
	
	public boolean setMaSV(String maSV) {
		if(maSV != null && maSV.length() == 8)
		{
			this.maSV = maSV;
			return true;
		}
        else
		{
			System.err.println("Nhap lai ma sinh vien !");
			return false;
		}
    }

    public float getDiemTB() {
        return diemTB;
    }

    public boolean setDiemTB(float diemTB) {
		if(diemTB >= 0 && diemTB <= 10)
		{
			this.diemTB = diemTB;
			return true;
		}
        else
		{
			System.err.println("Nhap lai diem !");
			return false;
		}
    }

    public String getEmail() {
        return email;
    }

    public boolean setEmail(String email) {
		if(email != null && email.contains("@") && !email.contains(" "))
		{
			this.email = email;
			return true;
		}
		else
		{
			System.err.println("Nhap lai dia chi email !");
			return false;
		}
    }
	
	public Student(){};
	
	public void inputInfo()
	{
		super.inputInfo();
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap ma sv: ");
		while(!setMaSV(sc.nextLine()));
		System.out.print("Nhap diem TB: ");
		while(!setDiemTB(sc.nextFloat()));
		System.out.print("Nhap email: ");
		sc.nextLine();
		while(!setEmail(sc.nextLine()));
	}
	
	public void showInfo()
	{
		super.showInfo();
		System.out.print(" - "+maSV+" - "+diemTB+" - "+email);
	}
	
	public boolean isHocBong()
	{
		if(diemTB > 8)
			return true;
		else
			return false;
	}
}