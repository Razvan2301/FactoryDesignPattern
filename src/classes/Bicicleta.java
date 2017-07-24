package classes;

public class Bicicleta extends Vehicul{
	
	private int numarViteze;
	
	
	
	public Bicicleta(int numarRoti, int numarLocuri, String motorizare, int numarViteze) {
		super(numarRoti, numarLocuri, motorizare);
		this.setNumarViteze(numarViteze);
	}



	public int getNumarViteze() {
		return numarViteze;
	}



	public void setNumarViteze(int numarViteze) {
		this.numarViteze = numarViteze;
	}
	
}
