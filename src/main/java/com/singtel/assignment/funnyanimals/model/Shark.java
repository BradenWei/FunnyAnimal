package com.singtel.assignment.funnyanimals.model;

import com.singtel.assignment.funnyanimals.util.Color;
import com.singtel.assignment.funnyanimals.util.Size;

public class Shark extends Fish {
	
	private Size size;
	private Color color;

	public Shark() {
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
	
	public Fish getFood() {
		return new Fish();
	}

}
