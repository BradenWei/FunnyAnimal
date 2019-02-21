package com.singtel.assignment.funnyanimals.model;

import com.singtel.assignment.funnyanimals.base.Animal;
import com.singtel.assignment.funnyanimals.base.Swimable;

public class Fish extends Animal {

	public Fish() {
		super();
		super.setSwimable(new Swimable(true));
	}

}
