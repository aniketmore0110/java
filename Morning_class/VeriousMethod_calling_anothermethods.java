package Morning_class;

public class VeriousMethod_calling_anothermethods {

	public static void main(String[] args) {
		                    //3

	// calling static method in static method
		m1(); 
		
		
		//calling static method in static from another class
		// class_name.method_name();
			
		VeriousMethod_calling_anothermethods222.m4(); //calling static method in static from another class
		
		
		
		//calling non static method in static method
			
		VeriousMethod_calling_anothermethods ref = new VeriousMethod_calling_anothermethods(); //classname referenceVriable = new Calssname();
			   
			ref.m3();  //referenceVriable.methodname();
			
			ref.m6();   //referenceVriable.methodname();
			
		
			//calling non static method in static method from other class
			VeriousMethod_calling_anothermethods222 ref1 = new VeriousMethod_calling_anothermethods222();
			
			ref1.m5();
			
			
			
			
			
		
		}

	     public static void m1() 
	     {
	    	System.out.println("Static method m1 is running");
	     } 


	     public static void m2() 
	     {
	    	 m1();
	    	System.out.println("Static method m2 is running");
	     } 
		
		 public void m3() 
		 {
			 m1();  // calling static method in non static method
			 
			 VeriousMethod_calling_anothermethods222.m4(); //calling static method in non static from another class
				
			 
			 System.out.println(" Non Static method m3 is running");

		 }

		 
		 public void m6() 
		 {
	 // calling non static method in non static method in same same class
			 
		 m3();
			 
			 
		 // calling non static method in non static method from another class
		 
		 VeriousMethod_calling_anothermethods222 ref3 = new VeriousMethod_calling_anothermethods222();
		 
		      ref3.m5();
			 
			 System.out.println(" Non Static method m6 is running");

			
			 
		 }
	}


