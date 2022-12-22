package question2;

public class accountmain {
	
	public static void main(String[] args) {
		account a=new account();		
		a.deposite();			
		try
		{
			a.withdraw();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}