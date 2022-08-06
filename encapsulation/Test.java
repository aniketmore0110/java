package encapsulation;

public class Test {
 
	public static void main(String[] args) {
		
		DataHiding hd = new DataHiding();
		
		int bal = hd.getBal();
		
		System.out.println(bal);
		
	      hd.SetBal(100);
		
	}
}