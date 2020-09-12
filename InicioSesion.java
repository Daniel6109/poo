import java.util.Scanner; //Se importa Scanner

public class InicioSesion { //Clase que valida cuando un usuario intenta ingresar como miembro
    static String password, loginPass, username, loginUser; //Variables estaticas que almacenaran datos ingresados por el usuario
    static Scanner sc = new Scanner(System.in);
    static boolean login = true; //booelan que valida el login
    static boolean checkvalid = false; //valida cuando no se ingresan datos correcto
    
    public static void main(String[] args) {
        System.out.println("Cree su nombre de usuario:");
    username = sc.nextLine(); //Solicita creacion de nombre de usuario

    System.out.println("Cree su clave:");
    password = sc.nextLine(); //solicita creacion de clave

    System.out.println("Muchas gracias, ingrese sus datos nuevamente para iniciar sesion\n");
    while (login) { //While que controla el ingreso correcto de datos
        checkvalid = false;
        System.out.println(" ------------------ \n" + "Usuario: ");
        loginUser = sc.nextLine();
        System.out.println("Clave: ");
        loginPass = sc.nextLine();

        if (loginUser.equals(username) && (loginPass.equals(password))) { //If que valida que los datos ingresados la segunda vez sean igual a los ingresados originalmente
            checkvalid = true;
            login = false;
            System.out.println("Ha iniciado correctamente y tiene acceso a las siguientes funcionalidades del programa: ");
        } else { //Else cuando no se ingresan correctamente datos por lo que se despliega mensaje de error y se solicitan otra vez
            checkvalid = false;
            System.out.println("Credenciales incorrectas, ingreselas de nuevo");
        }
    }
    }
    

    
}