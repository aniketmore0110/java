package Morning_class;

public class Constructors {


		public Constructors()   // if apply return type then shows compile type error
		
		{
		
			System.out.println("Zero Arguments constructor is running");
			
		}
		
		public Constructors(int a)
		{
		
			System.out.println("One argument constructor is running");
			
		}
		
		
		public Constructors(int b, String s)
		{
			
			System.out.println("Two arguments constructor is running");
			
		}
		
		public static void main(String[] args) {
			
			Constructors con = new Constructors();
			
			Constructors con1 = new Constructors(100);
			
			Constructors con2 = new Constructors(12,"Nanded");



	}

}
