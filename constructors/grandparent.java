 package constructors;

public class grandparent {

	
	 public grandparent() {
             this(100);     // by using this keyword calling one constructor to other constructor in same class but if this class extend 
                            // then by using super keyword it call and zero constructor call by creating object 
                            // for both same class  and if extend 
		    System.out.println("grandparent zero argument running");
		     }
	
	 
	 public grandparent(int a) {

	    System.out.println("grandparent with one argument running");
	    }
	}


