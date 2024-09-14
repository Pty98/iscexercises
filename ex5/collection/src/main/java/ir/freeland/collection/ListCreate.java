package ir.freeland.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import ir.freeland.collection.model.Person;

public class ListCreate {
	public static void main(String[] args) {

		Address address1 = new Address ("st1","ci1","co1");
		Address address2 = new Address ("st2","ci2","co2");
		Address address1 = new Address ("st3","ci3","co3");
		
		Person parisa = new Person("parisa","tyr",25,address1);
		Person parsa = new Person("parsa","tyrk",5,address2);
		Person anisa = new Person("anisa","tyrks",28,address3);
		
		//Solution 1
		List persons = new ArrayList();		
		persons.add(parisa);
		persons.add(parsa);
		persons.add(anisa);
		
		
		
		persons.size();
			
		
		persons.remove(0);
		
		persons.clear();
		
		Person sara = new Person( "Sara", "rad", 12,address3);
		System.out.println(customers.contains(radmeher)); 
		
		Person dara = new Person("Dara", "Amiri" , 30, address2);
		System.out.println ( customers.indexOf(dara) ) ; 
		
        Collections.sort(persons, new SortByStreet());
		
		int found = Collections.binarySearch(persons, parisa);
		System.out.println( products.get(found) );
		
	}
}
