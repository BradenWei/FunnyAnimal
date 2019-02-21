package com.singtel.assignment.funnyanimals;

import com.singtel.assignment.funnyanimals.model.Bird;

public class Solution {
	public static void main(String[] args) {
		Bird bird = new Bird();
		
		bird.isWalkable();
		
		bird.isFlyable();
		
		if(bird.isSingable()) {
			bird.makeSound();
		}
		
	}
}
