package Student;

public class Student {
	public String name;
	public double n1, n2, n3;
	
	public double media() {
		return n1 + n2 + n3;
	}
	
	public String toString() {
		if(n1+n2+n3 > 60) {
			
			return "PASS";
		}else {
			return "FAILED : need " + (60-(n1+n2+n3)) + " points for pass";
		}
		
		
	}
}
