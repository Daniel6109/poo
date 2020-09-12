/*
Dáriel Eduardo Villatoro Rodas
Carné: 20776

POO - 2020
Sección: 21
Segunda Entrega del Proyecto
*/

//Clase controlador

import java.util.Scanner;

public class Controlador {

    private Vista vista;
    private InicioSesion inicioSesion;

    Scanner scan = new Scanner (System.in);
    
    public Controlador () {
        vista = new Vista();
        //Aqui se instancian las clases
    }

    //Procedimiento del menu
    public void Menu () {
        int i = 0;
        while (i <= 0 || i > 2) {
            vista.mostrarMenu();
            i = verificarInt();
            ejecucionComando(i);
            if (i == 0) {
                vista.errorDato();
            }
        }
    }

    //Ejecucion de las funciones del menu
    private void ejecucionComando (int i) {
        switch (i) {
            case 1:
                inicioSesion.Arranque();
                // nuevoUsuario(); //Se crea el usuario
                // registroUsuario();//Se pide el usuario
                // registroContrasena();//Se pide la password
                opcionesDeUsuario();
                break;
            case 2:
                //Muestra menu de Invitado
            case 3:
                break;
            default:
                vista.errorDato();
        }
    }

    //Crea a un nuevo usuario por medio del registro
    private void nuevoUsuario () {
        System.out.println("Ingrese un nombre usuario");
        String usuario = scan.nextLine();
        System.out.println("Ingrese una contraseña");
        String contrasena = scan.nextLine();
        //Metodo del Registro para la creacion de un usuario
    }

    //Confirma que el nombre del usuario sea correcto
    private void registroUsuario () {
        boolean verificar = false;
        while (verificar == false) {
            System.out.println("Ingrese su nombre de usuario:");
            String nombreUsuario = scan.nextLine();
            //operacion de Registro del usuario
        }
    }

    //Confirma que la contraseña sea correcta
    private void registroContrasena () {
        boolean verificar = false;
        while (verificar == false) {
            System.out.println("Ingrese su contraseña:");
            String contrasena = scan.nextLine();
            //operacion de Registro de contraseña
        }
    }

    //Procedimientos del menu de usuario registrado
    private void opcionesDeUsuario () {
        int i = 0;
        while (i != 9) {
            //Se debe ingresar el string del usuario
            vista.mostrarMenuDeUsuario();
            i = verificarInt();
            menuUsuario(i);
        }
    }

    //Menu para un usuario registrado
    private void menuUsuario (int i) {
        switch (i) {
            case 1:
                //Se deben obtener datos de los cursos para imprimirlos
                break;
            case 2:
                //Se deben obtener datos de las donaciones para imprimirlos
                break;
            case 3:
                //Se deben obtener datos de noticias para imprimirlos
                break;
            case 4:
                //Aqui se ejecuta el minijuego
                break;
            case 5:
                //No disponible
                break;
            case 6:
                //No disponible
                break;
            case 7:
                //No disponible
                break;
            case 8:
                //Se imprimen los contactos
                break;
            case 9:
                break;
            default:
                vista.errorDato();
                break;
        }
    }

    //Metodo defensivo para recibir numeros enteros
    private int verificarInt () {
        try {
            int opcion = scan.nextInt();
            return opcion;
        } catch (IllegalArgumentException i ) {
            return 0;
        }
        
    }
}
