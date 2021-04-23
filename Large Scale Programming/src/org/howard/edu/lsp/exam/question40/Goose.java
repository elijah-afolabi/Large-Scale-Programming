package org.howard.edu.lsp.exam.question40;


public class Goose extends Animal implements Flying {



public Goose() {

super("Goose");

}

@Override

public void move() {

System.out.println("This " + getName() + " moves forward");

}

@Override

public void speak() {

System.out.println("This " + getName() + " speaks");

}

@Override

public void fly() {



}

}