import java.util.Scanner;

public class vistaMate{
	Scanner scanL;
	Scanner scanN;
	int numero;
	
	public vistaMate(){
		scanL = new Scanner(System.in);
		scanN = new Scanner(System.in);
	}
	
	public void Bienvenida(){
		System.out.println("¡Bienvenido al curso de matemáticas!");
		
	}
	
	
	public void getVinculo(){
		String curso_1 = "https://www.youtube.com/watch?v=UOrv5ZSbTIY&list=RDUOrv5ZSbTIY&start_radio=1&ab_channel=BabyKeemVEVO";
		System.out.println("\nIngrese al siguiente vinculo para ver su curso.   " + curso_1 + "\n");
	}
	
	
	public String getComentario(){
		System.out.println("\nMuchas gracias por tomar este curso con nosotros! Su opinion es muy importante para nosotros, por favor comente lo que le pareció el curso y si la tuviera alguna sugerencia, muchas gracias!");
		String comen = scanL.nextLine();
		
		return comen;
	}
	
	
	public int menu(){
		String menu = "\nBienvenido al curso! Seleccione el tema que quiere estudiar: \n";
		menu += "1. Curso no.1\n";
		menu += "2. Curso no.2\n";
		menu += "3. Salir\n";
		System.out.println(menu);
		int op = scanN.nextInt();
		
		return op;
	}
	
	
	public void salir(){
		System.out.println("\nGracias por estudiar con nosotros!");
	}
	
	
	public int pedirNumero(){
		System.out.println("Ingrese un numero: ");
		int num = scanN.nextInt();
		
		return num;
	}
	
	
	public int continuar(int numero){
		System.out.println("\nPresione 1 para continuar con el curso.");
		this.numero = pedirNumero();
		/*
		if (numero == 1){
			;
		}else {
			System.out.println("Orale!");
		}*/
		
		return numero;
	}
}