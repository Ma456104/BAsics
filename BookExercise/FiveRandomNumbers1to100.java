package BookExercise;

public class FiveRandomNumbers1to100 {
public static void main(String[] args) {

	
	for (int i = 1; i <= 5; i++) {
	System.out.println(i + "  "+Math.round(Math.random()*100));	
	}
}
}
