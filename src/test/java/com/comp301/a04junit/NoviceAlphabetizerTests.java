package com.comp301.a04junit;

import static org.junit.Assert.assertTrue;

import com.comp301.a04junit.alphabetizer.Alphabetizer;

import org.junit.Test;

import java.util.NoSuchElementException;

/**
 * Write tests for the Alphabetizer class here
 */
public class NoviceAlphabetizerTests {
    @Test
    public void testConstructor() {
        String[] testStr = new String[3];
        testStr[0] = "b1";
        testStr[1] = "a1";
        testStr[2] = "c1";
        Alphabetizer test = new Alphabetizer(testStr);
        String badStr = "d1";
        testStr[1] = badStr;
        for (int i = 0; i<3; i++) {
            assertTrue(test.next() != badStr);
        }
    }

    @Test
    public void testConstructorNull() {
        try {new Alphabetizer(null);} catch(IllegalArgumentException e) {assertTrue(true);}
    }

    @Test
    public void testNext() {
        String[] testStr = new String[3];
        testStr[0] = "b1";
        testStr[1] = "a1";
        testStr[2] = "c1";
        Alphabetizer test = new Alphabetizer(testStr);
        assertTrue(test.next() == "a1");
    }

    @Test
    public void testNextCapital() {
        String[] testStr = new String[3];
        testStr[0] = "B1";
        testStr[1] = "A1";
        testStr[2] = "C1";
        Alphabetizer test = new Alphabetizer(testStr);
        assertTrue(test.next() == "A1");
    }

    @Test
    public void testNextNoNext() {
        String[] testStr = new String[3];
        testStr[0] = "b1";
        testStr[1] = "a1";
        testStr[2] = "c1";
        Alphabetizer test = new Alphabetizer(testStr);
        for (int i = 0; i<=3; i++) {
        try {
            test.next();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
        }}
    }

    @Test
    public void testHasNext() {
        String[] testStr = new String[3];
        testStr[0] = "b1";
        testStr[1] = "a1";
        testStr[2] = "c1";
        Alphabetizer test = new Alphabetizer(testStr);
        for (int i = 0; i < 2; i++) {
            test.next();
            assertTrue(test.hasNext());
        }
        test.next();
        assertTrue(!test.hasNext());
    }
}
