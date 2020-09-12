import java.util.ArrayList;

public class Noticia {

    private int random;
    private ArrayList<String> noticia = new ArrayList<>();

    Noticia() {

        // Noticias de ejemplo
        noticia.add("React es una biblioteca Javascript de código abierto diseñada para crear interfaces de usuario con el objetivo de facilitar el desarrollo de aplicaciones en una sola página.");
        noticia.add("La Universidad del Valle de Guatemala es una universidad privada, sin fines de lucro y secular localizada en la Ciudad de Guatemala, Guatemala. ");
        noticia.add("Google LLC es una compañía principal subsidiaria de la multinacional estadounidense Alphabet Inc., cuya especialización son los productos y servicios relacionados con Internet, software, dispositivos electrónicos y otras tecnologías. ");

    }

    // Obtener una noticia de forma aletoria
    public String getNoticia() {
        // Optiene un número aletoria entre 0 y la cantidad de noticias
        this.random = (int) Math.random() * noticia.size();
        return this.noticia.get(this.random);
    }

    // Agregar noticias nuevas
    public void setNoticia(String noticia) {
        this.noticia.add(noticia);
    }

}
