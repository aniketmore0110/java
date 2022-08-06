package encapsulation;

public class DataHiding {

	
		private int balance;

		
		public int getBal()
		{
			balance=1000;
			
			return balance;       //it get the value
		}
		
		
		public void SetBal(int a)
		{
			
			System.out.println("setter method");
			
			balance = balance-a;
			
			System.out.println("Updated value:"+balance);    //it update the value
			


	}

}
