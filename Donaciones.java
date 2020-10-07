//2da Parte del proyecto 

//Importaciones
import java.util.*;
import java.util.Scanner;

 public class Donaciones {
        //Variables 
        static String nombre;
        static String apellido;
        static double monto;
        static int opcionPago;
        static boolean validacion = true;
        static int enviar;
        static double conversion;
        static int lugar;
        List<String> escuelasLista = new ArrayList<String>();

        // Metodo paraa facilitar la impresion
        public static void print(final Object object) {
        System.out.println(object);
        }

      
       

            //metodo 
            public static void donar (){
                
            // Instancias (scanner)
            final Scanner scan = new Scanner(System.in);
            final List escuelasLista = new ArrayList();
            
            //Agregar nombres de escuelas:
            escuelasLista.add("ESCUELA NORMAL CENTRAL PARA VARONES");
            escuelasLista.add("CENTRO DE EDUCACION INTEGRAL");
            escuelasLista.add("ANEXA A ESCUELA OFICIAL URBANA MIXTA SANTA ELENA II");

            while (validacion==true) {
        
            
                //Ingreso de informacion 
                print ("------------------------------------------------------------------");    
                print("\n ¡Gracias por apoyar y creer en nuestra causa!");
                print("Si deseas realizar un donativco puedes llenar la siguiente informacion: \n");
                print ("------------------------------------------------------------------");  
                print("Ingrese UNICAMENTE su  nombre como donador (puede colocar ANONIMO):");
                nombre =scan.next();
                print("\nIngrese UNICAMENTE su  1er apellido como donador (puede colocar ANONIMO):");
                apellido =scan.next();
                print ("\n Las escuelas a las que puede donar son las siguientes: ");
                
                //PENDIENTE
                for (int i = 0; i < escuelasLista.size(); i++) {
                    print(i+1+"."+escuelasLista.get(i));
                    //print(escuelasLista.get(i));
                }
                print ("\n Seleccione el lugar donde desea donar: ");
                lugar=scan.nextInt();
                print("\n 1.Quetzales 2.Dolares ");
                print("Ingrese el TIPO de ficha con el que va a donar : \n");
                opcionPago = scan.nextInt();
                print("Ingrese la cantidad respecto a la moneda elegida que desea donar : \n");
                monto=scan.nextDouble();

                //Condicion de pago
                if (opcionPago==1){
                    print ("\nSu monto total a pagar es de: Q"+monto+"\n");

                }else{
                    //conversion
                    conversion=monto*7.7;
                    print ("\nSu monto total a pagar en dolares es de: $"+monto);
                    print ("Su monto total a pagar en Quetzales es de: Q"+conversion+"\n");
                }

                //Asegura si se quiere enviar los datos y donacion
                print("1. Si 2.No  \n");
                print("Desea enviar donacion : \n");
                enviar=scan.nextInt();
                //Condicion:

                if (enviar==1){
                    print("Su donacion ha sido enviada satisfactoriamente. ¡Muchas gracias! \n\n");
                    //impresion de diploma 
                    print ("***********************************************************************************");
                    print ("***********************************************************************************");
                    print ("**********                     Reconocimeinto a:                   ****************");
                    print ("**********"+ "                     "+nombre+" "+apellido+"                     "+"***************");
                    print ("**********  Por su valisosa contribucion al apoyo de clases en linea. *************");
                    print ("***********************************************************************************");
                    print ("*********************************************************************************** \n\n");
                } else {
                    print ("");
                    validacion=true;


                }
            }    

        

       
        

    }     
}     