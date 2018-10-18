package com.dhbw.mdse.ugly_project;

import com.dhbw.mdse.ugly_project.lib.PrintMathFunctions;

public class App {

  public static void main(String[] args) {
    int var1 = 20;
    int var2 = 5;
    printCalculations(var1, var2);
  }

  private static void printCalculations(int var1, int var2) {
    PrintMathFunctions functions = new PrintMathFunctions();

    System.out.println("First Number: " + var1);
    System.out.println("Second Number: " + var2);
    functions.add(var1, var2);
    functions.subtract(var1, var2);
    functions.multiply(var1, var2);
  }
}
