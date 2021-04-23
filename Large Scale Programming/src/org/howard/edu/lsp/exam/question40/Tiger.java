package org.howard.edu.lsp.exam.question40;


	public class Tiger extends Animal {

	

		public Tiger() {

		super("Tiger");

		}

		@Override

		public void move() {

		System.out.println("This " + getName() + " moves forward");

		}

		@Override

		public void speak() {

		System.out.println("This " + getName() + " speaks");

		}

		}