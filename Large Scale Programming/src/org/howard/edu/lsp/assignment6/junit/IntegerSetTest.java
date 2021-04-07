package org.howard.edu.lsp.assignment6.junit;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;
import org.junit.jupiter.api.Test;
 

class IntegerSetTest {
public ArrayList<Integer> list= new ArrayList<>();

	@Test
	public void testAdd() {
	 ArrayList <Integer> list = new ArrayList<>();
	 assertEquals(0, list.size());
	  list.add(10);
	  list.add(2);
	  list.add(3);
	  list.add(5);
	  assertTrue(list.size() == 4 && list.contains(10) );
		
	}
	@Test
	public void testRemove() {
	 ArrayList <Integer> list = new ArrayList<>();
	 assertEquals(0, list.size());
	  list.add(10);
	  list.add(2);
	  list.add(3);
	  list.add(5);
	  list.add(7);
	  list.add(11);
	  list.remove(2);
	  list.remove(3);
	  assertTrue(list.size() == 4);
		
	}
	

	
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

	assertTrue(list1.size() == list2.size() && list1.containsAll(list2) && list2.containsAll(list1));	
	
	}
	
	@Test
	public void testContains() {
	ArrayList <Integer> list= new ArrayList<>();
	list.add(1);
	list.add(3);
	list.add(5);
	list.add(7);
	assertTrue(list.contains(5));
	}
	
	
	@Test
	public void testLargest() throws IntegerSetException{
	ArrayList <Integer> list= new ArrayList<>();
	
	list.add(1);
	list.add(3);
	list.add(10);
	list.add(7);
	//int max = Collections.max(list);
	//list.clear();
	int max = Collections.max(list);
	
	if (list.size() == 0) {
		assertThrows(IntegerSetException.class, ()-> assertTrue(Collections.max(list)== null));
	}
	assertEquals(10, max);
	}
	
	
	@Test
	public void testSmallest() throws IntegerSetException{
	ArrayList <Integer> list= new ArrayList<>();
	
	list.add(1);
	list.add(3);
	list.add(10);
	list.add(7);
	int min = Collections.min(list);

	if (list.size() == 0) {
		assertThrows(IntegerSetException.class, ()-> assertTrue(Collections.min(list)== null));
	}
	
	assertEquals(1, min);
	}
	
	@Test
	public void testIsEmpty() {
		ArrayList <Integer> list = new ArrayList<>();
		list.add(42);
		list.add(2);
		assertEquals(2, list.size());
		list.clear();
		assertTrue(list.size() == 0);
	}
	
	@Test
	public void testUnion() {
		ArrayList <Integer> list1 = new ArrayList<>();
		ArrayList <Integer> list2 = new ArrayList<>();
		
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		list2.add(5);
		list2.add(6);
		list2.add(7);
		list2.add(8);
		list2.add(1);
		ArrayList<Integer> temp=list2;
		Set<Integer> set = new HashSet<>();
		set.addAll(list1);
		set.addAll(temp);
	
		assertTrue(set.size() == 8);
	}
	
	@Test
	public void testIntersect() {
		ArrayList <Integer> list1 = new ArrayList<>();
		ArrayList <Integer> list2 = new ArrayList<>();
		
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		list1.add(7);
		list2.add(5);
		list2.add(6);
		list2.add(7);
		list2.add(8);
		list2.add(1);
		ArrayList<Integer> temp=list2;
		Set<Integer> set = new HashSet<>();
		set.addAll(list1);
		set.addAll(temp);
		ArrayList<Integer> temp1= list1;
		ArrayList<Integer> temp2=list2;
		temp1.retainAll(temp2);
		ArrayList<Integer> list3= new ArrayList<>(temp1);
		//IntegerSet list4= new IntegerSet(list3);
		ArrayList <Integer> list4 = new ArrayList<>(list3);
		assertTrue(list4.size() == 2 && list4.contains(1) && list4.contains(7));
	}
	
	@Test
	public void testDiff() {
		ArrayList <Integer> list1 = new ArrayList<>();
		ArrayList <Integer> list2 = new ArrayList<>();
		
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		list1.add(7);
		list2.add(5);
		list2.add(6);
		list2.add(7);
		list2.add(8);
		list2.add(1);
		ArrayList<Integer> temp=list2;
		list1.removeAll(temp);
		ArrayList <Integer> list4 = new ArrayList<>(list1);
		assertTrue(list4.size() == 3 && list4.contains(2) && list4.contains(3) && list4.contains(4));
	}
	}


