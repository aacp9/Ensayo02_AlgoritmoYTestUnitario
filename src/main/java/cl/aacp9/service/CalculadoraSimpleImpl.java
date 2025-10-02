package cl.aacp9.service;

import java.util.ArrayList;
import java.util.List;

public class CalculadoraSimpleImpl implements CalculadoraStockSeguridad {

	@Override
	public List<Integer> calcula(List<Integer> listaEnteros) {
		ArrayList<Integer> listaRetorno=new ArrayList<>();
		for (Integer temp : listaEnteros) {
			if (temp>2) {
				listaRetorno.add(2);
			}else {
				listaRetorno.add(0);
			}
		}
		return listaRetorno;
	}

}
