/*Mariana David - 201055
Fredy Velásquez - 201011
Mynor Lima - 20847
Daniel Estrada - 20853
Ángel Higueros - 20460
Dáriel Villatoro - 20776 

POO - 2020
Seccion 21
Fecha de entrega: 11/09/020
Segunda entrega proyecto
Primera parte programada
*/





import java.util.Scanner; //Se importa Scanner

public class InicioSesion { //Clase que valida cuando un usuario intenta ingresar como miembro
    static String password, loginPass, username, loginUser; //Variables estaticas que almacenaran datos ingresados por el usuario
    static Scanner sc = new Scanner(System.in);
    static boolean login = true; //booelan que valida el login
    static boolean checkvalid = false; //valida cuando no se ingresan datos correcto
    
public void Arranque() {    
    System.out.println("Cree su nombre de usuario: \n");
    username = sc.nextLine(); //Solicita creacion de nombre de usuario

    System.out.println("Cree su clave: \n");
    password = sc.nextLine(); //solicita creacion de clave

    System.out.println("Muchas gracias, inicie sesion.\n");
    while (login) { //While que controla el ingreso correcto de datos
        checkvalid = false;
        System.out.println(" ------------------ \n" + "Usuario: \n");
        loginUser = sc.nextLine();
        System.out.println("Clave: \n");
        loginPass = sc.nextLine();

        if (loginUser.equals(username) && (loginPass.equals(password))) { //If que valida que los datos ingresados la segunda vez sean igual a los ingresados originalmente
            checkvalid = true;
            login = false;
            System.out.println("Ha iniciado correctamente y tiene acceso a las siguientes funcionalidades del programa: ");
        } else { //Else cuando no se ingresan correctamente datos por lo que se despliega mensaje de error y se solicitan otra vez el ingreso de los mismos
            checkvalid = false;
            System.out.println("Credenciales incorrectas, ingreselas de nuevo");
        }
    }

    }
}
