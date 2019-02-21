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
	void flyTest() {
		assertTrue(bird.isFlyable());
	}
	
	@Test
	void walkTest() {
		assertTrue(bird.isWalkable());
	}
	
	@Test
	void singTest() {
		assertTrue(bird.isSingable());
		assertEquals("Song", bird.makeSound());
	}

}
