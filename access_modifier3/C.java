package access_modifier3;

import access_modifier2.A;

       public class C extends A {

		public static void main(String[] args) {
			
			//A a = new A();
			
			//a.m1();

			
			// to call protected method outside package, we have to call through child reference
			
			
			C c = new C();
			
			c.m1();
			c.m2();
			
		}
		

}
