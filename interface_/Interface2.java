package interface_;

public interface Interface2 {

    public void m5();
	
	public void m6();
	
	public void m7();
	
	public static void m8()
	{
		System.out.println("static method of Interface2");
		
	}
	
	
	public static void main(String[] args) {
		
	
		
		System.out.println(Interface1.a);                // calling veriable (All the variables inside interface are by default
		                                                 //  public  static and final whether we declare it or not)
		 m8();
		
		 Interface1.m4();

}
}