package com.singtel.assignment.funnyanimals.model;

import com.singtel.assignment.funnyanimals.base.Singable;

public class Rooster extends Chicken {

	public Rooster() {
		super();
		super.setSingable(new Singable(true, "Cock-a-doodle-doo"));
	}

}
