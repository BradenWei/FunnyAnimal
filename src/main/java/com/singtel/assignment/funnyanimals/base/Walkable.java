package com.singtel.assignment.funnyanimals.base;

import com.singtel.assignment.funnyanimals.base.interfaces.Walk;

public class Walkable implements Walk {
	
	boolean whetherCanWalk;
	

	public Walkable(boolean walkable) {
		this.whetherCanWalk = walkable;
	}

	@Override
	public boolean isWalkable() {
		return this.whetherCanWalk;
	}

}
