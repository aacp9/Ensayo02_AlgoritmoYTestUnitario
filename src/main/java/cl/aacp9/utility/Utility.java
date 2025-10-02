package cl.aacp9.utility;

import java.util.ArrayList;

public class Utility {

	public ArrayList<Integer> generaNumeroAleatorio(int min, int max) {
		ArrayList<Integer> listaAleatoria = new ArrayList<Integer>();
    	for (int i = 0; i < 5; i++) {
        	int entero=(int) Math.floor(Math.random()*(max-min)+min);
            listaAleatoria.add(entero);
		}
		return listaAleatoria;
	}
	
	public void MostrarLista(ArrayList<Integer> listaRecibida) {
		for (Integer temp : listaRecibida) {
			System.out.print(temp+" ");
		}
	
	}

}
