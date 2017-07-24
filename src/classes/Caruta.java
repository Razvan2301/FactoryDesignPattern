package classes;

public class Caruta extends Vehicul {

	private int numarCai ;

	public int getNumarCai() {
		return numarCai;
	}

	public void setNumarCai(int numarCai) {
		this.numarCai = numarCai;
	} 
	
	public Caruta(int numarRoti, int numarLocuri, String motorizare, int numarCai) {
		super(numarRoti, numarLocuri, motorizare);
		this.numarCai = numarCai;
	}	
	
}
