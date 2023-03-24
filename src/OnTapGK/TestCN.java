package OnTapGK;

import java.util.Scanner;

public class TestCN {
	
	
	
	
	public static CongNhan nhap() throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap thong tin cho cong nhan: ");
		System.out.println("Nhap Ma CN:");
		String maCN=sc.nextLine();
		System.out.println("Nhap ho CN:");
		String ho=sc.nextLine();
		System.out.println("Nhap ten CN:");
		String ten = sc.nextLine();
		System.out.println("Nhap so sp: ");
		int so = sc.nextInt();
		CongNhan cn = new CongNhan(maCN, ho, ten, so);
		return cn;
	}
	
	public static void inCN() {
		for(int i=0;i<50;i++) {
			System.out.printf("-");
		}
		System.out.println();
		System.out.printf("|%10s|%10s|%10s|%10s|","Ma","Ho","Ten","SoSP");
		System.out.println();
		for(int i=0;i<50;i++) {
			System.out.printf("-");
		}
		System.out.println();
	}
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap n: ");
		int n= sc.nextInt();
		//them cong nhan vao danh sach 
		ListCN ls = new ListCN(n);
		for(int i=0;i<n;i++) {
			ls.themCN(nhap());
		}
		System.out.println("Ket qua");
		inCN();
		ls.inKQ();
		//Xoa cong nhan theo ma
		System.out.println("Nhap ma cong nhan can xoa");
		String xoa = sc.nextLine();
		ls.delete(xoa);
		ls.inKQ();
		
		//Sap xep cong nhan theo so sp 
		ls.sapXep();
		ls.inKQ();
	}

}
