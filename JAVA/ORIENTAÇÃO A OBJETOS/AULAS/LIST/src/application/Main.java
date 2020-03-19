package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<>();
		
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		list.add(2, "Marcos");
		
		System.out.println(list.size());
		System.out.println("====================");
		for (String x : list) {
			System.out.println(x);
		}
		System.out.println("====================");
		list.removeIf(x -> x.charAt(0) == 'M');  // PEGAR UM VALOR X E RETORNAR SE O FALOR É IGUAL A M (VERDADEIRO OU FALSO)
		for (String x : list) {
			System.out.println(x);
		}
		System.out.println("====================");
		System.out.println("Index of Bob: " + list.indexOf("Bob"));
		System.out.println("====================");
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());	
		
		for (String x : result) {
			System.out.println(x);
		}
		
		System.out.println("====================");
		String name = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
		
		System.out.println(name);
	}

}
