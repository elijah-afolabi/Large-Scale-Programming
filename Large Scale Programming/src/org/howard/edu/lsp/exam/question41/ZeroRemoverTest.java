package org.howard.edu.lsp.exam.question41;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class ZeroRemoverTest {

	@Test
	public void testRemoveZeroes() {
		
		ZeroRemover zeroRemover = new ZeroRemover();
	 ArrayList <Integer> list = new ArrayList<>();
	 
	 assertEquals(0, list.size());
	  list.add(0);
	  list.add(0);
	  list.add(0);
	  list.add(5);
	  list.add(7);
	  list.add(0);
	  zeroRemover.removeZeroes(list);
	  assertTrue(list.size() == 2);
		
	}
}
