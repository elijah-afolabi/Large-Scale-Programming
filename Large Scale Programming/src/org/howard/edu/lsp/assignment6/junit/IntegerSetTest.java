import package org.howard.edu.lsp.assignment6.integerset;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Collections;

import org.junit.jupiter.api.Test;

class IntegerSetTest {
public ArrayList<Integer> list= new ArrayList<>();

	
	
	@Test
	public void testLength() {
		   ArrayList <Integer> list = new ArrayList<>();
		    assertEquals(0, list.size());
		    list.add(42);
		    assertEquals(1, list.size());
		    list.add(2);
		    assertEquals(2, list.size());
		    list.add(17);
		    assertEquals(3, list.size());
		    list.add(99);
		    assertEquals(4, list.size());
		    list.add(23);
		    assertEquals(5, list.size());
		}
	
	@Test
	public void testClear() {
		ArrayList <Integer> list = new ArrayList<>();
		list.add(42);
		list.add(2);
		assertEquals(2, list.size());
		list.clear();
		assertEquals(0, list.size());
	}
	
	@Test
	public void testEquals() {
	ArrayList <Integer> list1= new ArrayList<>();
	ArrayList <Integer> list2 = new ArrayList<>();
	list1.add(1);
	list1.add(2);
	list1.add(3);
	list1.add(4);
	Collections.sort(list1);
	list2.add(4);
	list2.add(3);
	list2.add(2);
	list2.add(1);
	//list2.add(5);
	Collections.sort(list2);
	assertTrue(list1.size() == list2.size() && list1.containsAll(list2) && list2.containsAll(list1));{	
	
	}
	
}
}
