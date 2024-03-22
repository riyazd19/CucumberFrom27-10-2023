package randaomProg;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import org.bouncycastle.util.Integers;

public class ArrayToCollections {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter no of elements in array");
		Integer n = scan.nextInt();
		Integer[] arr = new Integer[n];
		insertElements(arr);
		displayElements(arr);
		puttingElementsInCollection(arr);
		System.out.println("after set interface");
		displayElements(arr);

	}

	private static void puttingElementsInCollection(Integer[] arr) {
		// TODO Auto-generated method stub
		Set<Integer> s = new HashSet<>();
		s=Arrays.asList(arr);
		System.out.println("in set");
		for(Integer value: s) {
		
			System.out.println(value);
		}

	}

	private static void displayElements(Integer[] arr) {
		// TODO Auto-generated method stub
		for (Integer value : arr) {
			System.out.println(value);
		}

	}

	private static void insertElements(Integer[] arr) {

		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		// TODO Auto-generated method stub

	}

}
