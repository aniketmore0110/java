package access_modifier2;

public class B extends A {
 
public static void main(String[] args) {
		
		A a = new A();    // protected method call through package and if outside package then call through child ref variable
		
		a.m1();
		
		a.m2();
		
		
	}

}
