 package polymorphism_overriding;

public class Child extends Parent {

	int a =56;
	 
	public void m1()
	{
		
		System.out.println("Child's class m1 method");

	}
	

	public void m2(int a) 
	{
		  System.out.println("Child's class m2 method");

		
	}
	
	public static void m3()
	{
	
      System.out.println("static method from child");	
	}
	
	public static void main(String[] args) {
		
		
		 
	 Child c = new Child();
	
	 
	   System.out.println(c.a);
	 
	     m3();
	   
	    c.m1();
		
		c.m2(45);
		
	System.out.println("*****************************");
		
		Parent p = new Parent();
	
		
		System.out.println(p.a);
		
		
		
		p.m1();// parent method
		
		p.m2(23); // parent method
		
		
   System.out.println("*****************************");
		
		Parent p1 = new Child();              //Note- in this static method calling on basis of refrence variable i.e p1 & 
		                                      //non static calling on basis of object i.e Child
		
		
		System.out.println(p1.a);             // calling on basis of refrence veriable
		
		 p1.m3();                             // static method calling on basis of refrence veriable 
		
		p1.m1(); // Child method              // non static method calling on basis of object
		
		p1.m2(234);//Child method
		
       // Child c1 = new Parent(); // invalid in java 
	
	}
	
	

}
