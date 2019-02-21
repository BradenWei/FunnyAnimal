package com.singtel.assignment.funnyanimals.model;

import com.singtel.assignment.funnyanimals.base.Singable;

public class ParrotWithRooster extends Parrot {

	public ParrotWithRooster() {
		super();
		super.setSingable(new Singable(true, "Cock-a-doodle-doo"));
	}

}
