package com.singtel.assignment.funnyanimals.base;

import com.singtel.assignment.funnyanimals.base.interfaces.Sing;

public class Singable implements Sing {
	
	boolean whetherCanWalk;
	String sound = "";
	

	public Singable(boolean singable, String sound) {
		this.whetherCanWalk = singable;
		this.sound = sound;
	}

	@Override
	public boolean isSingable() {
		return this.whetherCanWalk;
	}

	@Override
	public String getSound() {
		return sound;
	}
	

}
