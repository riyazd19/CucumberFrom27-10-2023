package randaomProg;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import org.bouncycastle.util.Integers;

//import org.bouncycastle.util.Integers;

/**
 * @author Khan_Pc in this prog we are given with an array of integers with
 *         duplicate elements and we have to show elements as their occurance
 *         for eg arr[] arr= {1,1,1,2,2,2} op {1,3,2,3}
 *
 */
public class CountOccuranceOfEachInteger {
	public static void main(String[] args) {
		int n;
		System.out.println("give the uses the message to enter the duplicate elememnts in array");
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		int[] arr = new int[n];
		addingElememntsInArray(arr);
		// countDuplicate(arr);
		// displayArray(arr);

	}

	private static void addingElememntsInArray(int[] arr) {
		Scanner scan = new Scanner(System.in);
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();

		}
		displayArray(arr);

	}

	private static void countDuplicate(int[] arr) {
		Set<Integers> as= new HashSet<Integers>();
		for(int j=0;j<=arr.length;j++) {
			as.addAll(j);
		}
		
		
		int[] arr1 = new int[10];
		int x = 0;
		for (int i = 0; i <= arr.length; i++) {
			if (arr[0] == arr[1]) {
				x++;
				arr1[0] = arr[0];
				arr1[1] = x;

			}
		}
		displayArray(arr1);

	}

	private static void displayArray(int[] arr) {
		// TODO Auto-generated method stub
		System.out.println("{");
		for (int value : arr) {
			System.out.print(value);
			
			
		}
		System.out.print(",");
		System.out.print("}");

	}

}
