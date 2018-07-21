package com.canecat.sample_app_java;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple application.
 */
public class AppTest extends TestCase {

    /**
     * Create the test case
     *
     * @param testName is the name of the test case
     */
    public AppTest( String testName ) {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite() {
        return new TestSuite( AppTest.class );
    }

    /**
     * Test example, checking nothing.
     */
    public void testApp() {
        assertTrue( false );
    }
}