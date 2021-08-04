package com.functionalProgramming;
import java.util.Scanner;

   public class Distance {
   public static void main (String[] args) {
	double distance=0;
	Scanner scanner = new  Scanner (System.in);
	System.out.println("Enter value of x:: ");
	double x = scanner.nextInt();
	System.out.println("Enter value of y:: ");
	double y = scanner.nextInt();
	double a = Math.pow(x,x);
	double b = Math.pow(x,x);
	double c = a+b;
	distance = Math.sqrt(c);
	System.out.println(":: " +distance);		
   }
 }
