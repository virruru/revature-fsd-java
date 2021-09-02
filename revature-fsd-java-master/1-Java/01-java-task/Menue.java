package aug31;
import java.util.Scanner;

public class Menue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("  Menue  ");
		System.out.println("============");
		System.out.println("1. Balance enquery");
		System.out.println("2. Recharge");
		System.out.println("3. Change Caller Tune");
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose an option: ");
		int option = sc.nextInt();
		switch(option)
		{
		case 1:
			System.out.println("Balance enquery");
			break;
		case 2:
			System.out.println("Recharge");
			break;
		case 3:
			System.out.println("Change Caller Tune");
			break;
		}
		
		

	}

}
