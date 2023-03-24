package OnTapGK;

import java.text.NumberFormat;
import java.util.Locale;

public class CongNhan {
	private String maCN;
	private String mHo;
	private String mTen;
	private int mSoSP;
	public String getMaCN() {
		return maCN;
	}
	public void setMaCN(String ma) throws Exception {
		if(ma!=null) {
			this.maCN=ma;
		}else throw new Exception("ma khong de trong");
	
	}
	public String getmHo() {
		return mHo;
	}
	public void setmHo(String ho) throws Exception {
		if(ho!=null) {
			this.mHo=ho;
		}else throw new Exception("ho khong de trong");
	
	}
	public String getmTen() {
		return mTen;
	}
	public void setmTen(String ten) throws Exception {
		if(ten!=null) {
			this.mTen=ten;
		}else throw new Exception("ten khong de trong");
	
	}
	public int getmSoSP() {
		return mSoSP;
	}
	public void setmSoSP(int so) throws Exception {
		if(so>0) {
			this.mSoSP=so;
		}else throw new Exception("So sp >0");
	}
	public CongNhan() {
		
	}
	public CongNhan(String ma, String ho, String ten, int so) throws Exception {
		if(ma!=null) {
			this.maCN=ma;
		}else throw new Exception("ma khong de trong");
		
		if(ho!=null) {
			this.mHo=ho;
		}else throw new Exception("ho khong de trong");
		
		if(ten!=null) {
			this.mTen=ten;
		}else throw new Exception("ten khong de trong");
		
		if(so>0) {
			this.mSoSP=so;
		}else throw new Exception("So sp >0");
	
	}
	

	@Override
	public String toString() {
		Locale lc = new Locale("vi","VN");
		NumberFormat sf= NumberFormat.getCurrencyInstance(lc);
		String s="";
		s+=String.format("|%10s|%10s|%10s|%10s|",getMaCN(),getmHo(),getmTen(),getmSoSP());
		return s;
	}
	
	
	

}
