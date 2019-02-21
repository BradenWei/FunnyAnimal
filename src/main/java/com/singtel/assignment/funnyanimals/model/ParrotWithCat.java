package com.singtel.assignment.funnyanimals.model;

import com.singtel.assignment.funnyanimals.base.Singable;

public class ParrotWithCat extends Parrot {

	public ParrotWithCat() {
		super();
		super.setSingable(new Singable(true, "Meow"));
	}

}
