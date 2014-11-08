package core;

import Auxiliary.EnergyAmount;

/**
 * @author 	Brecht Gossel� & William Mauclet
 * 			2BiR: wtk-cws (Gossel�) en cws-elt(Mauclet)
 * @version	3.0
 */
public interface EnergyRelated {

	public boolean canHaveAsEnergy(EnergyAmount energy);
	public EnergyAmount getEnergy();
	public EnergyAmount getCapacity();
	
}
