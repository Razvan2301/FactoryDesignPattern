package classes;

public class Camion extends Vehicul {


	private float capacitateRemorca ;

	public float getCapacitateRemorca() {
		return capacitateRemorca;
	}

	public void setCapacitateRemorca(float capacitateRemorca) {
		this.capacitateRemorca = capacitateRemorca;
	} 
	
	public Camion(int numarRoti, int numarLocuri, String motorizare, float capacitateRemorca) {
		super(numarRoti, numarLocuri, motorizare);
		this.capacitateRemorca = capacitateRemorca;
	}	
	
}
