package org.howard.edu.lsp.exam.question40;

public class Driver {



	public static void main(String[] args) {


	Animal animal = new Goose();

	animal.move();

	animal.speak();

	System.out.println();



	Animal animal2 = new Tiger();

	animal2.move();

	animal2.speak();

	System.out.println();


	Flying flying = new Goose();

	flying.fly();


	flying = new Airplane();

	flying.fly();

	}

}