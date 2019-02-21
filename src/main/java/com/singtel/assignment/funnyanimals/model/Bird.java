package com.singtel.assignment.funnyanimals.model;

import com.singtel.assignment.funnyanimals.base.Animal;
import com.singtel.assignment.funnyanimals.base.Flyable;
import com.singtel.assignment.funnyanimals.base.Singable;
import com.singtel.assignment.funnyanimals.base.Walkable;

public class Bird extends Animal {
	
	public Bird() {
		super();
		super.setFlyable(new Flyable(true));
		super.setSingable(new Singable(true, "Song"));
		super.setWalkable(new Walkable(true));		
	}

}
