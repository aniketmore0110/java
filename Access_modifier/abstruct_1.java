package Access_modifier;

abstract public class abstruct_1 {
    
	public abstruct_1()
	{
		System.out.println("constuctor is running");
	}
	
	public void m1()
	
	{
		System.out.println("m1 method from abstruct_1");	
	}
	
   final void m2()
	
	{
		System.out.println("m2 method from abstruct_1");
	}

   abstract public void m3();
   
   abstract public void m4();

public static void main(String[] args) {
	
	//abstruct_1 t = new abstruct_1();
	// we can not cteate object of abstract class
}
   
}


