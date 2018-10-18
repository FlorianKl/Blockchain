package com.dhbw.mdse.ugly_project.lib;


import org.junit.Before;
import org.junit.Test;
import org.mockito.ArgumentCaptor;

import java.io.PrintStream;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;


public class PrintMathFunctionsTest {

    private PrintMathFunctions functions;
    private PrintStream systemOutMock;

    @Before
    public void setup() {
        systemOutMock = mock(PrintStream.class);
        functions = new PrintMathFunctions(systemOutMock);
    }

    @Test
    public void add() {
        functions.add(1, 2);
        verifyOutput("3");
    }

    @Test
    public void subtract() {
        functions.subtract(5, 1);
        verifyOutput("4");
    }

    @Test
    public void divide() {
        functions.divide(10, 2);
        verifyOutput("5");
    }

    @Test
    public void multiply() {
        functions.multiply(10, 2);
        verifyOutput("20");
    }


    private void verifyOutput(final String contains) {
        ArgumentCaptor<String> captor = ArgumentCaptor.forClass(String.class);
        verify(systemOutMock).println(captor.capture());
        captor.getValue().contains(contains);
    }
}
