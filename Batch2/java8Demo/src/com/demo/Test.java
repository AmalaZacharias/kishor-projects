package com.demo;

import java.util.Arrays;
import java.util.List;

@FunctionalInterface
	 interface Add
	 {
	     public int getSum(int a,int b);
	     
	 }
	 public class Test {
	     public static void main(String[] args) {
	         // TODO Auto-generated method stub
	    	 List<String> words = Arrays.asList("hi", "hello", "hola", "bye", "goodbye", "adios");
	        words.forEach(System.out::println);
	         
	     }
	 }



