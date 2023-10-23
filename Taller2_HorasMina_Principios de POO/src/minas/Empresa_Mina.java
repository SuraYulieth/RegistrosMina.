package minas;

import java.util.Scanner;

public class Empresa_Mina {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner entrada = new Scanner (System.in);
	Empleado empleado1 = new Empleado();
	Registro hTrabajadas = new Registro();
	Novedades novedad = new Novedades();
		
	int[] horaEntrada = new int[6];
	int[] horaSalida = new int[6];
	int campo;
	String nove;
		
	//Empleado
	System.out.println("¿Cuál es el nombre del trabajador?");
	empleado1.setNombre(entrada.nextLine());
		
	System.out.println("¿Cuál es el ID del trabajador?");
	empleado1.setId(entrada.nextLine());
		
	System.out.println("Ingrese la fecha y hora de entrada dando enter para cada una (Año, mes, día, hora, minutos y segundos o 0.)");
	for (int i = 0; i<6; i++) {
		hTrabajadas.Casos_i(i);
		campo = entrada.nextInt();
		horaEntrada[i]= campo;
		entrada.nextLine();
	}
		
	System.out.println("Ingrese la fecha y hora de salida dando enter para cada una (Año, mes, día, hora, minutos y segundos o 0.)");
	for (int i = 0; i<6; i++) {
		hTrabajadas.Casos_i(i);
		campo = entrada.nextInt();
		horaSalida[i]= campo;
		entrada.nextLine();
	}
		
	hTrabajadas.setHFecha_entrada(horaEntrada);
	hTrabajadas.setHFecha_salida(horaSalida);
		
	System.out.println("El empleado " + empleado1.getNombre() + " identificado con el ID " + empleado1.getId() 
	+ " ha trabajado " + hTrabajadas.calcuh_trabajadas() + " horas.");
		
	System.out.println(" ");
				
		
	if (hTrabajadas.calcuh_trabajadas()>=8) {
		System.out.println("¿Desea solicitar alguna novedad? si/no");
		nove = entrada.nextLine();
		if (nove.equals("si")) {
			System.out.println("¿Qué tipo de novedad desea solicitar? incapacidad, permiso, vacaciones o licencia (Ingrésela en minúscula)");
			novedad.setTipo(entrada.nextLine());
	
			if (novedad.getTipo().equals("incapacidad")){
				System.out.println("¿Cuántos días de incapacidad solicita?");
				novedad.setTiempoSolicitado(entrada.nextInt());
				System.out.println(novedad.Incapacidad());
			}
			else if(novedad.getTipo().equals("vacaciones")) {
				System.out.println("¿Cuántos días de vacaciones solicita?");
				novedad.setTiempoSolicitado(entrada.nextInt());
				System.out.println(novedad.Vacaciones());
			}
			else if (novedad.getTipo().equals("permiso")){
				System.out.println("¿De cuántas horas solicita el permiso?");
				novedad.setTiempoSolicitado(entrada.nextInt());
				System.out.println(novedad.Permisos());
			}
			else if (novedad.getTipo().equals("licencia")) {
				System.out.println("¿Qué clase de licencia es?" + 
							   "\nIngrese 1 para Licencia de maternidad" + 
		                       "\nIngrese 2 para Licencia de paternidad" + 
		                       "\nIngrese 3 para ninguna de las anteriores");
				novedad.setTLicencia(entrada.nextInt());
			
				if (novedad.getTLicencia()==3) {
					System.out.println("La licencia la desea por menos de un día (ingrese 1) o por uno o más de un día (ingrese 2)");
					novedad.setTipoLicencia(entrada.nextInt());
					System.out.println("¿De cuánto tiempo solicita la licencia?");
					novedad.setTiempoSolicitado(entrada.nextInt());
					System.out.println(novedad.Licencia());
				} 
				else if (novedad.getTLicencia()==2) {
					System.out.println("¿De cuántos días solicita la licencia?");
					novedad.setTiempoSolicitado(entrada.nextInt());
					System.out.println(novedad.LicenciaPaternidad());
				}
				else if (novedad.getTLicencia()==1) {
					System.out.println("¿De cuántos días solicita la licencia?");
					novedad.setTiempoSolicitado(entrada.nextInt());
					System.out.println(novedad.LicenciaMaternidad());
				}
			else 
			{
				System.out.print("Ingrese una novedad válida.");
			}
				
		}
			}
		//Polimorfismo
		System.out.println(empleado1.Imprimir_información() + novedad.Imprimir_información());	
		
		}	
		else {
			System.out.println("Es necesario completar su mínimo de 8 horas.");
		}
		
	}
}




