package com.dhbw.mdse.ugly_project;

import com.dhbw.mdse.ugly_project.lib.MathFunctions;

public class App {
  public static void main(String[] args) {
    int var1 = 20;
    int var2 = 5;
    printCalculations(var1, var2);
  }

  private static void printCalculations(int var1, int var2) {
    MathFunctions functions = new MathFunctions();

    System.out.println("First Number: " + var1);
    System.out.println("Second Number: " + var2);
    System.out.println("Addition: " + functions.add(var1, var2));
    System.out.println("Subtraction: " + functions.subtract(var1, var2));
    System.out.println("Multiplication: " + functions.multiply(var1, var2));
  }
}
