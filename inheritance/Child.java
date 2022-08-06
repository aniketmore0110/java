package inheritance;

public class Child extends Parent{
 
	public void college()
	{
		
		System.out.println("college is running");
	}
	
	
	
	
	
	public static void main(String[] args) {
		
		
		Child c = new Child();           //     child c=        refrence veriable of child class
		                                 //     new child =     object of child class 
		System.out.println(c.a);         //      calling of non static variable 
		
		c.car();
		
		c.bike();
		
		c.home();
		
		c.college();
		
	}

}
