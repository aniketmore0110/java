     package inheritance_discussion;

     import inheritance.Child;

     public class Child1 extends Parent1{

    	 int i=200;
  	   
  	     int y=45;

	       public void college()
	       {
	    	   int y=56;
	   		
	   		System.out.println(y);//local variable
	   		
	   		System.out.println(this.y); // this is global non  static variable
	   		
	   		System.out.println(i); // this i refers to child class variable
	   		
	   		System.out.println(super.i);//this i refers to parent class variable

		    System.out.println("college is running");
	       }
	
	
	
	
	
	 public static void main(String[] args) {
		
		
		Child1 c = new Child1();           //     child c=        refrence veriable of child class
		                      
		                                   //     new child =     object of child class 
		
		c.college();
		System.out.println(c.a);       //      calling of non static variable 
		
		c.car();
		
		c.bike();
		
		c.home();
		
		c.farm();
		
		System.out.println(c.p);
	}


}
