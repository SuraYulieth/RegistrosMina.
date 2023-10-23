package minas;

//Herencia
public class Novedades extends Empleado{
	protected int hMin;
	protected int hMax;
	protected int diaMin;
	protected int diaMax;
	protected int tiempoSolicitado;
	protected String tipo;
	protected int tipoLicencia;
	protected int tLicencia;
	protected int tSobrante=0;
	
	
	//Funciones 
	public String Incapacidad() {
		diaMin = 1;
		diaMax = 20;
		if (tiempoSolicitado >= diaMin && tiempoSolicitado <=  diaMax) {
			return "Solicitud aceptada";
		}
		else {
			return "Solicitud denegada. Las incapacidades se dan por al menos un día y máximo 20.";
		}
	}
	
	public String Vacaciones() {
		diaMin = 1;
		diaMax = 15;
		if (tiempoSolicitado >= diaMin && tiempoSolicitado <=  diaMax) {
			return "Solicitud aceptada";
		}
		else {
			return "Solicitud denegada. Las vaciones se dan por al menos un día y máximo por 15.";
		}
	}
	
	public String Permisos() {
		hMin = 1;
		hMax = 5;
		if (tiempoSolicitado >= hMin && tiempoSolicitado <=  hMax) {
			return "Solicitud aceptada";
		}
		else {
			return "Solicitud denegada. Solo es posible solicitar permisos desde una hora, hasta 5 horas." +
		           "\nSolicite una licencia si precisa de más horas.";
		}
	}
		
	public String Licencia() { 
		if (tipoLicencia == 1) {
			if (tiempoSolicitado >= 8 && tiempoSolicitado <=  24) {
				return "Solicitud aceptada";
			}
			else {
				return "Solicitud denegada";
			}
		}
		else if (tipoLicencia == 2) {
			if (tiempoSolicitado >= 1 && tiempoSolicitado <=  4) {
				return "Solicitud aceptada";
			}
		    else {
				return "Solicitud denegada";
				}
		}
		else {
			return "Ingrese campo válido";
		}
	
	}
	
	public String LicenciaPaternidad () {
		
		do {
			tiempoSolicitado = 15 - tiempoSolicitado;
			return "Al trabajador le restan " + tiempoSolicitado + " días de licencia";
			 
		} while (tiempoSolicitado<=15);
	}
			
    public String LicenciaMaternidad () {
    	do {
			tiempoSolicitado = 15 - tiempoSolicitado;
			return "Al trabajador le restan " + tiempoSolicitado + " días de licencia";
			 
		} while (tiempoSolicitado<=15);		
    }
	
	//Métodos getter y setter 
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getTipo() {
		return tipo;
	}
	
	public void setTiempoSolicitado(int tiempoSolicitado) {
		this.tiempoSolicitado = tiempoSolicitado;
	}
	public int getTiempoSolicitado() {
		return tiempoSolicitado;
	}
	
	public void setTLicencia (int tLicencia) {
		this.tLicencia = tLicencia;
	}
	
	public int getTLicencia () {
		return tLicencia;
	}
	
	public void setTipoLicencia(int tipoLicencia) {
		this.tipoLicencia = tipoLicencia;
	}
	public int gettipoLicencia() {
		return tipoLicencia;
	}
	
	//Polimorfismo
	//Sobre escritura de métodos
	@Override 
	public String Imprimir_información () {
		return " puede iniciar su novedad a partir de mañana";
	}

}
