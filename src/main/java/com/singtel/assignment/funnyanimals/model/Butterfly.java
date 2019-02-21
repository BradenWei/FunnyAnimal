package com.singtel.assignment.funnyanimals.model;

import com.singtel.assignment.funnyanimals.base.Animal;
import com.singtel.assignment.funnyanimals.base.Flyable;

public class Butterfly extends Animal {

	public Butterfly() {
		super();
		super.setFlyable(new Flyable(true));
	}

}
