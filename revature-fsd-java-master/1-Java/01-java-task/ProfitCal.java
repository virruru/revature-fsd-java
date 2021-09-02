package aug31;
import java.util.Scanner;
public class ProfitCal 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println(" enter the cost price: ");
		int x = sc.nextInt();
		System.out.println("selling price :");
		int y = sc.nextInt();
		Profit(x,y);
	
		
		

	}
	public static double Profit(int costprice,int sellingprice)
	{
		int profit = sellingprice - costprice;
		System.out.println(profit);
		return profit;
	}

}

