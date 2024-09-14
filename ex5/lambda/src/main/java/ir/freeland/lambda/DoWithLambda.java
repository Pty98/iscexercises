package ir.freeland.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DoWithLambda {

	public static void main(String[] args) {

		// ********Simple print
		List<Person> persons = new ArrayList<>();
		persons.add(new Person("Parisa1",20,16));
		persons.add(new Person("Parisa2",21,13.5));
		persons.add(new Person("Parisa3",22,19));
		persons.add(new Person("Parisa4",23,8));
		persons.add(new Person("Parisa5",26,9));

		// ********Simple Print
		Map<String, Integer> ages = new HashMap<>();
		ages.put("Alireza", 48);
		ages.put("Roham", 10);
		ages.put("RohamSS", 0);
		ages.put("Arefeh", 15);
		ages.forEach((t, u) -> System.out
				.println("The " + t + " is " + u + " years old "));

		// ********make a filter
		List<String> names = Arrays.asList("Alireza", "Roham", "Arefeh",
				"Radmehr", "Rayan");
		List<String> namesStartWithA = names.stream()
				.filter(t -> t.startsWith("A")).collect(Collectors.toList());
		System.out.println(namesStartWithA);

		names.replaceAll(t -> t.toLowerCase());

		// ********convert items in list
		List<String> names2 = Arrays.asList("Alireza", "Roham", "Arefeh", "Radmehr", "Rayan");
		names2.replaceAll(t -> t.toLowerCase());// no stream is needed. no new
												// list is returned
		System.out.println(names);

		// ********sum
		List<Integer> values = Arrays.asList(3, 5, 8, 9, 12);
		int sum = values.stream().reduce(0, (i1, i2) -> i1 + i2);
		System.out.println(sum);

		// **** chain filter
		Person alireza = new Person("Alireza", "afattahi54@gmail.com", 48);
		Person roham = new Person("Roham", "roham@gmail.com", 10);
		Person arefeh = new Person("Arefeh", "arefeh@gmail.com", 15);

		List<Person> persons = new ArrayList<>();
		persons.add(alireza);
		persons.add(roham);
		persons.add(arefeh);

		persons.stream()
				.filter(t -> t.getName().startsWith("A"))
				.filter(t -> t.getAge() > 16)
				.forEach(t -> System.out.println(t.getName()));

		

		Comparator<Person> gradecomprator = Comparator.comparing(Person::getGrade);
				List<Person> sortedByAge =persons.stream().sorted(gradeComprator.reversed()).collect(Collectors.toList());
		

		// ****find average of age
		double averageAge = persons
					.stream()
					.mapToDouble(p -> p.getAge())
					.average()
					.getAsDouble();
		
		System.out.println(averageAge);

	}

}
