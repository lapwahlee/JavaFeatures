package certification.ocpjavabook;

import java.io.FileNotFoundException;
import java.util.ArrayList;

interface CanSwim{}
class Amphibian implements CanSwim {}
abstract class Tadpole extends Amphibian {}

public class AssessmentTests1PartI {

	public void Q10() {
		var tadpoles = new ArrayList<Tadpole>();
		for(Amphibian amphibian : tadpoles) {
			CanSwim tadpole = amphibian;
			Amphibian tadpole2 = amphibian;
			Tadpole tadpole3 = (Tadpole)amphibian;
			Object tadpole4 = amphibian; 
		}		
	}

	public void Q11() {
		//int monday = 3 + 2.0;
		double tuesday = 5_6L;
		//boolean wednesday = 1 > 2 ? |true;
		short thursday = (short)Integer.MAX_VALUE;
		//long friday = 8.0L;
		//var saturday = 2_.0;	
	}

	public void Q13() {
		var x = 5;
		var j = 0;
		
		OUTER: for (var i=0;i<3;)
			INNER: do {
				i++;
				x++;
				if ( x>10) break INNER;
				x+=4;
				j++;
			} while (j <= 2);
		System.out.println(x);
	}
	
	public void Q14() {
//		System.out.println("a");
//		try (StringBuilder reader = new StringBuilder()) {
//			System.out.println("b");
//			throw new IllegalArgumentException();
//		} catch(Exception e || RuntimeException r ) {
//			System.out.print("c");
//			throw new FileNotFoundException();
//		} finally {
//			System.out.println("d");
//		}		
	}
	
	public void Q16() {
		
	}

	public static void main(String[] args) {
		
	}
}
