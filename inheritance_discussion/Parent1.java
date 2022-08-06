package inheritance_discussion;

public class Parent1 extends GrandParent {

	    int a=23;
	 
	    int i =100;
	    
	    public void car()
		{
			System.out.println("car is running");
			
		
		}
		
		public void home()
		{
			
			System.out.println("home is running");
		}
		
		
		public void bike()
		{
			
			System.out.println("bike is running");
			
		}
		
       

	   public static void main(String[] args) {
		
		   Parent1 p = new Parent1();
			 
			 p.farm();                    // calling of Grandparents method with parents refrence variable
			 
}
}