package com.singtel.assignment.funnyanimals.base;

public class Animal {
	
	protected Walkable walkable = null;
    protected Flyable flyable = null;
    protected Singable singable = null;
    protected Swimable swimable = null;
    
	public void setWalkable(Walkable walkable) {
		this.walkable = walkable;
	}

	public void setFlyable(Flyable flyable) {
		this.flyable = flyable;
	}

	public void setSingable(Singable singable) {
		this.singable = singable;
	}

	public void setSwimable(Swimable swimable) {
		this.swimable = swimable;
	}

	public boolean isWalkable() {
		if(walkable == null) {
			return false;
		}
    	return walkable.isWalkable();
    }
    
    public boolean isFlyable() {
    	if(flyable == null) {
			return false;
		}
    	return flyable.isFlyable();
    }
    
    public boolean isSingable() {
    	if(singable == null) {
			return false;
		}
    	return singable.isSingable();
    }
    
    public String makeSound() {
    	if(singable == null) {
			return "";
		}
    	return singable.getSound();
    }
    
}
