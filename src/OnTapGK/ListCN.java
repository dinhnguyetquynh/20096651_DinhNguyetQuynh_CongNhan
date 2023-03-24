package OnTapGK;

import java.util.Scanner;

public class ListCN {
	public CongNhan[] ls;
	int count;
	public ListCN(int n) {
		// TODO Auto-generated constructor stub
		ls= new CongNhan[n];
		count =0;
	}
	public boolean themCN(CongNhan cn) {
		for(int i=0;i<count;i++)
			if(cn.getMaCN()==ls[i].getMaCN()) {
				return false;
			}
		ls[count]=cn;
		count++;
		return true;
	}
	
	public void inKQ() {
		for (CongNhan cn : ls) {
			if(cn!=null)
				System.out.println(cn);
		}
	}
	
	public void tangKT() {
		if(ls.length==count) {
			CongNhan [] tam =null;
			System.arraycopy(ls, 0, tam, 0, count);
			ls=tam;
		}
	}
	
	public void sapXep() {
		for(int i=0;i<count-1;i++) {
			for(int j=i+1;j<count;j++) {
				CongNhan tam = null;
				if(ls[i].getmSoSP()>ls[j].getmSoSP()) {
					tam=ls[i];
					ls[i]=ls[j];
					ls[j]=tam;
				}
			}
		}
      }
	
	public int findCNbyMaCN(String ma) {
		int vt=-1;
		for(int i=0;i<ls.length;i++)
			if(ls[i].getMaCN().equalsIgnoreCase(ma))
				return i;
		return -1;
	}
	
	
	public boolean delete(String maCN) {
		int vt= findCNbyMaCN(maCN);
		if(vt==-1)
		return false;
		for(int i=vt;i<ls.length-1;i++)
			ls[i]=ls[i+1];
		return true;
	}
	
	
}