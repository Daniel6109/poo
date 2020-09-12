import java.util.Scanner;
import java.util.Random;

public class Math {

	private int puntos;
	private int resultado;
	private String[] nivel_1 = new String[2];
	Scanner sc = new Scanner(System.in);
	private Random rand = new Random();

	public void nivel_facil() {
		System.out.println(":: NIVEL FACIL ::");

		nivel_1[0] = "+";
		nivel_1[1] = "-";
		int random;
		int random_1;
		int random_2;
		int answer;
		for (int i = 0; i < 5; i++) {

			random = rand.nextInt(2);
			random_1 = rand.nextInt(100);
			random_2 = rand.nextInt(100);

			System.out.println(random_1 + nivel_1[random] + random_2 + "= ");

			int respuesta = sc.nextInt();

			if (nivel_1[random] == "+") {
				answer = random_1 + random_2;
				if (respuesta == answer) {
					puntos++;
				}
			} else if (nivel_1[random] == "-") {
				answer = random_1 - random_2;
				if (respuesta == answer) {
					puntos++;
				}
			}
		}

		System.out.println("Su resultado es " + puntos);
	}

}