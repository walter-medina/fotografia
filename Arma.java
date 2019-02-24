package modelo;

public class Arma{
	//atributos
	public final static String TURBO_LASER = "turbo laser";
	public final static String CANION_LASER = "canion laser";
	public final static String CANION_IONES = "canion de iones";
	public final static String TORPEDO_PROTONES = "torpedo de protones";
	public final static String DESTRUCCION_MASIVA = "destruccion masiva";
	public final static int DANIO_TURBO = 100;
	public final static int DANIO_CANION_LASER = 250;
	public final static int DANIO_CANION_IONES = 1500;
	public final static int DANIO_TORPEDO = 700;
	private String tipo;
	private int danio;
	
	//constructor
	public Arma(String tipo; int danio){
		this.tipo = tipo;
		this.danio = danio;
	}
	//metodos
	public int saberTipoDanio(){
		int danio=0;
		if(tipo.equals(TURBO_LASER)){
			danio = DANIO_TURBO;
		}else if(tipo.equals(CANION_LASER)){
			danio = DANIO_CANION_LASER;
		}else if(tipo.equals(CANION_IONES)){
			danio = DANIO_CANION_IONES;
		}else if(tipo.equals(TORPEDO_PROTONES)){
			danio = DANIO_TORPEDO;
		}
		return danio;
	}
	public String darTipo(){
		return tipo;
	}
	public int darDanio(){
		return danio;
	}
	public void modificarTipo(String tipo){
		this.tipo = tipo
	}
	public void modificarDanio(int danio){
		this.danio = danio;
	}
}