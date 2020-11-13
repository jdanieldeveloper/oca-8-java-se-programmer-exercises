package com.troytech.oca11.part2;


/**
 * What is the result?
 *
 *
 * A. Red 0 Orange 0 Green 3
 * B. Red 0 Orange 0 Green 6
 * C. Red 0 Orange 1
 * D. Green 4
 * E. Compilation fails
 *
 *
 * Answer: E
 *
 */


class Test {
	int sum = 0;
	public void doCheck(int number){
		if(number % 2 == 0){
			break;
		} else {
			for(int i = 0; i < number; i++){
				sum += i;
			}
		}
	}
}

public class Q5 {

	public static void main(String[] args) {
		Test obj = new Test();
		System.out.print("Red " + obj.sum);
		obj.doCheck(2);
		System.out.print("Orange " + obj.sum);
		obj.doCheck(3);
		System.out.print("Green " + obj.sum);
	}
}