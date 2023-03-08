

public abstract class Persona {
	
	private String nombre;
	private String esAlto;
	private String esJoven;
	private String esFuerte;
	private String esHumano;
	
	public Persona() {
		this.nombre = null;
		this.esAlto = null;
		this.esJoven = null;
		this.esFuerte = null;
		this.esHumano = null;
	}
	
	public void setNombre(String nombreAl) {
		nombre = nombreAl;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setAltura(String atributo) {
		esAlto = atributo;
	}
	
	public String getAltura() {
		return esAlto;
	}
	
	public void setEdad(String atributo) {
		esJoven = atributo;
	}
	
	public String getEdad() {
		return esJoven;
	}
	
	public void setFuerza(String atributo) {
		esFuerte = atributo;
	}
	
	public String getFuerza() {
		return esFuerte;
	}
	
	public void setHumano(String atributo) {
		esHumano = atributo;
	}
	
	public String getHumano() {
		return esHumano;
	}

}
