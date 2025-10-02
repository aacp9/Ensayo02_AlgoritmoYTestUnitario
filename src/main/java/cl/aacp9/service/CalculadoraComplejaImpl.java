package cl.aacp9.service;

import java.util.ArrayList;
import java.util.List;

public class CalculadoraComplejaImpl implements CalculadoraStockSeguridad {

	@Override
	public List<Integer> calcula(List<Integer> listaEnteros) {
		ArrayList<Integer> listaRetorno=new ArrayList<>();
		int cComplejo=0;
		for (Integer temp : listaEnteros) {
			if (temp>2) {
				if(temp>=10 && temp <20) {
					cComplejo=(int)Math.round(temp*0.05);
				}
				if(temp>=20) {
					cComplejo=(int)Math.round(temp*0.1);
				}
				listaRetorno.add(2+cComplejo);
			}else {
				listaRetorno.add(0);
			}
		}
		return listaRetorno;
	}

}
