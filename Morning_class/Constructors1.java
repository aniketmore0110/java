package Morning_class;

public class Constructors1 {

       public Constructors1() 
		
		{
      
		 this(200);            // calling one argument constructor into zero argument constructor by this method in same class
		                       // for other class  zero automatically run but one argument rut by super keyword
		
			
			System.out.println("Zero Arguments constructor is running");
			
			
		}
		
		public Constructors1(int a)
		{
			this(13,"aniket");     // calling two argument constructor into one argument constructor by this method in same class
           
			
			System.out.println("One argument constructor is running");
			
		}
		
		
		public Constructors1(int b, String s)
		{
			
			System.out.println("Two arguments constructor is running");
			
		}
		
		public static void main(String[] args) {
			
			Constructors1 con = new Constructors1();    //object for zero argument-call zero constructor- in first line this(200)so it goes one 
			// argument constructor method-first line in 1 constrctor method this(13,"aniket") so it goes two argument constrctor method and print so
			// now completion of this(13,"aniket") in one argument now syso one and then zero print
			
		    Constructors1 con1 = new Constructors1(100);
			
			Constructors1 con2 = new Constructors1(12,"Nanded");

			

			
			
		}


	}


