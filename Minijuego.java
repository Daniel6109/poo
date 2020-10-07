import java.util.Scanner;

public class Minijuego {

  // Colores
  private String ANSI_RED = "\u001B[31m";
  private String ANSI_GREEN = "\u001B[32m";
  private String ANSI_BLUE = "\u001B[34m";

  private String ANSI_RESET = "\u001B[0m";

  // utilidades
  Scanner sc = new Scanner(System.in);
  private int punteo = 5;
  private String[] preguntas = new String[2];
  private String[] respuestas = new String[2];
  private String respuesta;
  private Vista vista = new Vista();


  Minijuego() {
    // Crear preguntas de programación
    this.preguntas[0] = "cual es la extension de un programa de java?";
    this.respuestas[0] = "java";
    this.preguntas[1] = "Cual es el comando para compilar una arhivo de java";
    this.respuestas[1] = "javac";
  }

  public void cuestionario() {

    vista.imprimir(ANSI_RED + ":: CUESTIONARIO ::" + ANSI_RESET);

    // Cada ronda es de 2 preguntas
    for (int i = 0; i < preguntas.length; i++) {

      vista.imprimir(ANSI_BLUE + this.preguntas[i] + ANSI_RESET);
      this.respuesta = sc.nextLine();

      if (respuesta == this.respuestas[i]) {
        this.punteo += 5; // se suman 5 puntos
      }

    }

    vista.imprimir(ANSI_GREEN + "Felicidades, su puntuacion es de " + punteo + " :)" + ANSI_RESET);

  }

}