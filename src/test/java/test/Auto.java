
package test;

import java.util.ArrayList;



public class Auto {
	public static int CantidadCreados;
	String modelo;
	int precio;
	Asiento asientos[];
	String marca;
	Motor motor;
	int registro;
	
	public int cantidadAsientos() {
		int x=0;
		for (int i=0;i<asientos.length;i++) {
			if (asientos[i]!=null) {
				x++;
			}
		}
		return x;
	}
	
	public String verificarIntegridad() {
		int x=0;
		ArrayList<Integer> lista_depurada = new ArrayList<Integer>();
		if (this.registro==motor.registro) {
			for (int i=0;i<asientos.length;i++) {
				if (asientos[i]!=null) {
					lista_depurada.add(i);
				}
		}
			for (int i=0;i<lista_depurada.size()-1;i++) {
				if (asientos[lista_depurada.get(i)].registro==asientos[lista_depurada.get(i+1)].registro) {
					x++;
				}
				
			}
			if (x==lista_depurada.size()-1) {
				return "Auto original";
			}else {
				return "Las piezas no son originales";
			}
		}else {
			return "Las piezas no son originales";
		}
	}
	
}

	
	


