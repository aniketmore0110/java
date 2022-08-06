package interface_;

public interface Interface1 {

    int a =45;

   public static final int b=50;                                 //All the variables inside interface are by default public  
	                                                             //static and final whether we declare it or not.
	 
       void m1();
	
	   public void m2();
	
	   public abstract void m3();

         // all the non static methods in interface are same 
	
	public static void m4()
	{
		System.out.println("static method of interface1");
		
	}

}
