package LabIngswProvaIntermedia;


import java.util.Collections;

import java.util.List;

public class MyListUtil {
	
	public String scegliLista(List<Integer> l, int scelta) {
		if(l.isEmpty()) {
			return "La lista è vuota";
		}
		
		if(scelta == 0 ) {
			Collections.sort(l);
			for(Integer i: l) {
				System.out.println(i);
			}
			
			return "La lista è stata ordinata in modo crescente ";
		}
		else if(scelta == 1) {
			Collections.sort(l,Collections.reverseOrder());
			
		}
		for(Integer i: l) {
			System.out.println(i);
		}	
		return "La lista è stata ordinata in modo decrescente ";
				
	}
	

	
	

	

	

	
	
		
	
}
