package com.singtel.assignment.funnyanimals.base;

public class Animal {
	
	protected Walkable walkable;
    protected Flyable flyable;
    protected Singable singable;
    

    public Animal(Walkable walkable, Flyable flyable, Singable singable) {
		this.walkable = walkable;
		this.flyable = flyable;
		this.singable = singable;
	}

	public boolean isWalkable() {
    	return walkable.isWalkable();
    }
    
    public boolean isFlyable() {
    	return flyable.isFlyable();
    }
    
    public boolean isSingable() {
    	return singable.isSingable();
    }
    
    public String makeSound() {
    	return singable.getSound();
    }
    
}
