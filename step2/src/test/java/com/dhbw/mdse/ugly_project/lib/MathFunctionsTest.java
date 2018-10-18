package com.dhbw.mdse.ugly_project.lib;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class MathFunctionsTest {

    private MathFunctions functions;

    @Before
    public void setup() {
        functions = new MathFunctions();
    }

    @Test
    public void add() {
        assertThat(functions.add(1, 2), is(3));
    }

    @Test
    public void subtract() {
        assertThat(functions.subtract(4,1 ), is(3));
    }

    @Test
    public void divide() {
        assertThat(functions.divide(4,1 ), is(4));
    }

    @Test
    public void multiply() {
        assertThat(functions.multiply(4, 1 ), is(4));
    }
}
