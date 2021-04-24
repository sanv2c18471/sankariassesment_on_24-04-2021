package com.java1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Array {
public static void main(String[] args) {
	List <Integer> l= Arrays.asList(5,19,61,20,88);
	Predicate<Integer> even = (a) -> a%2==0;
	List<Integer> evenlist = l.stream().filter(even).collect(Collectors.toList());
	System.out.println("Even list: "+evenlist);
}
}
