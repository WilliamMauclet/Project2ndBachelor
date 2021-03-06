package Inspectors;

import core.Entity;
import Auxiliary.Position;

/**
 * @author 	Brecht Gossel� & William Mauclet
 * 		   	2BiR: wtk-cws (Gossel�) en cws-elt(Mauclet)
 * @version	3.0
 */
public class RangeInspector implements Inspector {
	
	private Position lowerBound, upperBound;
	
	public RangeInspector(long minX, long maxX, long minY, long maxY){
		this.lowerBound = Position.returnUniquePosition(minX, minY);
		this.upperBound = Position.returnUniquePosition(maxX, maxY);
	}
	
	@Override
	public boolean inspect(Entity entity) {
		return Position.isInRange(lowerBound, upperBound, entity.getPosition());
	}

}
