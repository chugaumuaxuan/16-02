package AccessModifier;

public class test {

	public String name;	
	
	public test() {}

	public void displayPublic() {
		System.out.println("day la public access");
	}
	
	private void displayPrivate() {
		System.out.println("day la private access");
	}
	
	protected void displayProtected() {
		System.out.println("day la protected access");
	}
	
	 void displayDefault() {
		System.out.println("day la default");
	}
		
	public test(String name) {
		this.name = name;
	}
}

   class test2{
	   
		protected class test5{
			public void displayPrivateClass(){
				System.out.println("day la private class");
			}
		}
	 
		public static void main(String[] args) {
				
			test t = new test();
			t.displayPublic();
//			t.displayPrivate();
			t.displayProtected();
			t.displayDefault();		
			
			t.name= " ";
	
		}
}
  



	
