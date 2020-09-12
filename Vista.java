/*
Dáriel Eduardo Villatoro Rodas
Carné: 20776

POO - 2020
Sección: 21
Segunda Entrega del Proyecto
*/

//Clase vista

public class Vista {

    public Vista () {

    }

    //menu de inicio
    public void mostrarMenu () {
        System.out.println("Bienvenido al programa!");
        System.out.println("\n\nSeleccione una de las siguientes opciones:\n");
        System.out.println("1. Iniciar sesion");
        System.out.println("2. Ingresar como invitado");
        System.out.println("3. salir");
    }

    //menu del usuario
    public void mostrarMenuDeUsuario () {
        System.out.println("Bienvenido ");
        System.out.println("Ingrese alguna de las siguientes opciones:\n");
        System.out.println("1. Acceder a cursos.");
        System.out.println("2. Donación.");
        System.out.println("3. Noticias.");
        System.out.println("4. Minijuegos.");
        System.out.println("5. Ranking de los cursos más visitados nivel nacional. /No disponible");
        System.out.println("6. Mostrar ranking personal basado en el material de los cursos utilizado. /No disponiblr");
        System.out.println("7. Mostrar donadores. /No disponble");
        System.out.println("8. Mostrar información de contacto.");
        System.out.println("9. Salir");
    }

    //mensaje de error
    public void errorDato () {
        System.out.println("Se ha ingresado un error de dato erroneo. Intentelo de nuevo.");
    }



}