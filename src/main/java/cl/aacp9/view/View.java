package cl.aacp9.view;

import java.util.ArrayList;

import cl.aacp9.service.CalculadoraComplejaImpl;
import cl.aacp9.service.CalculadoraSimpleImpl;
import cl.aacp9.utility.Utility;

public class View {
	public void despliegue() {
		Utility utility = new Utility();
		CalculadoraSimpleImpl calculadoraSimpleImpl=new CalculadoraSimpleImpl();
		CalculadoraComplejaImpl calculadoraComplejaImpl=new CalculadoraComplejaImpl();
		System.out.println("------------------------------------------");
		System.out.println("Demostración Cálculo de Stock de Seguridad");
		System.out.println("------------------------------------------");
		System.out.println("\nTomando 5 valores de stock aleatorios...");
		
		ArrayList<Integer> arrayList=utility.generaNumeroAleatorio(0, 50);
		utility.MostrarLista(arrayList);
		System.out.println("\n");
		
		System.out.print("Stock de Seguridad con Algoritmo Simple: ");
		System.out.println(calculadoraSimpleImpl.calcula(arrayList));
		
		System.out.print("Stock de Seguridad con Algoritmo Complejo: ");
		System.out.println(calculadoraComplejaImpl.calcula(arrayList));

		
	}

}
