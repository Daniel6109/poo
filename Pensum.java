//Autor: Carlos Daniel Estrada Vega
//Carnet: 20853
//mostrar pensum de curso
import java.util.Scanner;

class Pensum{

	Mate mate;

	public Pensum () {
    mate = new Mate();
	}

	public void mostrarPensum () {
		Scanner scan = new Scanner(System.in);
		
		int opcion = 0;
		boolean repetir = true;
		while (repetir == true){
			//mensaje de bienvenida
			System.out.println("Bienvenido a la plataforma");
	
			System.out.println("CURSOS DISPONIBLES:");
			System.out.println(" ");
			System.out.println("1. Matemática");
			System.out.println("2. Comunicación y Lenguaje");
			System.out.println("3. ¿Desea realizar un pequeño quiz de matemática?");
			System.out.println("4. Salir");
			System.out.println(" ");
			System.out.println("Elija ");
			opcion = scan.nextInt();
			scan.nextLine();
			
			if (opcion == 1){
				//aquí iran los subtemas de matemática
        mate.nivel_facil();
				
			} else if (opcion == 2){
				//aqui iran los suntemas de comunicación y lenguaje ñ

			} else if (opcion == 3){
				//variables
				int correctas = 0;
				int falsas = 0;
				int p1 = 0;
				int p2 = 0;
				int p3 = 0;
				int p4 = 0;
				int p5 = 0;
				
				//pregunta 1
				System.out.println("PREGUNTA 1:");
				System.out.println("¿Cuántos minutos hay en 4,5 horas?");
				System.out.println("1) 450");
				System.out.println("2) 270");
				System.out.println("3) 240");
				p1 = scan.nextInt();
				scan.nextLine();
				if (p1 == 1){
					falsas = falsas + 1;
				} else if (p1 == 2){
					correctas = correctas + 1;
				}else if (p1 == 3){
					falsas = falsas + 1;
				}
				
				//pregunta 2
				System.out.println("PREGUNTA 2:");
				System.out.println("En una veterinaria hay 150 cachorros. Un quinto de ellos son machos. ¿Cuántas hembras hay? ");
				System.out.println("1) 120");
				System.out.println("2) 60");
				System.out.println("3) 30");
				p2 = scan.nextInt();
				scan.nextLine();
				if (p2 == 1){
					correctas = correctas + 1;
				} else if (p2 == 2){
					falsas = falsas + 1;
				}else if (p2 == 3){
					falsas = falsas + 1;
				}
				
				//pregunta 3
				System.out.println("PREGUNTA 3:");
				System.out.println("El 40 por ciento de 75 es 28. ");
				System.out.println("1) Verdadero");
				System.out.println("2) Falso");
				p3 = scan.nextInt();
				scan.nextLine();
				if (p3 == 1){
					falsas = falsas + 1;
				} else if (p3 == 2){
					correctas = correctas + 1;
				}
				
				//pregunta 4
				System.out.println("PREGUNTA 4:");
				System.out.println("¿Cuándo una división es entera?");
				System.out.println("1) Cuando el resultado es 0");
				System.out.println("2) Cuando el resultado es distinto a 0");
				p4 = scan.nextInt();
				scan.nextLine();
				if (p4 == 1){
					falsas = falsas + 1;
				} else if (p4 == 2){
					correctas = correctas + 1;
				}
				
				//pregunta 5
				System.out.println("PREGUNTA 5:");
				System.out.println("Una bolsa de chocolates pesa 20g. ¿Cuántas necesitas para completar 2 kg?");
				System.out.println("1) 1000");
				System.out.println("2) 10");
				System.out.println("3) 100");
				p5 = scan.nextInt();
				scan.nextLine();
				if (p5 == 1){
					falsas = falsas + 1;
				} else if (p2 == 2){
					falsas = falsas + 1;
				}else if (p2 == 3){
					correctas = correctas + 1;
				}
				
				//dar resultados 
				System.out.println("");
				System.out.println("Respuestas correctas: ");
				System.out.println(correctas);
				System.out.println("Respuetas incorrectas");
				System.out.println(falsas);
				
			} else if (opcion == 4){
				//salir del ciclo while 
				repetir = false;
			}
			
		}
	}
}
