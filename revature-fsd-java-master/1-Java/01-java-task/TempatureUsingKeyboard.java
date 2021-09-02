package aug31;
import java.util.Scanner;
public class TempatureUsingKeyboard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enetr temperature :");
		int fahren = sc.nextInt();
		float cel = (fahren+9/5)+32;
		System.out.println(cel);
	}

}
