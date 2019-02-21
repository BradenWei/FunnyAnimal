package com.singtel.assignment.funnyanimals.model;

import com.singtel.assignment.funnyanimals.base.Flyable;
import com.singtel.assignment.funnyanimals.base.Singable;

public class Chicken extends Bird {
	
	public Chicken() {
		super();
		super.setSingable(new Singable(true, "Cluck, cluck"));
		super.setFlyable(new Flyable(false));
	}

}
