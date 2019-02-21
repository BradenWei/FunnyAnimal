package com.singtel.assignment.funnyanimals.model;

import com.singtel.assignment.funnyanimals.util.Color;
import com.singtel.assignment.funnyanimals.util.Size;

public class Clownfish extends Fish {
	
	private Size size;
	private Color color;

	public Clownfish() {
		super();
		this.size = Size.LARGE;
		this.color = Color.GREY;
	}
	
	public Size size() {
		return size;
	}
	
	public Color color() {
		return color;
	}
	
	public boolean makeJoke() {
		return true;
	}

}
