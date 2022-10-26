package com.BridgeLabz.Day3PracticeProblem;

public class DuplicateElementsInArray {

	public static void main(String[] args) {

        int array[] = { 10, 20, 30, 40, 50, 60, 10, 20, 30};

        System.out.println("Duplicate Array Element :");

        for (int i = 0; i < array.length; i++) {

            for (int j = i + 1; j < array.length; j++) {

                if (array[i] == array[j]) {

                    System.out.print(array[j] + " ");




                }

            }

        }
	}
 }