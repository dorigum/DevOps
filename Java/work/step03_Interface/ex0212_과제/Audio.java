package ex0212_과제;

public class Audio extends Elec implements ElecFunction {
	private int volumn;
	
	public Audio() { }

	public Audio(String code, int cost, int volumn) {
		super(code, cost);
	
		this.volumn = volumn;
	}	
	// ----------------------------------------------------
	@Override
	public void start() {
		System.out.println(super.getCode());
	}
	@Override
	public void stop() { }
	@Override
	public void display() { }
	
	// ----------------------------------------------------
	@Override
	public String toString() {
		
		return super.toString() + " " + volumn;
	}
	
	// ----------------------------------------------------
	public int getVolumn() {
		return volumn;
	}

	public void setVolumn(int volumn) {
		this.volumn = volumn;
	}
}
