package com.singtel.assignment.funnyanimals;

import com.singtel.assignment.funnyanimals.base.Animal;
import com.singtel.assignment.funnyanimals.model.Bird;
import com.singtel.assignment.funnyanimals.model.Butterfly;
import com.singtel.assignment.funnyanimals.model.Chicken;
import com.singtel.assignment.funnyanimals.model.Clownfish;
import com.singtel.assignment.funnyanimals.model.Dolphin;
import com.singtel.assignment.funnyanimals.model.Duck;
import com.singtel.assignment.funnyanimals.model.Fish;
import com.singtel.assignment.funnyanimals.model.Parrot;
import com.singtel.assignment.funnyanimals.model.Rooster;
import com.singtel.assignment.funnyanimals.model.Shark;

public class Solution {
	public static void main(String[] args) {
		countAnimals();
		
	}
	
	private static void countAnimals() {
		Animal[] animals = new Animal[]{
				new Bird(),
				new Duck(),
				new Chicken(),
				new Rooster(),
				new Parrot(),
				new Fish(),
				new Shark(),
				new Clownfish(),
				new Dolphin(),
				new Butterfly()
		};
		
		int flyers = 0;
		int swimer = 0;
		int walker = 0;
		int singer = 0;
		
		for(Animal animal : animals) {
			flyers += animal.isFlyable() ? 1 : 0;
			swimer += animal.isSwimable() ? 1 : 0;
			walker += animal.isWalkable() ? 1 : 0;
			singer += animal.isSingable() ? 1 : 0;
		}
		
		System.out.println("No. of flyable animals: " + flyers);
		System.out.println("No. of swimable animals: " + swimer);
		System.out.println("No. of walkable animals: " + walker);
		System.out.println("No. of singable animals: " + singer);
	}
}
