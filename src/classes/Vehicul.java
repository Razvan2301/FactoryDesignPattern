package classes;

import interfaces.IVehicul;
public class Vehicul implements IVehicul {

	private int numarRoti; 
	private int numarLocuri;
	private String motorizare;
	
	
	@Override
	public int getNumarRoti() {
		
		return this.numarRoti;
	}

	@Override
	public void setNumarRoti(int nrRoti) {
		this.numarRoti = nrRoti;
		
	}

	@Override
	public int getNrLocuri() {
		return this.numarLocuri;
	}

	@Override
	public void setNumarLocuri(int nrLocuri) {
		this.numarLocuri = nrLocuri;
		
	}

	@Override
	public String getMotorizare() {
		return this.motorizare;
	}

	@Override
	public void setMotorizare(String motorizare) {
		this.motorizare = motorizare;
	}
	
	public Vehicul(int numarRoti, int numarLocuri, String motorizare) {
		this.numarRoti = numarRoti;
		this.numarLocuri = numarLocuri;
		this.motorizare = motorizare;
	}

}
