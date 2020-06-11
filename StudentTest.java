import java.util.Scanner;
import java.util.ArrayList;

class StudentTest
{
	ArrayList<Student> arrST;
	
	public void inputStudent()
	{
		arrST = new ArrayList();
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap so sinh vien: ");
		n = sc.nextInt();
		if(n > 0)
		{
			for(int i=0;i<=n;i++)
			{
				Student st = new Student();
				st.inputInfo();
				arrST.add(st);
			}
		}
	}
	
	public static void main(String[] args)
	{
		System.out.print("1. Nhap vao n sinh vien.")
		System.out.print("2. Hien thi thong tin tat ca sinh vien ra man hinh.")
		System.out.print("3. Hien thi nhung sinh vien co diem trung binh cao nhat va thap nhat.")
		System.out.print("4. Tim kiem sinh vien theo ma sinh vien.")
		System.out.print("5. Hien thi tat ca sinh vien theo thu tu trong bang chu cai.")
		System.out.print("6. Hien thi tat ca sinh vien duoc hoc bong, sap xep theo thu tu cao xuong thap.")
		System.out.println("7. Thoat.")
		System.out.print("Nhap lua chon cua ban: ");
		
	}
}