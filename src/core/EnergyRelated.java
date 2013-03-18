package core;

import Auxiliary.EnergyAmount;

/**
 * @author 	Brecht J.J. Gossel� & William E.R.J. Mauclet
 * 			2BiR: wtk-cws (Gossel�) en cws-elt(Mauclet)
 * @version	3.0
 */
public interface EnergyRelated {

	public boolean canHaveAsEnergy(EnergyAmount energy);
	public EnergyAmount getEnergy();
	public EnergyAmount getCapacity();
	
}
