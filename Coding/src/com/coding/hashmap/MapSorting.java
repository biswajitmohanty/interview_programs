package com.coding.hashmap;


import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

//Sorting a map based on multiple values and collecting as a map
public class MapSorting {
	public static void main(String[] args) {
		Map<String, Employee> map = new HashMap<>();

		Employee employee1 = new Employee(1l, "Mher");
		map.put(employee1.getName(), employee1);
		Employee employee2 = new Employee(2l, "Annie");
		map.put(employee2.getName(), employee2);
		Employee employee3 = new Employee(8l, "John");
		map.put(employee3.getName(), employee3);
		Employee employee4 = new Employee(2l, "George");
		map.put(employee4.getName(), employee4);
		

		map.entrySet().stream().sorted(
				Map.Entry.comparingByValue(
						Comparator.comparingLong(Employee::getId).
						thenComparing(Employee::getName)
				)
		).forEach(System.out::println);
		
		Map<String, Employee> m = map.entrySet().stream().sorted(
				Map.Entry.comparingByValue(
						Comparator.comparingLong(Employee::getId).
						thenComparing(Employee::getName)
				)
		).collect(Collectors.toMap(
				Entry::getKey,
				Entry::getValue,
				(e1, e2) -> e2,
				LinkedHashMap::new
		));
		System.out.println(m);
		
	}
}
