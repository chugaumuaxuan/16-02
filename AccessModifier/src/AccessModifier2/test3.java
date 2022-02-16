package AccessModifier2;
import AccessModifier.*;

public class test3 extends test {

	public static void main(String[] args) {	
		
		test3 t3 = new test3();
		t3.name = "0";
		t3.displayProtected();
		
		test t1 = new test();
		t1.name = " ";
		t1.displayPublic();		
	}	
	
}


		

