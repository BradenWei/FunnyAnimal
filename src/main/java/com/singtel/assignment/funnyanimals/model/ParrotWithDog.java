package com.singtel.assignment.funnyanimals.model;

import com.singtel.assignment.funnyanimals.base.Singable;

public class ParrotWithDog extends Parrot {

	public ParrotWithDog() {
		super();
		super.setSingable(new Singable(true, "Woof, woof"));
	}

}
