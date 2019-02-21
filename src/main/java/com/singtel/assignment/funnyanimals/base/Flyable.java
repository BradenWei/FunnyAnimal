package com.singtel.assignment.funnyanimals.base;

import com.singtel.assignment.funnyanimals.base.interfaces.Fly;

public class Flyable implements Fly {
	
	boolean whetherCanFly;
	

	public Flyable(boolean flyable) {
		super();
		this.whetherCanFly = flyable;
	}

	@Override
	public boolean isFlyable() {
		return this.whetherCanFly;
	}

}
