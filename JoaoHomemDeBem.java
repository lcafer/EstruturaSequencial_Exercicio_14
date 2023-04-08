package EstruturaSequencial_Exercicio_14;
import java.util.Scanner;

public class JoaoHomemDeBem {
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		float weight = 0.f;
		System.out.println("Insira a quantidade de peso que você trouxe:");
		try {
			weight = userInput.nextFloat();
		} catch (Exception e) {
			weight = Float.parseFloat(userInput.nextLine());
		}
		final float FINE_PER_WEIGHT = 4.0f;
		final float MAX_WEIGHT = 50.0f;
		if(isExcessive(weight)) {
			float finalFine = (weight-MAX_WEIGHT)*FINE_PER_WEIGHT;
			System.out.print("O valor da multa é de: R$ " + finalFine + "\n Você trouxe " + weight + "kg de peixes.");
		}  else {
			System.out.print("Você não tem multa a pagar. Você trouxe " + weight + "kg de peixes");
		}
		userInput.close();
	}
	
	static boolean isExcessive(float weight) {
		return weight > 50 ? true : false;
	}
}
