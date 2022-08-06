package constructors;

public class parent extends grandparent {
      public parent() {
    	super();      // inheritance not possible in constructor but parent class constructor has any argument based constructor then
        //we have to call it in child class constructor by using super keyword
	  
  
    	System.out.println("parent zero argument running");
	    
}
}