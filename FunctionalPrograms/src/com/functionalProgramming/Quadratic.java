package com.functionalProgramming;
import java.util.Scanner;

   public class Quadratic {
   public static void main (String[] args) {
	double root1=0; 
	double root2=0;
	Scanner scanner = new  Scanner (System.in);
	System.out.println("Enter value of a:: ");
	double a = scanner.nextInt();
	System.out.println("Enter value of b:: ");
	double b = scanner.nextInt();
	System.out.println("Enter value of c:: ");
	double c = scanner.nextInt();
	double delta = ((b*b) -(4*a*c));
	System.out.println("Delta:: " +delta);
	int val1 = (int) Math.sqrt(delta);
	root1 = (-b+val1)/(2*a);
	System.out.println("Root1:: " +root1);
	root2 = (-b-val1)/(2*a);
	System.out.println("Root1:: " +root2);
    }
  }
