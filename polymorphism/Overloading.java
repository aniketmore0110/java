package polymorphism;

public class Overloading {
 
	
public void m1()
	
	{
		System.out.println("zero arguments method is running");
		
	}
	
	public void m1(int a)
	{
		System.out.println("integer  argument method is running");	
	}
	
    public void m1(int a , float b)
	{
		System.out.println("int and float arguments method is running");	
	}
	
	public void m1(float a, int b)
	
	{
		System.out.println("float and int arguments method is running");
	}
	
	
	public int m1(double a)
	{
		System.out.println("method with int type return");
		
		return 13;
	}
	
	public float m1(String s)
	{
		
		System.out.println("method with float type return");
		
		return 12.56f;
	}
	
	public static void m1(int a, String b)
	
    {
		
		System.out.println("static method is running");
		
		
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		
		Overloading t = new Overloading();
		
		t.m1();
		
	    t.m1(45);

	    t.m1(23, 12.4f);
	    
	    t.m1(34.5f,34 );
	    
	    t.m1(45d);
	    
	    t.m1("abc");
	    
	    System.out.println();
	    
	
	    
	    m1(12,"abc");
	    
	    
	    
	   
	}

}
