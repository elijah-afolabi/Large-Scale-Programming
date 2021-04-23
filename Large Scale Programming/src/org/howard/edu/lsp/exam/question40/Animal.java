package org.howard.edu.lsp.exam.question40;


public abstract class Animal {

private final String name; 


public Animal() {

this.name = "Animal";

}


public Animal(String name) {

this.name = name;

}

public String getName() {

return name;

}

public void move() {

System.out.println("This " + this.name + " moves forward");

}

public void speak() {

System.out.println("This " + this.name + " speaks");

}

}