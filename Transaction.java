/**
 * 
 */
package com.greatlearning.Lab2;

import java.util.FormatFlagsConversionMismatchException;
import java.util.Scanner;

/**
 * @author RAVI
 *
 */
public class Transaction {

	/**
	 * 
	 */
	public Transaction() {
		// TODO Auto-generated constructor
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("\n Please enter the size of transaction array");
		int size = sc.nextInt();
		int array[] = new int[size];

		System.out.println("\n Please enter the value of array");
		int i;
		for (i = 0; i < size; i++) {
			array[i] = sc.nextInt();
		}
		System.out.println("\n Enter the total number of targets that need to be achieved");
		int targetNo = sc.nextInt();
		while (targetNo-- != 0) {
			int Flag = 0;
			int target;

			System.out.println("\n Enter the value of Target");
			target = sc.nextInt();
			int sum = 0;
			for (i = 0; i < size; i++) {
				sum += array[i];
				if (sum >= target) {
					System.out.println("\n Target achieved after: " + (i + 1) + " transaction");
					Flag = 1;
					break;
				}
			}
			if (Flag == 0) {
				System.out.println("\n Given Target is not achieved");
			}
		}
		
	}

}
