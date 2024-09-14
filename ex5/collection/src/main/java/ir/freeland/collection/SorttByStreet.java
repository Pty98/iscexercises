package ir.freeland.collection;

import java.util.Comparator;

import ir.freeland.collection.model.Product;

public class SorttByStreet implements Comparator<Person> {
	@Override
	public int compare(Person o1, Person o2) {
		return o1.getAddress().getstreet().compare to 
				(o2.getAddress().getstreet());
				
	}
}
