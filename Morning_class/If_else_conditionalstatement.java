package Morning_class;

public class If_else_conditionalstatement {

	public static void main(String[] args) {
	  
		
		//Operators
		
        //a. > Greater than operator
		//b. < Less than operator
		//c. >= Greater than or equal to operator
		//d. <= Less than and or equal to operator
		//e. == equal to operator
		
		
		// use of if and else
		
//		if(condition)
//		{ 
//			
//			//Actions to be perform
//			
//		}
		
//	else
//	{
//		//Actions
//	}

 int a =20;
 int b =20;
 int c =50;
 
 if(a==b)
	 
 {
	 System.out.println("a and b are equals");
	 
 }

 else
 {
	 
	 System.out.println("a and b are not equals");

 }

 if (a>c)
 {
	 
	 System.out.println("a is greater than c");
 }

 else
 {
	 System.out.println("c is greater than a");

	 
 }
 
// Logical operator
	
// a. !  NOT

// b. && AND
 
// c. || OR

 
 int i =30;
 int j =30;
 int k = 40;
 int l=34;
 
 if ((i==j)&&(k>l)) 
 {
	 
	 System.out.println("if is running");
 }
 
 else 
 {
	System.out.println("else is running");

 
   }

 if (!((i==j)&&(k>l))) 

 {
	 
	 System.out.println("if is running");	 
 }

 else 
 {
	System.out.println("Else is running"); 
	 
 }

 if ((i==j)||(k<l)) 
 
 {
	 System.out.println("or condition is running");
 }

 
 else 
 {
	
	 System.out.println("else is running");
 

 }

 
 
    //nested if else condition
 
 if(i>j)
 {
	 
	 System.out.println("i is greater than j");

  }
 
 else if (k<l)
	 
 { 
	 System.out.println("k is less than l");
 }
 
 else if (i==j)
 {
	 System.out.println("Else if is running");
	 
 }
 


 else
 {
	 System.out.println("else is running");
 }
 
}


}


