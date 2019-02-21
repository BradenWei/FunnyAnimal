package com.singtel.assignment.funnyanimals.model;

import com.singtel.assignment.funnyanimals.base.Singable;
import com.singtel.assignment.funnyanimals.base.Swimable;

public class Duck extends Bird {
	
	public Duck() {
		super();
		super.setSwimable(new Swimable(true));
		super.setSingable(new Singable(true, "Quack, quack"));
	}

}
