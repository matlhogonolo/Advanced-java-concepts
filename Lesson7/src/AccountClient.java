
public class AccountClient {

	public static void main(String[] args) {
		
		Account ac=new Account();
		
		System.out.println(balancenotify(ac.getBalance()));

	}

	public static String balancenotify(double balance) 
	{
		String result ="";
		double threshold = 5000;
		
		if (balance < threshold) 
		{
			result = "balance of " + balance +
					" is identified as low balance";
		}else 
		{
			result = "balance of " + balance +
					" is identified as high balance"; 
		}
		return result;
		
	}
}
