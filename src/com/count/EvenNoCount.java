package com.count;

public class EvenNoCount {

	public static void main(String[] args) {
		int count = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				count++;
			}
		}
		System.out.println("The total even numbers from 1 to 100 is:" + count);
	}
}
