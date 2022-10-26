package com.BridgeLabz.Day3PracticeProblem;

public class OddPositionElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = new int [] {10, 20, 30, 50, 60}; //Initialize array
		
		System.out.println("Elements of an array present on an even position : ");
		
		for (int i=0; i< arr.length; i=i+2) {  
            System.out.println(arr[i]);  
        } 

	}

}
