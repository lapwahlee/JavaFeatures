package certification.ocpjavabook;

class Deer {
	public Deer() {}
	public Deer(int age) {}
	protected boolean hasHorns() { return false; }
}

public class Reindeer extends Deer {
	public Reindeer(int age) {}
	public boolean hasHorns() { return true; }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
