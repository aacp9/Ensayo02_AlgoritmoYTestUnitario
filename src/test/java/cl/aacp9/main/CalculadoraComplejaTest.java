package cl.aacp9.main;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.logging.Logger;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import cl.aacp9.service.CalculadoraComplejaImpl;

public class CalculadoraComplejaTest {
	CalculadoraComplejaImpl calculadoraCompleja = new CalculadoraComplejaImpl();
	private static Logger logger=Logger.getLogger("cl.aacp9.main");
	
	@Test
	@DisplayName("Test CalculadoraCompleja")
	public void calcula() {
		ArrayList<Integer> arrayList= new ArrayList<Integer>();
		ArrayList<Integer> arrayListRecibido= new ArrayList<Integer>();
		arrayList.add(2);
		arrayList.add(10);
		arrayList.add(20);
		arrayList.add(30);
		arrayListRecibido=(ArrayList<Integer>) calculadoraCompleja.calcula(arrayList);
		assertEquals(0,arrayListRecibido.get(0));
		assertEquals(3,arrayListRecibido.get(1));
		assertEquals(4,arrayListRecibido.get(2));
		assertEquals(5,arrayListRecibido.get(3));
			
		//caso condiciones de borde
		ArrayList<Integer> arrayList2= new ArrayList<Integer>();
		ArrayList<Integer> arrayListRecibido2= new ArrayList<Integer>();
		arrayList2.add(2);
		arrayList2.add(0);
		arrayList2.add(20);
		arrayList2.add(30);
		arrayListRecibido2=(ArrayList<Integer>) calculadoraCompleja.calcula(arrayList2);
		assertEquals(0,arrayListRecibido2.get(0));
		assertEquals(0,arrayListRecibido2.get(1));
		assertEquals(4,arrayListRecibido2.get(2));
		assertEquals(5,arrayListRecibido2.get(3));

	}
}
