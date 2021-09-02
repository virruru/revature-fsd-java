package aug31;

public class calulateAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float total = 0.0f;
		float[] scores = {12,15,22,87};
		for (int i = 0; i < scores.length; i++) {
			total += scores[i];
			
		}
		
		System.out.println("average = " + total/scores.length);

	}

}
