package com.dhbw.mdse.ugly_project.lib;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.Before;
import org.junit.Test;

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

}
