package aug31;
import java.util.Scanner;
public class ShortName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enetr a name :");
		String name = sc.nextLine();
		if(name.length()>=2 || name.length()<6)
		{
			System.out.println("valid name.");
		}
		else
		{
			System.out.println("not a valid name");
		}

	}

}
