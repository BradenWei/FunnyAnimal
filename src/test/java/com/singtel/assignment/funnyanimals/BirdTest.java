package com.singtel.assignment.funnyanimals;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.singtel.assignment.funnyanimals.model.Bird;

public class BirdTest {
	
	Bird bird;
	
	@Before
    public void setUp() {
        this.bird = new Bird();
    }

	
	@Test
	public void flyTest() {
		assertTrue(bird.isFlyable());
	}
	
	@Test
	public void walkTest() {
		assertTrue(bird.isWalkable());
	}
	
	@Test
	public void singTest() {
		assertTrue(bird.isSingable());
		assertEquals("Song", bird.makeSound());
	}

}
