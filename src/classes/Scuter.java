package classes;

public class Scuter extends Vehicul {

	private String marca; 
	
	public String getMarca() { 
		return this.marca;
	}
	
	public void setMarca(String marca){
		this.marca = marca;
	}
	
	public Scuter(int numarRoti, int numarLocuri, String motorizare, String marca){
		super(numarRoti, numarLocuri, motorizare);
		this.marca = marca;
	}
	
	
	
	
	
}

