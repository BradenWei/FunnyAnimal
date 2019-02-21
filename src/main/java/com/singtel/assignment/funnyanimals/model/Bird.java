package com.singtel.assignment.funnyanimals.model;

import com.singtel.assignment.funnyanimals.base.Animal;
import com.singtel.assignment.funnyanimals.base.Flyable;
import com.singtel.assignment.funnyanimals.base.Singable;
import com.singtel.assignment.funnyanimals.base.Walkable;

public class Bird extends Animal {
	
	public Bird() {
		super(new Walkable(true), new Flyable(true), new Singable(true, "song"));
	}

	public Bird(Flyable flyable, Singable singable) {
		super(new Walkable(true), flyable, singable);
	}
	
}
