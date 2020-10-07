
import java.util.Scanner;

public class Vista {

  private Scanner scanL;
  private Scanner scanN;

  public Vista() {
    scanL = new Scanner(System.in);
    scanN = new Scanner(System.in);
  }

  // menu de inicio
  public void mostrarMenu() {
    System.out.println("Bienvenido al programa!");
    System.out.println("\n\nSeleccione una de las siguientes opciones:\n");
    System.out.println("1. Iniciar sesion");
    System.out.println("2. Acceder como invitado (En Construccion...)");
    System.out.println("3. salir");
  }

  // menu del usuario
  public void mostrarMenuDeUsuario() {
    System.out.println("Bienvenido ");
    System.out.println("Ingrese alguna de las siguientes opciones:\n");
    System.out.println("1. Acceder a cursos.");
    System.out.println("2. Donación.");
    System.out.println("3. Noticias.");
    System.out.println("4. Minijuegos.");
    System.out.println("5. En construccion...");
    //System.out.println("5. Ranking de los cursos mas visitados a nivel nacional");
    System.out.println("6. En construccion...");
    //System.out.println("6. Mostrar ranking personal basado en el material de los cursos utilizado. /No disponiblr");
    System.out.println("7. En construccion...");
    //System.out.println("7. Mostrar donadores. /No disponble");
    System.out.println("8. Mostrar información de contacto.");
    System.out.println("9. Salir");
  }

  public void mostrarMenuPensum() {
    System.out.println("Bienvenido a la plataforma");
    System.out.println("CURSOS DISPONIBLES:\n");
    System.out.println("1. Matematica");
    System.out.println("2. Comunicacion y Lenguaje");
    System.out.println("3. Programacion");
    System.out.println("4. ¿Desea realizar un pequeño quiz de matemática?");
    System.out.println("5. Salir\n");
    System.out.println("Elija ");
  }

  // mensaje de error
  public void errorDato() {
    System.out.println("Se ha ingresado un error de dato erroneo. Intentelo de nuevo.");
  }

  // Mensaje en consola
  public void imprimir(String mensaje) {
    System.out.println(mensaje);
  }

  // Mensaje de bienvenida a los cursos
  public void Bienvenida() {
    System.out.println("¡Bienvenido al curso de matemáticas!");

  }

  // Llamar el vinculo de los cursos
  public void getVinculo() {
    String curso_1 = "https://www.youtube.com/watch?v=V33U1OsFVnQ";
    System.out.println("\nIngrese al siguiente vinculo para ver su curso.   " + curso_1 + "\n");
  }

  // Recibir comentario de los usuarios sobre los cursos
  public String getComentario() {
    System.out.println(
        "\nMuchas gracias por tomar este curso con nosotros! Su opinion es muy importante para nosotros, por favor comente lo que le pareció el curso y si la tuviera alguna sugerencia, muchas gracias!");
    System.out.println("Ingresa tu comentario: \n");
    String comen = scanL.nextLine();

    return comen;
  }

  // Menu de los cursos
  public int menu() {
    String menu = "\nBienvenido al curso! Seleccione el tema que quiere estudiar: \n";
    menu += "1. Curso no.1\n";
    menu += "2. Curso no.2\n";
    menu += "3. Salir\n";
    
    System.out.println(menu);
    int op = scanN.nextInt();

    return op;
  }


  //Menu para los juegos
  public int menuJuego() {
    String menu = "\nBienvenido al apartado de juegos! Seleccione que quiere jugar: \n";
    menu += "1. Juego de cuestionario\n";
    menu += "2. Juego de matemáticas\n";
    menu += "3. Salir\n";
    
    System.out.println(menu);
    int opc = scanN.nextInt();

    return opc;
  }

  // Mensaje de despedida de los cursos
  public void salir() {
    System.out.println("\nGracias por estudiar con nosotros!");
  }

  public void claseProgramacion() {
    System.out.println(" :: CURSO PROGRAMACIÓN  :: ");
    System.out.println(
        "-> Descripción: Programa desde cero, domina los conceptos basicos, entiende a teoria y aprende de algoritmos. Sí, desde cero. Entenderás la lógica del código, cómo piensan los programadores y cómo empezar en este maravilloso mundo. Aprender a programar no es fácil, pero Edukacita lo hace efectivo.\n");
    System.out
        .println("-> Para ver el curso completo accede a este link: https://www.youtube.com/watch?v=-YQsAS5zVPw\n");
    System.out.println("-> Lecturas: https://www.youtube.com/watch?v=-YQsAS5zVPw\n");
    System.out.println("-> Recursos: https://www.youtube.com/watch?v=-YQsAS5zVPw\n");

  }

