package aug31;

public class AccountManager {
	private char type;
	private double amount;
	
	public AccountManager(char type, double amount)// constructor
	{
		this.type = type;
		this.amount = amount;
	}
	public void Dispaly(double balance)
	{
		System.out.printf("%3c %12.5f %8.2f \n",type,amount,balance);
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 AccountManager  obj1 = new AccountManager('W',2000);//calling constructor (intializing the varibles)by passing parameters and without passing parameters they are two types of constructors 1.default constrctor, 2.parameterized constructor.
		 obj1.Dispaly(2000);
		

	}

}
