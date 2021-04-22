package org.howard.edu.lsp.exam.question41;
import java.util.*;

public class ZeroRemover {

	public ArrayList<Integer> list;

	
	
	public  static  ArrayList<Integer> ZeroRemover(ArrayList<Integer> list) {
		
		//this.list=list;
		for (int i=0; i<list.size(); i++) {
			if(list.get(i)== 0) {
				list.remove(0);
				
			}
}
	return list;

			}



		

}
