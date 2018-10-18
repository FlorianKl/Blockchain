package com.dhbw.mdse.ugly_project.lib;

import java.io.PrintStream;

/**
 * Class to perform basic math operations
 * and print them by default to standard out.
 */
public class PrintMathFunctions {

  /**
   * outputStream.
   */
  private final PrintStream printStream;

  /**
   * Constructor.
   */
  public PrintMathFunctions() {
    this.printStream = System.out;
  }

  /**
   * Constructor to replace the use output stream.
   *
   * @param outputStream stream which is used for output
   */
  public PrintMathFunctions(final PrintStream outputStream) {
    this.printStream = outputStream;
  }

  /**
   * Adds the two provided values.
   *
   * @param var1 first input value
   * @param var2 second input value
   */
  public final void add(final int var1, final int var2) {
    int result = var1 + var2;
    printStream.println("Addition: " + result);
  }

  /**
   * Subtracts var2 from var1.
   *
   * @param var1 first input value
   * @param var2 second input value
   */
  public final void subtract(final int var1, final int var2) {
    int result = var1 - var2;
    printStream.println("Subtraction: " + result);
  }

  /**
   * Divides var1 by var2.
   *
   * @param var1 first input value
   * @param var2 second input value
   */
  public final void divide(final int var1, final int var2) {
    int result = var1 / var2;
    printStream.println("Division: " + result);
  }

  /**
   * Multiplies the two provided values.
   *
   * @param var1 first input value
   * @param var2 second input value
   */
  public final void multiply(final int var1, final int var2) {
    int result = var1 * var2;
    printStream.println("Multiplication: " + result);
  }
}
