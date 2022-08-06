package Morning_class;

public class Variables_injava {
	                     //4
	 
	   static int a=45; //static variable or class variable
	
	   int b=34;  // non static variable or instance variable   
	   
	
	   
	   public static void main(String[] args) {
		  
		   a=20;          // calling static variable in static method

		   
		  // Static variable’s value doesn’t change with respect to objects.
		   
       Variables_injava var = new Variables_injava(); 
		
	  System.out.println("value of a from reference variable var="+var.a);  //with ref variable var
		  
		  Variables_injava var1 = new Variables_injava();
		  
	    System.out.println("value of a from reference variable var1="+var1.a); //with ref variable var1

	    Variables_injava var2 = new Variables_injava();

		  System.out.println("value of a from reference variable var2="+var2.a); //with ref variable var2

	      
		  
		  System.out.println("..................");
	         
			 
	          
	          
	         var.b=56;   // calling non static variable in static method
		       
		      
		   System.out.println("value of b  from referrence variable var="+var.b);
		       
		   System.out.println("value of b from referrence variable var1="+var1.b);
		   
		   System.out.println("value of b from referrence variable var1="+var2.b);
		  
		   System.out.println(".................");
		
	        m1();
	        var.m2();      
	       }
	   
	    public static void  m1()
	  
	    
	    {
		 
   	   
		 int d =67;  //local variable
		   
  	  System.out.println("value of local variable d="+d);
	   
	   }
	
	  
	   
	   public void m2()
	  
	   {
		   int b =50; //local variable
		   
		   System.out.println("value of local varible b ="+b);  
		   
		// to access the global non static variable in the non static area we can use this keyword.
		   
		   System.out.println("value of Global non static varible b ="+this.b);
		   

          System.out.println(a); //calling static varible inside non  static method
	 	   
		  System.out.println(b); //calling non static varible inside non static method
	   }
	   
	  

}

