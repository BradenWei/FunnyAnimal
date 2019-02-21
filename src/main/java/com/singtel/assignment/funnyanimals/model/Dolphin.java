package com.singtel.assignment.funnyanimals.model;

import com.singtel.assignment.funnyanimals.base.Animal;
import com.singtel.assignment.funnyanimals.base.Swimable;

public class Dolphin extends Animal {

	public Dolphin() {
		super();
		super.setSwimable(new Swimable(true));
	}

}
