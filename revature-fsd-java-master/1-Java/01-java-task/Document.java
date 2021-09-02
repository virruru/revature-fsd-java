package aug31;

public class Document 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String accountnumber = "0987654321";
		double balance = 5000.00;
		System.out.println("account number : "+ accountnumber);
		System.out.println("intial balance : "+ balance);
		System.out.println("\n----------------------------");
		System.out.println("Type transection  balance");
		System.out.println("----------------------------");
		/*char type = 'W';
		double transection = 2000.0;
		balance = balance - transection;
		System.out.printf("%3c %12.5f %8.2f \n",type,transection,balance);
		type ='D';
		transection = 5000.0;
		balance = balance + transection;
		System.out.printf("%3c %12.5f %8.2f \n",type,transection,balance);
		type ='W';
		transection = 5000.0;
		balance = balance - transection;
		System.out.printf("%3c %12.5f %8.2f \n",type,transection,balance);
		type ='D';
		transection = 25000.0;
		balance = balance + transection;
		System.out.printf("%3c %12.5f %8.2f \n",type,transection,balance);*/
		
		balance = calculationAmount('W',2000.00,balance);
		balance = calculationAmount('D',5000.00,balance);
		balance = calculationAmount('D',8000.00,balance);
		balance = calculationAmount('W',10000.00,balance);
		System.out.println("----------------------------");
		

	}
	public static double calculationAmount(char type, double transection, double balance)
	{
		if(type=='D')
		{
			balance += transection;
			
		}
		if(type=='W')
		{
			balance -= transection;
		}
		System.out.printf("%3c %12.5f %8.2f \n",type,transection,balance);
		return balance;
	}


}
