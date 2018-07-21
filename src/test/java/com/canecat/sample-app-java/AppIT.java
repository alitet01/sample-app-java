package com.canecat.sample_app_java;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.StandardOutputStreamLog;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

/**
 * Integration test for simple application.
 * Uses system-rules, JUnit extension for test System.out and System.exit()
 */
public class AppIT {

    @Rule
    public final StandardOutputStreamLog out = new StandardOutputStreamLog();

    /**
     * The test verifies complete program by checking the output.
     */
    @Test
    public void doAppIT_Test() {
        String[] args = {""};
        MainClass.main(args);

        assertThat(out.getLog(), is(equalTo(MainClass.ABOUT + "\n")));
    }

}
