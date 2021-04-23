package org.howard.edu.lsp.exam.question41;

import java.util.*;

public class ZeroRemover {

	static void removeZeroes(ArrayList<Integer> list) {
		for (int i=0; i<list.size(); i++)
		if(list.get(i)==0) {
		list.remove(i);
		i--;
		}
		}
		  
		
public static void main(String[] args) {
  

ArrayList<Integer> list = new ArrayList<Integer>();


list.add(0);
list.add(7);
list.add(2);
list.add(0);
list.add(0);
list.add(4);
list.add(0);


System.out.println("ArrayList "+list);
  
removeZeroes(list);

System.out.println("ArrayList after Zeroes: "+list);
}
}