  public void claseMateF() {
    System.out.println(" :: CURSO MATEMATICAS  :: ");
    System.out.println(
        "-> Descripción: Con este curso podrás aprender temas fundamentales de arimética, álgebra y geometría. Podrás preparate con material especializado para que el aprendizaje sea el mejor. Con Edukacita contamos con los métodos más efectivos. \n");
    System.out.println("-> Para ver el curso completo accede a este link: https://www.youtube.com/watch?v=cx9f26T1mms&t=264s\n");
    System.out.println("-> Sumario: \n");
    System.out.println("  1)	Plano cartesiano: Formado por dos rectas numéricas, una vertical y otra horizontal. Habitualmente usado para identificar puntos.");
     System.out.println("  2)	Abscisas: Coordenada horizontal o Eje X");
     System.out.println("  3) 	Ordenadas: Coordenada vertical o Eje Y");
     System.out.println("  4)	René Descartes: Filósofo, matemático y física francés. Creador del plano cartesiano.");
     System.out.println("  5) 	Origen: Punto con coordenadas (0,0) sobre el plano.");
     System.out.println("  6) 	Coordenadas: Sistema para localizar un punto en el plano cartesiano, la notación es la siguiente (x,y)");
     System.out.println("  7) 	Recta numérica: Gráfico unidimensional la cual contiene todos los números reales, se usa para marcar puntos sobre la misma.");
     System.out.println("  8) 	Cuadrantes: Forma fácil para identificar puntos sobre el plano y conocer sus signos. El plano cartesiano contiene 4 de estos.");
     System.out.println("  9) 	Antihorario: Contrario al giro de las manecillas del reloj.");

    System.out.println("");
    System.out.println("");
    System.out.println("-> Documentación: ");
    System.out.println("");
    System.out.println("  Algunas aplicaciones del plano cartesiano son utilizadas en el campo de la física, aunque en la vida cotidianda diferentes profesiones hacen uso del mismo, tales como realizar mediciones de terrenos, las fuerzas del orden se ubican por medio de un mapa basado en el plano o para calcular la trayectoria de una pelota en un juego de fútbol");
   

  }

  public void claseLiteratura(){
    System.out.println(" :: CURSO LITERATURA  :: ");
    System.out.println(
        "-> Descripción: Por medio de este curso se implementa la política del estudio de la lengua materna. Esta área domina los conceptos basicos tales como el analisis sintactico (analissi de oraciones) e inclusive temas poco mas avanzados como el anaislis lirico (poemas). Además, los alumnos aprenden a apreciar el arte de la literatura, a desarrollar la capacidad de reflexionar de manera crítica sobre sus lecturas, y a presentar análisis literarios de manera eficaz mediante una comunicación tanto oral como escrita.\n");

    System.out.println("-> Para ver el curso completo accede a este https://www.youtube.com/watch?v=Hr3u229hmkw\n");

    System.out.println("");
    System.out.println("");
    System.out.println("-> Documentación: ");
    System.out.println("");
    System.out.println("  El estudio de la literatura es fundamental para conocer bien la lengua y la cultura y, en consecuencia, para definir nuestro modo de ver y entender el mundo en que vivimos. Uno de los principales objetivos generales del curso es estimular a los alumnos a cuestionar la construcción de significados en la lengua y los textos, que pocas veces resultan claros e inequívocos. Además que los alumnos desarrollen habilidades de análisis de textos y la comprensión de que estos.");
   
  }

  /*
   * public int pedirNumero(){ System.out.println("Ingrese un numero: "); int num
   * = scanN.nextInt();
   * 
   * return num; }
   */

  /*
   * public int continuar(int numero){
   * System.out.println("\nPresione 1 para continuar con el curso."); this.numero
   * = pedirNumero();
   * 
   * if (numero == 1){ ; }else { System.out.println("Orale!"); }
   * 
   * return numero; }
   */


   public void mensajeInvitado(){
     System.out.println("Acceso como invitado en construcción...");
     
   }
}