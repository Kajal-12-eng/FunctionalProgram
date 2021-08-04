package com.functionalProgramming;
import java.util.Scanner;
public class Array_2D {
	
   public static void main (String[] args) {
	//Integer i1[][]= new Integer[r][c];
	int arr[][] = null;
	double arr1[][];
	//boolean [];
	int i;
	Scanner scanner = new  Scanner (System.in);
	System.out.println("What array needs to generate:: ");
	int a = scanner.nextInt();
	System.out.println("Enter number of row:: ");
	double r = scanner.nextInt();
	System.out.println("Enter number of coloum:: ");
	double c = scanner.nextInt();
	//System.out.println("Enter value:: ");
	//int value = scanner.nextInt();
	//double value1= scanner.nextInt();
	//String value2 = scanner.next();
	switch (a) {
	case 1:
		System.out.println("creating integer 2D array");
		for (i=0; i<=r; i++ ) {
			for (int j=0; j<=c; j++) {
				int value = scanner.nextInt();
				System.out.println("arr[" + i + "][" + j + "] = "
                        + value);
			}
			
		}
		System.out.println("Done");
		break;
	case 2:
		System.out.println("creating boolean 2D array");
		for (i=0; i<=r; i++ ) {
			for (int j=0; j<=c; j++) {
				double value1 = scanner.nextInt();
				System.out.println("arr[" + i + "][" + j + "] = "
                        + value1);
			}	
		}
		System.out.println("Done");
		break;
	case 3:
		System.out.println("creating boolean 2D array");
		for (i=0; i<=r; i++ ) {
			for (int j=0; j<=c; j++) {
				String value2 = scanner.next();
				System.out.println("arr[" + i + "][" + j + "] = "
                        + value2);
			}	
		}
		System.out.println("Done");
		break;
   	default:
		System.out.println("Invalid choice");
	}
  }
}
