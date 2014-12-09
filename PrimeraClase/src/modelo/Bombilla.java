package modelo;

public class Bombilla {
	private int vatios;
	private String estado;
	
	public Bombilla(int vatios,String estado){
		this.vatios=vatios;
		if (!estado.equals("encendido")&& !estado.equals("apagado"))//si no esta encendido o apagado que se quede encendida para errores
			estado="encendido";
		this.estado=estado;
	}

	public int getVatios() {//obtiene los vatios de la bombilla
		return vatios;
	}

	public void setVatios(int vatios) {//le puedo cambiar los vatios
		this.vatios = vatios;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String pulsarInterruptor(){
		if(estado.equals("apagado"))
			estado="encendido";
		else 
			estado= "apagado";
		return estado;//devuelve el estado de la bombilla
		
	}

}
