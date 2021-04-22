package org.howard.edu.lsp.exam.question41;



import java.util.ArrayList;
import java.util.Arrays;


public class ZeroRemoverDriver {


		public static void main(String[] args) {
			// TODO Auto-generated method stub
			ArrayList<Integer> al = //(ArrayList<Integer>) //Arrays.asList(0, 7, 2, 0, 0, 4, 0);
					new ArrayList<Integer>();
			
			al.add(0);
			al.add(7);
			al.add(2);
			al.add(0);
			al.add(0);
			al.add(4);
			al.add(0);
			System.out.print(al);
		      // Collections.ddAll(al.as)
			ZeroRemover.ZeroRemover(al);
		       //cool(al);
		       System.out.print(al);
		}

	}

