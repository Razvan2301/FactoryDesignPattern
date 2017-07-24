package factory;

import classes.Bicicleta;
import classes.Camion;
import classes.Caruta;
import classes.Masina;
import classes.Scuter;
import interfaces.IVehicul;
import interfaces.IVehiculFactory;

public class VehiculFactory implements IVehiculFactory {

	private IVehicul vehicul;
	
	public IVehicul createVehicul(int type) {
		switch (type) {
		case 1:
			setVehicul(new Bicicleta(0, 0, null, 0));
			break;
		case 2:
			setVehicul(new Camion(0, 0, null, 0));
			break;
		case 3: 
			setVehicul(new Caruta(0, 0, null, 0));
			break;
		case 4:
			setVehicul(new Masina(0, 0, null, 0));
			break;
		default:
			setVehicul(new Scuter(0, 0, null, null));
			break;
		}
		
		return this.vehicul;
	}

	public IVehicul getVehicul() {
		return vehicul;
	}

	public void setVehicul(IVehicul vehicul) {
		this.vehicul = vehicul;
	}

	
	
	
}
