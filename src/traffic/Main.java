package traffic;

import java.util.ArrayList;

import factory.VehiculFactory;
import interfaces.IVehicul;
import interfaces.IVehiculFactory;

public class Main {

	public static void main(String[] args) {

		IVehiculFactory vehiculFactory = new VehiculFactory();
		ArrayList<IVehicul> vehiculs = new ArrayList<>(10);
		
		for(int i = 0 ; i < 10 ; i++){ 
			vehiculs.add(vehiculFactory.createVehicul(i%5 + 1));
		}
		
		for(IVehicul vehicul : vehiculs){
			System.out.println(vehicul.getClass());
		}
		
	}

}
