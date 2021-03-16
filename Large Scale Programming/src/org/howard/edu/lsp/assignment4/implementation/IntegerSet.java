package org.howard.edu.lsp.assignment4.implementation;


import java.util.*;
/**
 *  The class contains all the methods that manipulates(performs different operations on) sets
 * @author Elijah Afolabi
 *
 */
public class IntegerSet{
	
private ArrayList<Integer> list= new ArrayList<>();
/**
 * 
 * @param list Creates an Arraylist
 */
public IntegerSet(ArrayList list) {
this.list=list;
}

/**
 * Clears the internal representation of the set
 */
public void clear() {
list.clear();
}

/**
 *  Returns the length of set
 */
public int length() {
return list.size();
}// returns the length


/**
 * 
 * @param b The lists being compared
 * @return  Returns true if the 2 sets are equal, false otherwise
 * Two sets are equal if they contain all of the same values in ANY order.
 */
public boolean equals(IntegerSet b) {
ArrayList<Integer> list2=b.list;
if(list.size()!=list2.size()) {
return false;
}
ArrayList<Integer> temp1=list;
ArrayList<Integer> temp2=list2;
Collections.sort(temp1);
Collections.sort(temp2);
for(int i=0;i<temp1.size();i++) {
if(temp1.get(i)!=temp2.get(i)) {
return false;
}
}
return true;
}
/**
 * 
 * @param value  The value being checked if it is contained in the set
 * @return Returns true if the set contains the value, otherwise false
 */

public boolean contains(int value) {
	
	boolean result = list.contains(value);
	
	return result;
}; 
/**
 *   Returns true if set is empty, false otherwise
 */
 public boolean isEmpty() {
	
	boolean result=list.isEmpty();
	
	return result;
	
}; 


/**
 * 
 * @return Returns the Largest item in the set;
 * @throws Listemptyexception Throws a IntegerSetException if the set is empty
 */
public int largest() throws Listemptyexception {
if(list.size()==0) {
Listemptyexception e= new Listemptyexception();
throw e;
}
int max=0;
for(int i=0;i<list.size();i++) {
if(list.get(i)>max) {
max=list.get(i);
}
}
return max;
}

/**
 * 
 * @return Returns the smallest item in the set;
 * @throws Listemptyexception Throws a IntegerSetException if the set is empty
 */
public int smallest() throws Listemptyexception {
if(list.size()==0) {
Listemptyexception e= new Listemptyexception();
throw e;
}
int min=Integer.MAX_VALUE;
for(int i=0;i<list.size();i++) {
if(list.get(i)<min) {
min=list.get(i);
}
}
return min;
}


/**
 * 
 * @param item Adds an item to the set or does nothing it already there	
 */
public void add(int item ) {
boolean exist=false;
for(int i=0;i<list.size();i++) {
if(list.get(i)==item) {
exist=true;
}
}
if(exist==false) {
list.add(item);
}
}
/**
 * 
 * @param item Removes an item from the set or does nothing if not there
 */
public void remove(int item ) {
for(int i=0;i<list.size();i++) {
if(list.get(i)==item) {
list.remove(i);
}
}
}
/**
 * 
 * @param list2 Second list/set
 * @return Set union
 */
public IntegerSet union(IntegerSet list2) {
ArrayList<Integer> temp=list2.getlist();
Set<Integer> set = new HashSet<>();
set.addAll(list);
set.addAll(temp);
ArrayList<Integer> list3= new ArrayList<>(set);
IntegerSet list4= new IntegerSet(list3);
return list4;
}
/**
 
 * @param list2  Second list/set
 * @return   Set intersection
 */
public IntegerSet intersect(IntegerSet list2) {
ArrayList<Integer> temp1= new ArrayList(list);
ArrayList<Integer> temp2=list2.getlist();
temp1.retainAll(temp2);
ArrayList<Integer> list3= new ArrayList<>(temp1);
IntegerSet list4= new IntegerSet(list3);
return list4;
}

/**

 * @param list2  Second list/set
 * @return   Set difference, i.e., s1 – s2
 */
public IntegerSet diff (IntegerSet list2) {
ArrayList<Integer> temp=list2.getlist();
//Remove all elements in list2 from list
list.removeAll(temp);
IntegerSet list4= new IntegerSet(list);
return list4;
}

/**
 *   Returns the list
 *   Gets the list
 */
public ArrayList<Integer> getlist(){
return list;
}
}