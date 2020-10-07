public class ControladorMate{
	vistaMate v;
	int continuar = 1;
	int conti;
	public ControladorMate(){
		v = new vistaMate();
	}
	
	public void menu(){
		int op = 0;
		while(op != 3){
			op = v.menu();
			if (op == 1){
				for(int i = 0; i < continuar; i++){
					v.Bienvenida();
					v.getVinculo();
					//*v.continuar(v.pedirNumero());
					v.getComentario();
					//v.continuar(v.pedirNumero());
					/*conti = v.continuar(v.pedirNumero());
					if (conti == 1){
						continuar = 1;
					}*/
				}
			} else if (op == 2){
				System.out.println("Hola, este es el segundo curso de matemáticas");
			}else {
				v.salir();
			}
		}
		//op = v.menu();
	}
}