package ex0212_과제;

public class Tv extends Elec {
	private int chnnel;
	
	public Tv() { }
	
	public Tv(String code, int cost, int chnnel) { 
		super(code, cost);
		
		this.chnnel = chnnel;
	}

	@Override
	public String toString() {
		
		return super.toString() + " " + chnnel;
	}

	// -----------------------------------------------
	// getter, setter 추가
	public int getChnnel() {
		return chnnel;
	}

	public void setChnnel(int chnnel) {
		this.chnnel = chnnel;
	}
}
