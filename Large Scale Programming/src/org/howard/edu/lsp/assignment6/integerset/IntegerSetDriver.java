package org.howard.edu.lsp.assignment6.integerset;
//import  org.howard.edu.lsp.assignment4.implementation.IntegerSet;
//import  org.howard.edu.lsp.assignment4.implementation.Listemptyexception;

/*
     * Driver Class to implement the methods in IntegerSet Class
     *  @author Elijah Afolabi
*/
import java.util.*;

public class IntegerSetDriver {
public static void main(String[] args) throws Listemptyexception {
	
ArrayList<Integer> list1= new ArrayList<>();
ArrayList<Integer> list2= new ArrayList<>();

// Making two instances of the class 
IntegerSet set1= new IntegerSet(list1);
IntegerSet set2= new IntegerSet(list2);

//Adding numbers to the sets

set1.add(1);
set1.add(2);
set1.add(3);
set1.add(4);
set1.add(5);
set2.add(2);
set2.add(4);
set2.add(6);
set2.add(8);
set2.add(10);
set2.add(12);

//Printing out results from test and manipulations
System.out.println("Set 1 : "+set1.getlist());
System.out.println("Length of Set 1 : "+set1.length());
System.out.println("Set 2 : "+set2.getlist());
System.out.println("Length of Set 2 : "+set2.length());
System.out.println("Is the set1 empty? "+set1.isEmpty());
System.out.println("Is the set2 empty? "+set2.isEmpty());
System.out.println("Are set 1 and set 2 equal : "+set1.equals(set2));
System.out.println("Is the number 4 in set 1: "+set1.contains(4));
System.out.println("Is the number 10 in set 2: "+set2.contains(10));
System.out.println("Is the number 6 in set 1: "+set1.contains(6));
System.out.println("Is the number 1 in set 2: "+set2.contains(1));
System.out.println("Smallest element in set1 : "+set1.smallest());
System.out.println("Largest element in set1 : "+set1.largest());
System.out.println("Smallest element in set2 : "+set2.smallest());
System.out.println("Largest element in set1 : "+set2.largest());

//New set to hold the union of the two sets 
IntegerSet UnionSet= set1.union(set2);
System.out.println("The Union of set 1 and set 2 : "+UnionSet.getlist() );

//Printing out results from sets
System.out.println("Set 1 : "+set1.getlist());
System.out.println("Set 2 : "+set2.getlist());
System.out.println("Removing 12 from set 2 ");
set2.remove(12);
System.out.println("Set 2 : "+set2.getlist());
System.out.println("Are set 1 and set 2 equal : "+set1.equals(set2));
//New set to hold the intersection of the two sets 
IntegerSet IntersectSet= set1.intersect(set2);
System.out.println("The Intersection of set 1 and set 2: "+IntersectSet.getlist() );

//Printing out results from sets
System.out.println("Set 1 : "+set1.getlist());
System.out.println("Set 2 : "+set2.getlist());

//clears content of set 2
set2.clear();
System.out.println("Set 2 after clear: "+set2.getlist());
System.out.println("Is the set1 empty? "+set1.isEmpty());
System.out.println("Checking for Largest element in set2 : ");
try {
System.out.println("Largest element in set2 : "+set2.largest());
}
catch(Listemptyexception e){
	
	System.out.println("Error occured here!!!!! The list is empty!!!!");
	}
System.out.println("Is the set2 empty? "+set2.isEmpty());

//Adding numbers to the sets
set2.add(5);
set2.add(4);
set2.add(3);
set2.add(2);
set2.add(1);

System.out.println("Set 1 : "+set1.getlist());
System.out.println("New Set 2 : "+set2.getlist());
System.out.println("Length of New Set 2 : "+set2.length());


System.out.println("Are set 1 and set 2 equal : "+set1.equals(set2));

//Checking if a number is in a certain set
System.out.println("Is the number 1 in set 2: "+set2.contains(1));

set1.clear();
System.out.println("Set 1 : "+set1.getlist());
System.out.println("Checking for Smallest element in set1 : ");
try {
System.out.println("Smallest element in set1 : "+set1.smallest());
}
catch(Listemptyexception e){
	
	System.out.println("Error occured here!!!!! The list is empty!!!!");
	}
	
};


}
