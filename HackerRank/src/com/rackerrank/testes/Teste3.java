package com.rackerrank.testes;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Teste3 {

	public static void main(String[] args) {
		int maxDigit = 6;
		List<Integer> list = IntStream.rangeClosed(1,maxDigit).boxed().collect(Collectors.toList());
		Collections.shuffle(list);
		System.out.println(list.subList(0, 3));
	}

}
