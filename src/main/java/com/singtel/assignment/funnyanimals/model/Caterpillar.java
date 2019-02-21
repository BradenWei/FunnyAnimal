package com.singtel.assignment.funnyanimals.model;

import com.singtel.assignment.funnyanimals.base.Animal;
import com.singtel.assignment.funnyanimals.base.Walkable;

public class Caterpillar extends Animal {

	public Caterpillar() {
		super();
		super.setWalkable(new Walkable(true));
	}
	
	public Butterfly metamorphosis() {
		return new Butterfly();
	}

}
