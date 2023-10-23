package minas;

import java.util.Calendar;

//Herencia
public class Registro extends Empleado{
	Calendar hFecha_entrada;
	Calendar hFecha_salida;
	int i;
	
	public Registro() {
	}
	
	public void setHFecha_entrada(int[] hFecha_entrada) {
		this.hFecha_entrada = Calendar.getInstance();
		this.hFecha_entrada.set(hFecha_entrada[0],hFecha_entrada[1],hFecha_entrada[2],hFecha_entrada[3],hFecha_entrada[4],hFecha_entrada[5]);
	}
	
	public Calendar getHFecha_entrada () {
		return hFecha_entrada;
	}
	
	public void setHFecha_salida(int[] hFecha_salida) {
		this.hFecha_salida = Calendar.getInstance();
		this.hFecha_salida.set(hFecha_salida[0],hFecha_salida[1],hFecha_salida[2],hFecha_salida[3],hFecha_salida[4],hFecha_salida[5]);
	}
	
	public Calendar getHFecha_salida () {
		return hFecha_salida;
	}
	
	//Funciones
	
	public void Casos_i(int i){
		switch (i){
			case 0:
				System.out.println("Año: ");
				break;
			case 1:
				System.out.println("Mes: ");
				break;
			case 2:
				System.out.println("Día: ");
				break;
			case 3:
				System.out.println("Hora: ");
				break;
			case 4:
				System.out.println("Minutos: ");
				break;
			case 5:
				System.out.println("Segundos o 0: ");
				break;
		}
	}
	
	public long calcuh_trabajadas() {
		long diffEnMilisegundos = hFecha_salida.getTimeInMillis() - hFecha_entrada.getTimeInMillis();
        long horas = diffEnMilisegundos / (3600000);
        long minutos = (diffEnMilisegundos / (60000));
		return (horas);
	}
	
}

