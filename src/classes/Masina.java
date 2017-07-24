package classes;

public class Masina extends Vehicul {

	public int numarUsi ;

	public int getNumarUsi() {
		return numarUsi;
	}

	public void setNumarUsi(int numarUsi) {
		this.numarUsi = numarUsi;
	}

	public Masina(int numarRoti, int numarLocuri, String motorizare, int numarUsi) {
		super(numarRoti, numarLocuri, motorizare);
		this.numarUsi = numarUsi;
	} 
}
