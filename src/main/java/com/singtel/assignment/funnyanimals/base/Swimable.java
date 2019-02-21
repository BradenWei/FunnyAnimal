package com.singtel.assignment.funnyanimals.base;

import com.singtel.assignment.funnyanimals.base.interfaces.Swim;

public class Swimable implements Swim {

	boolean whetherCanSwim;
	

	public Swimable(boolean swimable) {
		super();
		this.whetherCanSwim = swimable;
	}

	@Override
	public boolean isSwimable() {
		return this.whetherCanSwim;
	}

}
